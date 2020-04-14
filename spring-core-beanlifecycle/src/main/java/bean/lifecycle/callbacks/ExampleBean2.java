package bean.lifecycle.callbacks;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Component;

@Component
public class ExampleBean2 implements InitializingBean, DisposableBean {

  @Override
  public void afterPropertiesSet() throws Exception {
    System.out.println("Initialization method of " + this.getClass().getName());
  }

  @Override
  public void destroy() throws Exception {
    System.out.println("Destroy method of " + this.getClass().getName());
  }
}
