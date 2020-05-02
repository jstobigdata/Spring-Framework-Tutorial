package com.jbd.saop.order.advice;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class CommonPointcut {

  @Pointcut("execution(* com.jbd.saop.order.dao.*.*(..))")
  public void anyDaoMethod() {}
}
