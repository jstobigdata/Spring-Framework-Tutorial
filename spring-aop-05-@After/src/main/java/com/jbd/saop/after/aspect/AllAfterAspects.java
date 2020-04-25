package com.jbd.saop.after.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Service;

@Service
@Aspect
public class AllAfterAspects {

  @AfterThrowing(
      pointcut = "execution(* c.jbd.saop.at.dao.*.*(..))",
      throwing = "exception")
  public void logDaoExceptions(JoinPoint joinPoint, RuntimeException exception) {
    System.out.println("Exception at: " + joinPoint.getSignature().toShortString());
    System.out.println("Exception details: " + exception);
  }
}
