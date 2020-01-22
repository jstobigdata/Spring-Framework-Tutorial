package basic.ioc.setter.annotation;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import java.util.UUID;

@Configuration
public class BasicIocSetterConfig {

  @Bean
  @Scope("prototype")
  public Item item() {
    return new Item();
  }

  @Bean
  @Scope("prototype")
  public Store store() {
    Store storeObj = new Store();
    storeObj.setId(UUID.randomUUID().toString());
    storeObj.setItem(this.item());
    return storeObj;
  }
}
