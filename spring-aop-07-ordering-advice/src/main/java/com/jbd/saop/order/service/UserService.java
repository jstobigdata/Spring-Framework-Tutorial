package com.jbd.saop.order.service;

import com.jbd.saop.order.dao.EmailRepository;
import com.jbd.saop.order.dao.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
  @Autowired
  private UserRepository userRepository;

  @Autowired
  private EmailRepository emailRepository;

  public void registerUser(String username, String email, String password) {
    userRepository.add(username, password);
    userRepository.update(username, email);
    emailRepository.sendRegistrationEmail(email);
  }
}
