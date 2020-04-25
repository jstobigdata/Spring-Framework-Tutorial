package c.jbd.saop.gettingstarted.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.context.annotation.Configuration;

@Configuration
@Aspect //Important to say this is a Aspect config class
public class BeforeAdvice {

  //execution(RETURN_TYPE PACKAGE.CLASS.METHOD(..PARAMETER_LIST))
  //execution(* PACKAGE.*.*(..))

  /**
   * Before Interceptor all Repository add() method.
   *
   * @param joinPoint
   */
  @Before("execution(* c.jbd.saop.gettingstarted.dao.*.add(..))")
  public void allRepoAddMethods(JoinPoint joinPoint) {
    System.out.println("Intercepted method: " + joinPoint);
    System.out.println("Arguments: " + joinPoint.getArgs()[0]);
    System.out.println(joinPoint.getTarget());
  }

  @Before("execution(* c.jbd.saop.gettingstarted.dao.*.*(..))")
  public void allClassAnyMethod(JoinPoint joinPoint) {
    System.out.println("Intercepted method: " + joinPoint);
    System.out.println("Arguments: " + joinPoint.getArgs()[0]);
    System.out.println(joinPoint.getTarget());
  }
}
