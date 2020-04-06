package com.jsbd.propertysource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;

@Component
public class AppLogger {

  @Autowired
  private Environment env;

  public void printLogLevel() {
    String logLevel = env.getProperty("app.log.level");
    System.out.println(logLevel);
  }
}
