package com.jbd.saop.order.advice;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.annotation.Order;

@Aspect
@Configuration
@Order(0)
public class ZeroAdvice {

  @Before("CommonPointcut.anyDaoMethod()")
  public void beforeAdvice(JoinPoint joinPoint) {
    System.out.println("\n======= Inside @Before() - 0 =======");
    System.out.println(joinPoint.getSignature().toShortString());
  }

  @After("CommonPointcut.anyDaoMethod()")
  public void afterAdvice(JoinPoint joinPoint) {
    System.out.println("\n======= Inside @After() - 0 =======");
    System.out.println(joinPoint.getSignature().toShortString());
  }

  @AfterReturning(
    pointcut = "CommonPointcut.anyDaoMethod()",
    returning = "result")
  public void afterReturningAdvice(JoinPoint joinPoint, Object result) {
    System.out.println("\n======= Inside @AfterReturning() - 0 =======");
    System.out.println(joinPoint.getSignature().toShortString());
    System.out.println("result: " + result);
  }
}
