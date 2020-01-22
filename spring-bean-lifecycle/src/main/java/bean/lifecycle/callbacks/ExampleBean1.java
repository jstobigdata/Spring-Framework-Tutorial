package bean.lifecycle.callbacks;

public class ExampleBean1 {

  public void init() {
    System.out.println("Initialization method of " + this.getClass().getName());
  }

  public void destroy() {
    System.out.println("Destroy method of " + this.getClass().getName());
  }
}
