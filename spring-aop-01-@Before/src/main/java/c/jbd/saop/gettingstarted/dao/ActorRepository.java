package c.jbd.saop.gettingstarted.dao;

import org.springframework.stereotype.Repository;

@Repository
public class ActorRepository {
  //Add an actor
  public ActorRepository add(String actorName) {
    if (actorName == null) {
      throw new RuntimeException("actorName is null", new NullPointerException());
    }
    System.out.println("New Actor added: " + actorName);
    return this;
  }

  //Delete an actor
  public boolean delete(String actorName) {
    if (actorName == null) {
      throw new RuntimeException("actorName is null", new NullPointerException());
    }
    System.out.println("Actor deleted: " + actorName);
    return true;
  }
}
