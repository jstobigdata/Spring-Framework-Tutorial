package com.jbd.saop.after;

import com.jbd.saop.after.dao.UserRepository;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;

@SpringJUnitConfig(ApplicationConfig.class)
public class TestAfter{

  @Autowired
  private UserRepository userRepository;

  @Test
  public void notNull() {
    Assertions.assertNotNull(userRepository);
  }

  @Test
  public void testThrows() {
    //Assert exception
    Assertions.assertThrows(RuntimeException.class, () -> {
      userRepository.add(null);
      userRepository.delete(null);
    });

    //Assert exception
    Assertions.assertDoesNotThrow(() -> {
      userRepository.delete("alexa");
    });
  }

  @Test
  public void testAfter(){}
  
}
