package core.bean.postprocessor;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestExampleBean {
  public static void main(String[] args) {

    ConfigurableApplicationContext context
        = new AnnotationConfigApplicationContext(ExampleConfig.class);
    context.getBean(ExampleBean.class);

    //This is important
    context.registerShutdownHook();
  }
}
