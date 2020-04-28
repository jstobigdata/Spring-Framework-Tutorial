package com.jbd.saop.after.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Service;

@Service
@Aspect
public class AllAfterAspects {

  @Pointcut("execution(* com.jbd.saop.after.dao.*.*(..))")
  private void allDaoMethods(){}

  @AfterThrowing(
      pointcut = "allDaoMethods()",
      throwing = "exception")
  public void logDaoExceptions(JoinPoint joinPoint, RuntimeException exception) {
    System.out.println("After Exception executed: "
        + joinPoint.getSignature().toShortString());
    System.out.println("Exception details: " + exception);
  }

  @After("allDaoMethods()")
  public void logResults(JoinPoint joinPoint){
    System.out.println("\nAfter advice executed: "
        + joinPoint.getSignature().toShortString());
  }
}
