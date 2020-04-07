package com.jsbd.profiles;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ProfilesApp {
  public static void main(String[] args) {
    AnnotationConfigApplicationContext context
        = new AnnotationConfigApplicationContext();
    context.getEnvironment().setActiveProfiles("graphQl");
    context.register(ProfilesConfig.class);
    context.refresh();
    DataSource  dataSource = context.getBean(DataSource.class);
    System.out.println(dataSource.getClass());
  }
}
