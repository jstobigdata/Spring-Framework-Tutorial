package bean.lifecycle.callbacks;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("bean.lifecycle.callbacks")
public class BLCConfigClass {

  @Bean(initMethod = "init", destroyMethod = "destroy")
  public ExampleBean1 exampleBean1() {
    return new ExampleBean1();
  }
}
