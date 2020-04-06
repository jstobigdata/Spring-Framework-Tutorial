package com.jsbd.propertysource;

import org.springframework.context.annotation.*;

@Configuration
@PropertySource("classpath:app.properties")
@ComponentScan("com.jsbd.propertysource")
//@ImportResource("classpth:${app.name}.xml")
public class AppConfig {

}
