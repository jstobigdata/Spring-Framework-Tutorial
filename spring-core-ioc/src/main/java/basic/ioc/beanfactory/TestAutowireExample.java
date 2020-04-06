package basic.ioc.beanfactory;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.annotation.AnnotatedBeanDefinition;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.core.io.Resource;

public class TestAutowireExample {
  public static void main(String[] args) {
    BeanFactory beanFactory = new AnnotationConfigApplicationContext(AutowireBeanConfig.class);

    System.out.println(beanFactory.getBean(Store.class));
  }
}
