package com.jbd.spring;

import com.jbd.spring.fieldlevel.Person;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;

@SpringJUnitConfig(AppConfig.class)
public class TestNullSafety {

  @Autowired
  private Person person;

  @Test
  public void testNullSafety(){
    System.out.println(person.toString());
  }
}
