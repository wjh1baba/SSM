package config;

import org.springframework.context.annotation.*;
import org.springframework.stereotype.Component;

import javax.sql.DataSource;

@Configuration
@ComponentScan({"dao","config"})
@Import(jdbcConfig.class)
public class SpringConfig {

}
