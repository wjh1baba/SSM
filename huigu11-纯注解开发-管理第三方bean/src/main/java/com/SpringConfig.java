package com;

import org.springframework.context.annotation.*;

@Configuration
@ComponentScan({"com.dao", "com"})
@Import(jdbcConfig.class)
public class SpringConfig {

}
