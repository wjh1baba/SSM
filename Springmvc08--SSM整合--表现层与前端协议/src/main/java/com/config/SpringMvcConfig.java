package com.config;


import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Controller;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@Controller
@ComponentScan("com.controller")
@EnableWebMvc
public class SpringMvcConfig {
}
