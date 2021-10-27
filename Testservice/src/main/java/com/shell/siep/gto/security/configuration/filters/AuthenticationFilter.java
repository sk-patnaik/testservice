package com.shell.siep.gto.security.configuration.filters;

import com.shell.siep.gto.persistence.datasource.FPCDataSourceRouting;
import com.shell.siep.gto.persistence.datasource.UserContextHolder;
import com.shell.siep.gto.security.pojos.UserDetailsImplementation;
import lombok.AccessLevel;
import lombok.experimental.FieldDefaults;
import org.apache.commons.lang3.StringUtils;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.web.authentication.AbstractAuthenticationProcessingFilter;
import org.springframework.security.web.util.matcher.RequestMatcher;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Optional;

@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
public class AuthenticationFilter extends AbstractAuthenticationProcessingFilter {

    private FPCDataSourceRouting fpcDataSourceRouting;

    public AuthenticationFilter(RequestMatcher requiresAuthenticationRequestMatcher, FPCDataSourceRouting fpcDataSourceRouting) {
        super(requiresAuthenticationRequestMatcher);
        this.fpcDataSourceRouting = fpcDataSourceRouting;
    }

    @Override
    public Authentication attemptAuthentication(HttpServletRequest request, HttpServletResponse response) {
        Authentication requestAuthentication = null;
        String token = Optional
                .ofNullable(
                        Optional
                                .ofNullable(request.getHeader("webaccesskey"))
                                .orElse(request.getParameter("webaccesskey"))
                )
                .map(v -> StringUtils.removeStart(v, "Bearer"))
                .map(String::trim)
                .orElseThrow(() -> new BadCredentialsException("Missing Authentication Token"));

        requestAuthentication = getAuthenticationManager().authenticate(new UsernamePasswordAuthenticationToken(token, token));
        return requestAuthentication;
    }

    @Override
    protected void successfulAuthentication(final HttpServletRequest request, final HttpServletResponse response,
                                            final FilterChain chain, final Authentication authResult) throws IOException, ServletException {
        super.successfulAuthentication(request, response, chain, authResult);
        UserDetailsImplementation userDetailsImplementation = (UserDetailsImplementation) authResult.getPrincipal();
        setUserDataSource(userDetailsImplementation.getUsername());
        chain.doFilter(request, response);
    }

    private void setUserDataSource(String user) {
        fpcDataSourceRouting.checkDataSource(user);
        UserContextHolder.setUserContext(user);
    }
}
