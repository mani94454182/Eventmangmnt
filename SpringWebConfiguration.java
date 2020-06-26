package com.ems.app;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
//import org.springframework.stereotype.Component;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@Configuration
@ComponentScan(basePackages = "com.ems.app")
@EnableWebMvc //use for adding all web related functionality to Spring's  WebIoC container
public class SpringWebConfiguration {

}
