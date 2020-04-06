package basic.ioc.beanfactory;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import java.util.Random;
import java.util.UUID;

@Configuration
@ComponentScan("basic.ioc.autowire")
public class AutowireBeanConfig {

  @Bean
  @Scope("prototype")
  public Item item(){
    return new Item(
        new Random().nextLong(),
        UUID.randomUUID().toString()
    );
  }
}
