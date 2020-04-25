package c.jbd.saop.ar;

import c.jbd.saop.ar.dao.UserRepository;
import c.jbd.saop.ar.pojo.User;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;

@SpringJUnitConfig(ApplicationConfig.class)
public class TestAfterReturning {

  @Autowired
  private UserRepository userRepository;

  @Test
  public void checkNull(){
    Assertions.assertNotNull(userRepository);
  }

  @Test
  public void testFindUser(){
    String username = "JsTobigdata";
    User user = userRepository.find(username);
    Assertions.assertEquals(user.getUsername(), username.toUpperCase());
    Assertions.assertNotEquals(user.getUsername(), username);
  }
}
