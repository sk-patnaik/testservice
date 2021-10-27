package com.shell.siep.gto.security.configuration;

import com.shell.siep.gto.commons.UrlConstants;
import com.shell.siep.gto.persistence.datasource.FPCDataSourceRouting;
import com.shell.siep.gto.security.configuration.filters.AuthenticationFilter;
import com.shell.siep.gto.security.configuration.handlers.NoRedirectStrategy;
import com.shell.siep.gto.security.exceptions.SecurityConfigurationException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.web.AuthenticationEntryPoint;
import org.springframework.security.web.authentication.AbstractAuthenticationProcessingFilter;
import org.springframework.security.web.authentication.AnonymousAuthenticationFilter;
import org.springframework.security.web.authentication.HttpStatusEntryPoint;
import org.springframework.security.web.authentication.SimpleUrlAuthenticationSuccessHandler;
import org.springframework.security.web.util.matcher.AntPathRequestMatcher;
import org.springframework.security.web.util.matcher.OrRequestMatcher;
import org.springframework.security.web.util.matcher.RequestMatcher;

import static java.util.Objects.requireNonNull;

@EnableWebSecurity
public class ApplicationSecurity extends WebSecurityConfigurerAdapter {

    @Autowired
    private FPCDataSourceRouting fpcDataSourceRouting;

    private static final RequestMatcher PROTECTED_URLS = new AntPathRequestMatcher(UrlConstants.API_SECURED_URL + "/**");

    private static final RequestMatcher PUBLIC_URLS = new OrRequestMatcher(
            new AntPathRequestMatcher("/api/login/**"),
            new AntPathRequestMatcher("/error/**"),
            new AntPathRequestMatcher("/health/**"),
            new AntPathRequestMatcher("/actuator/**")
    );

    AuthenticationProvider tokenAuthProvider;

    ApplicationSecurity(final AuthenticationProvider tokenAuthProvider) {
        this.tokenAuthProvider = requireNonNull(tokenAuthProvider);
    }

    @Override
    public void configure(WebSecurity web) {
        web.ignoring().antMatchers(HttpMethod.OPTIONS, "/**");
        web.ignoring().requestMatchers(PUBLIC_URLS);
    }

    @Override
    protected void configure(AuthenticationManagerBuilder auth) {
        auth.authenticationProvider(tokenAuthProvider);
    }

    @Override
    protected void configure(HttpSecurity http) throws SecurityConfigurationException {
        try {

            http.sessionManagement()
                    .sessionCreationPolicy(SessionCreationPolicy.STATELESS)
                    .and()
                    .exceptionHandling()
                    .defaultAuthenticationEntryPointFor(forbiddenEntryPoint(), PROTECTED_URLS)
                    .and()
                    .authenticationProvider(tokenAuthProvider)
                    .addFilterBefore(getApplicationFilter(), AnonymousAuthenticationFilter.class)
                    .authorizeRequests()
                    .requestMatchers(PROTECTED_URLS).authenticated()
                    .and()
                    .cors()
                    .and()
                    .csrf().disable()
                    .formLogin().disable()
                    .logout().disable()
                    .httpBasic().disable();

        } catch (Exception e) {
            throw new SecurityConfigurationException("Exception when configuring security", e);
        }
    }

    public AbstractAuthenticationProcessingFilter getApplicationFilter() throws SecurityConfigurationException {
        AbstractAuthenticationProcessingFilter filter = new AuthenticationFilter(PROTECTED_URLS, fpcDataSourceRouting);
        filter.setRequiresAuthenticationRequestMatcher(PROTECTED_URLS);
        filter.setAllowSessionCreation(false);

        try {
            filter.setAuthenticationManager(authenticationManager());
            filter.setAuthenticationSuccessHandler(successHandler());
        } catch (Exception e) {
            throw new SecurityConfigurationException("Exception creating the AuthenticationManager", e);
        }

        return filter;
    }

    @Bean
    SimpleUrlAuthenticationSuccessHandler successHandler() {
        final SimpleUrlAuthenticationSuccessHandler successHandler = new SimpleUrlAuthenticationSuccessHandler();
        successHandler.setRedirectStrategy(new NoRedirectStrategy());
        return successHandler;
    }

    @Bean
    AuthenticationEntryPoint forbiddenEntryPoint() {
        return new HttpStatusEntryPoint(HttpStatus.FORBIDDEN);
    }
}
