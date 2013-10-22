package com.javabilities.demo.springconfig;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.view.InternalResourceViewResolver;


@Configuration
@EnableWebMvc
@ComponentScan(basePackages="com.javabilities.demo.controller")
public class WebConfig {
    private static final Logger logger = LoggerFactory.getLogger(WebConfig.class);

    @Bean
    public InternalResourceViewResolver viewResolver() {
        logger.trace("TRACE Level");
        logger.debug("DEBUG Level");
        logger.info("INFO Level");
        logger.warn("WARN Level");
        logger.error("ERROR Level");

        logger.info("WebConfig.viewResolver()");
        InternalResourceViewResolver resolver = new InternalResourceViewResolver();
        resolver.setPrefix("/WEB-INF/view/");
        resolver.setSuffix(".jsp");
        return resolver;
    }
}
