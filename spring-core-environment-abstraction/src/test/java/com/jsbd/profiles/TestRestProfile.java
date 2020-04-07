package com.jsbd.profiles;

import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;

@SpringJUnitConfig(ProfilesConfig.class)
@ActiveProfiles("rest")
public class TestRestProfile {

  @Autowired
  private DataSource dataSource;

  @Test
  public void testDataSource(){
    Assert.assertNotNull(dataSource);
    Assert.assertEquals(dataSource.getClass(), RestDataSource.class);
    System.out.println(dataSource.getClass());
  }
}
