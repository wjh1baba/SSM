package com.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

//spring配置文件
@Configuration
@ComponentScan("com")
@EnableWebMvc
public class SpringMvcCongit {
}
