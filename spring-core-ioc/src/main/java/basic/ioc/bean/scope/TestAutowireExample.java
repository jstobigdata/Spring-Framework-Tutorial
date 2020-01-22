package basic.ioc.bean.scope;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestAutowireExample {
  public static void main(String[] args) {
    ApplicationContext context = new AnnotationConfigApplicationContext(AutowireBeanConfig.class);

    System.out.println(context.getBean(Store.class));
    System.out.println(context.getBean(Store.class));
  }
}
