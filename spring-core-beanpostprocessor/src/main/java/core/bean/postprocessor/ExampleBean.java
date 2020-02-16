package core.bean.postprocessor;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
public class ExampleBean {

  @PostConstruct
  public void initData() {
    System.out.println("Your custom initialization code goes here...");
  }

  @PreDestroy
  public void clearData() {
    System.out.println("Your custom destroy code goes here...");
  }
}
