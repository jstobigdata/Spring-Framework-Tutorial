package com.jbd.saop.around.advice;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.context.annotation.Configuration;

import java.time.LocalTime;

@Configuration
@Aspect
public class ExecutionTimeLogger {

  @Around("@annotation(com.jbd.saop.around.ExecutionTime)")
  public Object logExecTime(ProceedingJoinPoint pJoinPoint){
    System.out.println("Before method: "
        + pJoinPoint.getSignature().toShortString());
    long beforeTime = System.currentTimeMillis();
    Object result = null;
    try {
       result = pJoinPoint.proceed();//Important
      //If method throws Exception or any error occurs
    } catch (Throwable throwable) {
      throwable.printStackTrace();
    }
    long afterTime = System.currentTimeMillis();
    System.out.println("Time taken to execute: "
        + (afterTime - beforeTime) + "ms");
    return result;
  }
}
