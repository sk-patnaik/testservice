package com.shell.siep.gto.services;

import com.shell.siep.gto.commons.UrlConstants;
import com.shell.siep.gto.controllers.SampleController;
import com.shell.siep.gto.security.pojos.ApplicationUser;
import com.shell.siep.gto.user.services.UserService;
import com.shell.siep.gto.vo.request.LoginRequest;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.client.AutoConfigureWebClient;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@AutoConfigureWebClient
@RunWith(SpringRunner.class)
@WebMvcTest(value = SampleController.class)
public class MultiUserAccessTest {

    private static final String DATA = "$.data";
    private static final String STATUS = "$.status";
    private static final String PASSWORD = "demopassword";
    private static final String VALID_USER = "p.poranski";
    private static final String INVALID_USER = "r.kathiravan";
    private static final String WEB_ACCESS_KEY = "webaccesskey";
    private static final String REQUEST_JSON = "{ \"databases\": [\"FPC\"], \"wellIds\": [ \"FPCW_6434\" ] }";

    @Autowired
    private MockMvc mvc;

    @Autowired
    private UserService userService;


    @Test
    public void testGetAuthToken() {
        String webAccessKey = getAuthToken(VALID_USER, PASSWORD);
        assert (webAccessKey != null);
    }

    @Test
    public void testPermissionsValid() throws Exception {
        String webAccessKey = getAuthToken(VALID_USER, PASSWORD);

        mvc.perform(MockMvcRequestBuilders
                .post(UrlConstants.GET_SAMPLES_FROM_REQUEST)
                .contentType(MediaType.APPLICATION_JSON)
                .content(REQUEST_JSON)
                .header(WEB_ACCESS_KEY, webAccessKey)
                .accept(MediaType.APPLICATION_JSON))
                .andDo(print())
                .andExpect(status().isOk())
                .andExpect(jsonPath(STATUS).value(200))
                .andExpect(jsonPath(DATA).exists())
                .andExpect(jsonPath(DATA).isNotEmpty());
    }

    @Test
    public void testPermissionsInvalid() throws Exception {
        String webAccessKey = getAuthToken(INVALID_USER, PASSWORD);

        mvc.perform(MockMvcRequestBuilders
                .post(UrlConstants.GET_SAMPLES_FROM_REQUEST)
                .contentType(MediaType.APPLICATION_JSON)
                .content(REQUEST_JSON)
                .header(WEB_ACCESS_KEY, webAccessKey)
                .accept(MediaType.APPLICATION_JSON))
                .andDo(print())
                .andExpect(status().isOk())
                .andExpect(jsonPath(STATUS).value(200))
                .andExpect(jsonPath(DATA).exists())
                .andExpect(jsonPath(DATA).isEmpty());
    }

    @Test
    public void testPermissionsInvalidWebAccessKey() throws Exception {
        mvc.perform(MockMvcRequestBuilders
                .post(UrlConstants.GET_SAMPLES_FROM_REQUEST)
                .contentType(MediaType.APPLICATION_JSON)
                .content(REQUEST_JSON)
                .header(WEB_ACCESS_KEY, "blaa")
                .accept(MediaType.APPLICATION_JSON))
                .andDo(print())
                .andExpect(status().isUnauthorized());
    }

    @Test
    public void testPermissionsNoWebAccessKey() throws Exception {
        mvc.perform(MockMvcRequestBuilders
                .post(UrlConstants.GET_SAMPLES_FROM_REQUEST)
                .contentType(MediaType.APPLICATION_JSON)
                .content(REQUEST_JSON)
                .accept(MediaType.APPLICATION_JSON))
                .andDo(print())
                .andExpect(status().isUnauthorized());
    }

    private String getAuthToken(String username, String password) {
        LoginRequest loginRequest = new LoginRequest();
        loginRequest.setUsername(username);
        loginRequest.setPassword(password);
        ApplicationUser user = userService.authenticateUser(loginRequest);
        return user.getWebaccesskey();
    }

}
