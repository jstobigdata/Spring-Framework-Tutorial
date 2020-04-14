package bean.start.stop.callbacks;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestLifecycleBean {
  public static void main(String[] args) {
    ConfigurableApplicationContext context
        = new AnnotationConfigApplicationContext(LifecycleExampleBean.class);

    context.start();
    context.getBean(LifecycleExampleBean.class);
    context.stop();
    context.start();
    //This is important - shutdown gracefully
    context.registerShutdownHook();
  }
}
