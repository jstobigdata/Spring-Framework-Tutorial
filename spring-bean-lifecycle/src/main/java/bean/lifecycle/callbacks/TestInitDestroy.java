package bean.lifecycle.callbacks;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestInitDestroy {
  public static void main(String[] args) {
    ConfigurableApplicationContext context
        = new AnnotationConfigApplicationContext(BLCConfigClass.class);

    //This is important
    context.registerShutdownHook();
  }
}
