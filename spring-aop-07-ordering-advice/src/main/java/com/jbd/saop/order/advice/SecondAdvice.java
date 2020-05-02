package com.jbd.saop.order.advice;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.annotation.Order;

@Aspect
@Configuration
@Order(1)
public class SecondAdvice {

  @Before("CommonPointcut.anyDaoMethod()")
  public void beforeAdvice(JoinPoint joinPoint) {
    System.out.println("\n======= Inside @Before() - 1 =======");
    System.out.println(joinPoint.getSignature().toShortString());
  }

  @After("CommonPointcut.anyDaoMethod()")
  public void afterAdvice(JoinPoint joinPoint) {
    System.out.println("\n======= Inside @After() - 1 =======");
    System.out.println(joinPoint.getSignature().toShortString());
  }
}
