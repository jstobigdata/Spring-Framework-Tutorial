package c.jbd.saop.at.dao;

import org.springframework.stereotype.Repository;

//A very stupid demo repository
@Repository
public class UserRepository {
  //Add a user
  public UserRepository add(String username){
    if(username == null) {
      throw new RuntimeException("username is null", new NullPointerException());
    }
    System.out.println("New user added: " + username);
    return this;
  }

  //Update an user
  public UserRepository update(String username, String email) {
    System.out.println("Update email: " + email);
    return this;
  }

  //Delete an user
  public boolean delete(String username){
    if (username == null) {
      throw new RuntimeException("username is null", new NullPointerException());
    }
    System.out.println("User deleted: " + username);
    return true;
  }
}
