package basic.ioc.constructor.annotation;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import java.util.UUID;

@Configuration
public class BasicIocConfig {

  @Bean
  @Scope("prototype")
  public Item item() {
    return new Item();
  }

  @Bean
  @Scope("prototype")
  public Store store() {
    return new Store(
        UUID.randomUUID().toString(), this.item()
    );
  }

}
