package com.jsbd.propertysource;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.StringJoiner;

@Component
public class ConnectionManager {

  @Value("${app.database.url}")
  private String url;

  @Value("${app.database.username}")
  private String username;

  @Value("${app.database.password}")
  private String password;

  @Value("${no.value}")
  private String noValue;

  @Override
  public String toString() {
    return new StringJoiner(", ", ConnectionManager.class.getSimpleName() + "[", "]")
        .add("url='" + url + "'")
        .add("username='" + username + "'")
        .add("password='" + password + "'")
        .add("noValue='" + noValue +"'")
        .toString();
  }
}
