package basic.ioc.constructor.xml;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestXMLConstructorInjection {
  public static void main(String[] args) {
    ApplicationContext context = new ClassPathXmlApplicationContext("basic.ioc.constructor.bean-config.xml");
    System.out.println(context.getBean(Store.class));
  }
}
