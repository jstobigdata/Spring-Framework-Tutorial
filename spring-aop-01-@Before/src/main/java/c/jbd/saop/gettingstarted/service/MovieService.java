package c.jbd.saop.gettingstarted.service;

import c.jbd.saop.gettingstarted.dao.ActorRepository;
import c.jbd.saop.gettingstarted.dao.MovieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MovieService {
  @Autowired
  private ActorRepository actorRepository;

  @Autowired
  private MovieRepository movieRepository;

  public void addMovie(String movieName, String... actors) {
    movieRepository.add(movieName);
    for (String actor : actors) {
      actorRepository.add(movieName);
    }
  }
}
