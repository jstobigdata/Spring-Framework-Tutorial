package com.jsbd.profiles;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
@Profile({"rest", "default"})
public class RestDataSource implements DataSource {

  //Logic to fetch data from API
  @Override
  public String getName() {
    return "RestDataSource";
  }
}
