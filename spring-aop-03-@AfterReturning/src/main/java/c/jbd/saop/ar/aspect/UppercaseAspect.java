package c.jbd.saop.ar.aspect;

import c.jbd.saop.ar.pojo.User;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.context.annotation.Configuration;

@Configuration
@Aspect
public class UppercaseAspect {

  /**
   * Uppercase advice for username.
   * @param joinPoint
   * @param result
   */
  @AfterReturning(
      pointcut = "c.jbd.saop.ar.aspect.DaoExpressions.findMethod()",
      returning = "result")
  public void uppercaseUsername(JoinPoint joinPoint, User result){
    System.out.println("After method - " +
        joinPoint.getSignature().toShortString());
    System.out.println("original result:" + result);
    if (result.getUsername() != null){
      result.setUsername(result.getUsername().toUpperCase());
    }
    System.out.println("final result: " + result);
  }
}
