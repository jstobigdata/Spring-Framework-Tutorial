package c.jbd.saop.gettingstarted.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * Getting started AppConfig.
 */
@Configuration
//Step-2 - Add the annotation
@EnableAspectJAutoProxy
@ComponentScan("c.jbd.saop.gettingstarted")
public class ApplicationConfig {
}
