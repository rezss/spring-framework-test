package net.rezss.springframework.annotation;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class MonitoringAspect
{
  @Pointcut("execution(* *(..))")
  private void all()
  {

  }

  @Around("all()")
  public Object printParameterAndReturnValues(ProceedingJoinPoint joinPoint) throws Throwable
  {
    System.out.println("Class: " + joinPoint.getTarget().getClass());
    System.out.println("Method: " + joinPoint.getSignature().getName());
    System.out.println("Arguments:");
    for (Object arg : joinPoint.getArgs())
      System.out.print(arg + " / ");

    final Object retValue = joinPoint.proceed();
    System.out.println("\nReturn: " + retValue);

    return retValue;
  }
}
