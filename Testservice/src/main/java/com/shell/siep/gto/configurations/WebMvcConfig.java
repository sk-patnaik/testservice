package com.shell.siep.gto.configurations;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.datatype.hibernate5.Hibernate5Module;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;
import org.springframework.web.method.support.HandlerMethodArgumentResolver;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import java.util.List;

@ComponentScan(basePackages = {"com.shell.*"})
@Configuration
public class WebMvcConfig implements WebMvcConfigurer {

    @Autowired
    private HandlerMethodArgumentResolver currentUserHandlerMethodArgumentResolver;

    @Override
    public void extendMessageConverters(List<HttpMessageConverter<?>> converters) {
        for (HttpMessageConverter<?> converter : converters) {
            if (converter instanceof org.springframework.http.converter.json.MappingJackson2HttpMessageConverter) {
                jacksonMessageConverter((MappingJackson2HttpMessageConverter) converter);
            }
        }
    }

    private void jacksonMessageConverter(MappingJackson2HttpMessageConverter converter) {
        ObjectMapper mapper = converter.getObjectMapper();
        mapper.registerModule(new Hibernate5Module());
        converter.setObjectMapper(mapper);
    }

    @Override
    public void addArgumentResolvers(List<HandlerMethodArgumentResolver> argumentResolvers) {
        argumentResolvers.add(currentUserHandlerMethodArgumentResolver);
    }
}
