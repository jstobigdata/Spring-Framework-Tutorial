package bean.jsr.callbacks;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
public class JsrExampleBean {

  @PostConstruct
  public void initCacheData() {
    System.out.println("Your custom initialization code goes here...");
  }

  @PreDestroy
  public void clearCacheData() {
    System.out.println("Your custom destroy code goes here...");
  }
}
