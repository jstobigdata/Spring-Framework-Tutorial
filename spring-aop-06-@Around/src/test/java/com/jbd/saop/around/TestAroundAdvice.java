package com.jbd.saop.around;

import com.jbd.saop.around.dao.UserRepository;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;

@SpringJUnitConfig(ApplicationConfig.class)
public class TestAroundAdvice {
  @Autowired
  private UserRepository userRepository;

  @Test
  public void testNull(){
    Assertions.assertNotNull(userRepository);
  }

  @Test
  public void testAddUser() throws InterruptedException {
    userRepository.add("sample_username");
  }

  @Test
  public void testAddUserFailure() throws InterruptedException {
    userRepository.add(null);
  }
}
