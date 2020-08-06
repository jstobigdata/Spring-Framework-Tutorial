package com.jbd.sc.importannotation;

import com.jbd.sc.items.offline.OfflineOrderProcessor;
import com.jbd.sc.items.offline.OfflineStoreConfig;
import com.jbd.sc.items.online.OnlineOrderProcessor;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.ImportResource;

@Configuration
@Import(OfflineStoreConfig.class)
@ImportResource("classpath:online-store-config.xml")
public class ApplicationConfig {

  public static void main(String[] args) {
    ApplicationContext context
      = new AnnotationConfigApplicationContext(ApplicationConfig.class);

    context.getBean(OfflineOrderProcessor.class).processOrder("Book");
    context.getBean(OnlineOrderProcessor.class).processOrder("Mobile Phone");
  }
}
