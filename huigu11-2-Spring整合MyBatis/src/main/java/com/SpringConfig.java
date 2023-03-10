package com;

import org.springframework.context.annotation.*;

@Configuration
@ComponentScan({"com"})
@Import({jdbcConfig.class,MybatisConfig.class})
@PropertySource("classpath:jdbc.properties")
public class SpringConfig {

}
