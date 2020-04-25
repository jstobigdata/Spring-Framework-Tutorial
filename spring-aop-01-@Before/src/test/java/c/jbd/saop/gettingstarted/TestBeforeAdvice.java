package c.jbd.saop.gettingstarted;

import c.jbd.saop.gettingstarted.config.ApplicationConfig;
import c.jbd.saop.gettingstarted.dao.ActorRepository;
import c.jbd.saop.gettingstarted.dao.MovieRepository;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;

@SpringJUnitConfig(ApplicationConfig.class)
public class TestBeforeAdvice {

  @Autowired
  private ActorRepository actorRepository;

  @Autowired
  private MovieRepository movieRepository;

  @Test
  public void notNull() {
    Assertions.assertNotNull(actorRepository);
    Assertions.assertNotNull(movieRepository);
  }

  @Test
  public void testAddAspects() {
    actorRepository.add("Hrithik Roshan");
    movieRepository.add("Sholey");
  }

  @Test
  public void testDeleteAspects() {
    actorRepository.delete("John Doe");
    movieRepository.delete("Abc");
  }
}
