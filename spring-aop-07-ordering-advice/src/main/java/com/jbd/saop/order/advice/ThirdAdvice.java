package com.jbd.saop.order.advice;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.annotation.Order;

@Configuration
@Aspect
@Order(2)
public class ThirdAdvice {

  @Around("CommonPointcut.anyDaoMethod()")
  public Object aroundAdvice(ProceedingJoinPoint pJoinPoint) throws Throwable {
    System.out.println("\n======= Inside @Around() - 2 =======");
    System.out.println(pJoinPoint.getSignature().toShortString());
    Object result = pJoinPoint.proceed();
    System.out.println("\n======= Inside @Around() - 2 =======");
    return result;
  }
}
