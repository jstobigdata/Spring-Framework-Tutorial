package c.jbd.saop.at.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.context.annotation.Configuration;

@Configuration
@Aspect
public class ExceptionAspect {

  /**
   * Match with all dao methods.
   *
   * @param joinPoint
   * @param exception
   */
  @AfterThrowing(
      pointcut = "execution(* c.jbd.saop.at.dao.*.*(..))",
      throwing = "exception")
  public void logDaoExceptions(JoinPoint joinPoint, RuntimeException exception) {
    System.out.println("Exception at: " + joinPoint.getSignature().toShortString());
    System.out.println("Exception details: " + exception);
  }
}
