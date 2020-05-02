package com.jbd.saop.order.dao;

import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Repository;

@Repository
public class EmailRepository {

  @Async
  public void sendRegistrationEmail(String email){
    System.out.println("Registration email will be sent to: " + email);
  }
}
