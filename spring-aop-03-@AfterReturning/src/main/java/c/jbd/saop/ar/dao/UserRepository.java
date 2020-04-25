package c.jbd.saop.ar.dao;

import c.jbd.saop.ar.pojo.User;
import org.springframework.stereotype.Repository;

//A very stupid demo repository
@Repository
public class UserRepository {

  //find an User
  public User find(String username) {
    if (username == null) {
      throw new RuntimeException("username is null", new NullPointerException());
    }
    return new User(username, "hello@world.com");
  }

  //Update an user
  public UserRepository update(String username, String email) {
    System.out.println("Update email: " + email);
    return this;
  }

  //Delete an user
  public boolean delete(String username) {
    if (username == null) {
      throw new RuntimeException("username is null", new NullPointerException());
    }
    System.out.println("User deleted: " + username);
    return true;
  }

}
