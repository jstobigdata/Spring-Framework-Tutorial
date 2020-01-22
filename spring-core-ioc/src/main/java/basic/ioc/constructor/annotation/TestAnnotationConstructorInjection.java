package basic.ioc.constructor.annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestAnnotationConstructorInjection {
  public static void main(String[] args) {
    ApplicationContext context = new AnnotationConfigApplicationContext(BasicIocConfig.class);
    Store store = context.getBean(Store.class);
    System.out.println(store);
  }
}
