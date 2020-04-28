package com.jbd.saop.around;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@ComponentScan("com.jbd.saop.around")
@EnableAspectJAutoProxy
public class ApplicationConfig {
}
