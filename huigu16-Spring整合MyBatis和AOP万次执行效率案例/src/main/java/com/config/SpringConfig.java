package com.config;

import org.springframework.context.annotation.*;

@Configuration
@ComponentScan({"com"})
@Import({jdbcConfig.class,MybatisConfig.class})
@PropertySource("classpath:jdbc.properties")
@EnableAspectJAutoProxy
public class SpringConfig {

}
