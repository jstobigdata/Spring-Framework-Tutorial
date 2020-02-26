package basic.ioc.wiringfinetune;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@ComponentScan("basic.ioc.wiringfinetune")
@Configuration
public class ConfigWiring {

  //bean name = insurance1
  @Bean
  @Primary
  public Insurance insurance1(){
    Insurance healthInsurance = new Insurance();
    healthInsurance.setType("Health Insurance");
    return healthInsurance;
  }

  //bean name = insurance2
  @Bean
  public Insurance insurance2(){
    Insurance termInsurance = new Insurance();
    termInsurance.setType("Term Insurance");
    return termInsurance;
  }

  //bean name = insurance3
  @Bean
  @Qualifier("generalInsurance")
  public Insurance insurance3() {
    Insurance generalInsurance = new Insurance();
    generalInsurance.setType("General Insurance");
    return generalInsurance;
  }
}
