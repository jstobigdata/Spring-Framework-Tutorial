package c.jbd.saop.ar.pojo;

import java.util.StringJoiner;

//The User pojo
public class User {
  private String username;
  private String email;

  public User(String username, String email){
    this.email = email;
    this.username = username;
  }

  public String getUsername() {
    return username;
  }

  public User setUsername(String username) {
    this.username = username;
    return this;
  }

  public String getEmail() {
    return email;
  }

  public User setEmail(String email) {
    this.email = email;
    return this;
  }

  @Override
  public String toString() {
    return new StringJoiner(", ", User.class.getSimpleName() + "[", "]")
        .add("username='" + username + "'")
        .add("email='" + email + "'")
        .toString();
  }
}
