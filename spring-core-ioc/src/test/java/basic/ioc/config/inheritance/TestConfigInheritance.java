package basic.ioc.config.inheritance;

import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestConfigInheritance {

  @Test
  public void testBeanConfigInheritance(){
  ApplicationContext aContext
      = new ClassPathXmlApplicationContext("basic.ioc.bean-config.inheritance.xml");

  Author author = aContext.getBean(Author.class);
  BookAuthor bookAuthor = aContext.getBean(BookAuthor.class);
  System.out.println(author);
  System.out.println(bookAuthor);
  }
}
