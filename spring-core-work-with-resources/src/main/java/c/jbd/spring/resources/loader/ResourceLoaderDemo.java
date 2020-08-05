package c.jbd.spring.resources.loader;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.io.IOException;

public class ResourceLoaderDemo {
  public static void main(String[] args) throws IOException {

    ApplicationContext ctx = new AnnotationConfigApplicationContext(JbdResourceLoader.class);
    JbdResourceLoader loader = (JbdResourceLoader) ctx.getBean("jbdResourceLoader");
    loader.loadResource("classpath:sample.md");
    System.out.println("*** Resource loader using classpath ***");
  }
}
