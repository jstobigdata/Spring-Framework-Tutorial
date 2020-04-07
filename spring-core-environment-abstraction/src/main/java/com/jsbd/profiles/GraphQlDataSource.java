package com.jsbd.profiles;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
@Profile("graphQl")
public class GraphQlDataSource implements DataSource {
  @Override
  public String getName() {
    return "GraphQlDataSource";
  }
}
