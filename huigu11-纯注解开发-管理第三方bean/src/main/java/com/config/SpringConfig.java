package com.config;

import org.springframework.context.annotation.*;

@Configuration
@ComponentScan({"dao", "com.config"})
@Import(jdbcConfig.class)
public class SpringConfig {

}
