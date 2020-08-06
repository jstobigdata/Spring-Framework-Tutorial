package com.jbd.sc.items.offline;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class OfflineStoreConfig {

  @Bean
  public OfflineOrderProcessor offlineOrderProcessor() {
    return new OfflineOrderProcessor();
  }
}
