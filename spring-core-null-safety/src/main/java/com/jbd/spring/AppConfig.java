package com.jbd.spring;

import com.jbd.spring.fieldlevel.Person;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.jbd.spring.nullsafety")
public class AppConfig {
  @Bean
  public Person person(){
    return new Person(100L, null,null);
  }
}
