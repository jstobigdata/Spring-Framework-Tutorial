package bean.dfault.callbacks;

import org.springframework.stereotype.Component;

@Component
public class MyServiceB implements LifecycleBean {

  @Override
  public void init() {
    System.out.println("Initialization method of " + this.getClass().getName());
  }

  @Override
  public void destroy() {
    System.out.println("Destroy method of " + this.getClass().getName());
  }
}
