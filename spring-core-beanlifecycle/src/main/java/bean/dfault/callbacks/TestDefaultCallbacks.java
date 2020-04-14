package bean.dfault.callbacks;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestDefaultCallbacks {
  public static void main(String[] args) {
    ConfigurableApplicationContext context
        = new ClassPathXmlApplicationContext("bean.default.lifecycle.xml");

    //This is important
    context.registerShutdownHook();
  }
}
