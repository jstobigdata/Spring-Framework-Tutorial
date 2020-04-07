package com.jsbd.profiles;

import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;

@SpringJUnitConfig(ProfilesConfig.class)
public class TestDefaultProfile {
  @Autowired
  private DataSource dataSource;

  @Test
  public void testDefaultProfile() {
    Assert.assertNotNull(dataSource);
    Assert.assertEquals(dataSource.getClass(), RestDataSource.class);
  }
}
