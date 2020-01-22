package basic.ioc.setter.annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestAnnotationSetterInjection {
  public static void main(String[] args) {
    ApplicationContext context
        = new AnnotationConfigApplicationContext(BasicIocSetterConfig.class);
    Store store = context.getBean(Store.class);
    System.out.println(store);
  }
}
