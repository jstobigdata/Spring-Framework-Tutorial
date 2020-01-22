package basic.ioc.setter.xml;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestXmlSetterInjection {
  public static void main(String[] args) {
    ApplicationContext context
        = new ClassPathXmlApplicationContext("basic.ioc.setter.bean-config.xml");
    Store store = context.getBean(Store.class);
    System.out.println(store);
  }
}