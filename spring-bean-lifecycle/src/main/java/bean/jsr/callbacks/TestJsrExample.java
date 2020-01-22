package bean.jsr.callbacks;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestJsrExample {
  public static void main(String[] args) {

    ConfigurableApplicationContext context
        = new AnnotationConfigApplicationContext(JsrExampleConfig.class);
    context.getBean(JsrExampleBean.class);

    //This is important
    context.registerShutdownHook();
  }
}
