package com.jsbd.propertysource;

    import org.springframework.context.ApplicationContext;
    import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestClass {
  public static void main(String[] args) {
    ApplicationContext context
        = new AnnotationConfigApplicationContext(AppConfig.class);
    System.out.println(context.getBean(ConnectionManager.class));

    context.getBean(AppLogger.class).printLogLevel();
  }
}
