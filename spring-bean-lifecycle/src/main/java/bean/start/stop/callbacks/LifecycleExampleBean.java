package bean.start.stop.callbacks;

import org.springframework.context.Lifecycle;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Component
public class LifecycleExampleBean implements Lifecycle {
  private boolean status = false;

  @Override
  public void start() {
    System.out.println("Inside the LifeCycle start method");
    this.status = true;
  }

  @Override
  public void stop() {
    System.out.println("Inside the LifeCycle stop method");
    this.status = false;
  }

  @Override
  public boolean isRunning() {
    return this.status;
  }

  /*@EventListener
  public void onAppEvent(ContextRefreshedEvent event) {
    System.out.println(event.getSource());
  }*/
}
