package c.jbd.saop.cjp;

import c.jbd.saop.cjp.dao.UserRepository;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;

@SpringJUnitConfig(ApplicationConfig.class)
public class TestAnalytics {

  @Autowired
  UserRepository userRepository;

  @Test
  public void notNull(){
    Assertions.assertNotNull(userRepository);
  }

  @Test
  public void testAddUser(){
    userRepository.add("Alexa");
  }

  @Test
  public void testUpdateUser(){
    userRepository.update("Alexa", "alexa@aws.com");
  }
}
