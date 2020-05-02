package com.jbd.saop.order;

import com.jbd.saop.order.dao.UserRepository;
import com.jbd.saop.order.service.UserService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;

@SpringJUnitConfig(ApplicationConfig.class)
public class TestAdviceOrdering {

  @Autowired
  private UserService userService;

  @Autowired
  private UserRepository userRepository;

  @Test
  public void testAddUser() {
    userRepository.add("abc", "abc@123");
  }

  @Test
  public void testRegUser() {
    userService.registerUser("abc", "abc@jbd.com", "abc@123");
  }
}
