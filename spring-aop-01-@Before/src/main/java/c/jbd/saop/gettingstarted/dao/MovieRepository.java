package c.jbd.saop.gettingstarted.dao;

import org.springframework.stereotype.Repository;

@Repository
public class MovieRepository {
  //Add a movie method
  public MovieRepository add(String movieName) {
    if (movieName == null) {
      throw new RuntimeException("movieName is null", new NullPointerException());
    }
    System.out.println("New movie added: " + movieName);
    return this;
  }

  //Delete a movie
  public boolean delete(String movieName) {
    if (movieName == null) {
      throw new RuntimeException("movieName is null", new NullPointerException());
    }
    System.out.println("Movie deleted: " + movieName);
    return true;
  }
}
