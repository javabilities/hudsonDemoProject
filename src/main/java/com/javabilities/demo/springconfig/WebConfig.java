package com.javabilities.demo.springconfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.view.InternalResourceViewResolver;


@Configuration
@EnableWebMvc
@ComponentScan(basePackages="com.javabilities.demo.controller")
public class WebConfig {
    @Bean
    public InternalResourceViewResolver viewResolver() {
        String blah;
        blah = "dog";
//        log.info("WebConfig.viewResolver()");
        System.out.println("HERE!!!");
        InternalResourceViewResolver resolver = new InternalResourceViewResolver();
        resolver.setPrefix("/WEB-INF/view/");
        resolver.setSuffix(".jsp");
        return resolver;
    }
}
