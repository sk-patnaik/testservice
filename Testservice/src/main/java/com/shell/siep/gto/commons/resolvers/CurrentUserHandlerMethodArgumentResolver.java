package com.shell.siep.gto.commons.resolvers;

import com.shell.siep.gto.security.interfaces.ActiveUser;
import com.shell.siep.gto.security.pojos.ApplicationUser;
import com.shell.siep.gto.user.services.UserService;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.MethodParameter;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.support.WebArgumentResolver;
import org.springframework.web.bind.support.WebDataBinderFactory;
import org.springframework.web.context.request.NativeWebRequest;
import org.springframework.web.method.support.HandlerMethodArgumentResolver;
import org.springframework.web.method.support.ModelAndViewContainer;

import java.util.Optional;

@Component("currentUserHandlerMethodArgumentResolver")
public class CurrentUserHandlerMethodArgumentResolver implements HandlerMethodArgumentResolver {

	@Autowired
	private UserService userServices;

	@Override
	public boolean supportsParameter(MethodParameter parameter) {
		return (parameter.getParameterAnnotation(ActiveUser.class) != null
				&& parameter.getParameterType().equals(ApplicationUser.class));
	}

	@Override
	public Object resolveArgument(MethodParameter methodParameter, ModelAndViewContainer mavContainer,
			NativeWebRequest webRequest, WebDataBinderFactory binderFactory) throws Exception {
		ApplicationUser user = null;
		if (methodParameter.getParameterAnnotation(ActiveUser.class) != null) {
			String authKey = Optional
									.ofNullable(Optional.ofNullable(webRequest.getHeader("webaccesskey"))
									.orElse(webRequest.getParameter("webaccesskey")))
									.map(v -> StringUtils.removeStart(v, "Bearer"))
									.map(String::trim)
									.orElseThrow(() -> new BadCredentialsException("Missing Authentication Token"));

			Optional<ApplicationUser> userOpt = Optional
						.ofNullable(userServices.findByToken(authKey))
						.orElseThrow(() -> new UsernameNotFoundException("Cannot find user with authentication token=" + authKey));
			user = userOpt.isPresent() ? userOpt.get() : null;
		}
		return user != null ? user : WebArgumentResolver.UNRESOLVED;

	}
}
