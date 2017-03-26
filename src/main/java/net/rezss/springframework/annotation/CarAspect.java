package net.rezss.springframework.annotation;


import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

import java.util.Random;

@Aspect
@Component
public class CarAspect
{
  @Pointcut(value = "execution(* net.rezss.springframework.model.Car.startEngine())")
  public void startEnginePointcut()
  {

  }

  @Pointcut(value = "execution(* net.rezss.springframework.model.Car.addFuel(..)) && args(litres)")
  public void addFuelPointcut(int litres)
  {

  }

  @Around("execution(* net.rezss.springframework.model.Car.startEngine())")
  public void aroundStartEngine(ProceedingJoinPoint joinPoint) throws Throwable
  {
    System.out.println("Try starting engine...");

    if (new Random().nextInt(100) < 50)
    {
      joinPoint.proceed();
      System.out.println("Engine started...");
      return;
    }

    System.out.println("Engine start failed.");

  }

  @Before("startEnginePointcut()")
  public void beforeStartEngine()
  {
    System.out.println("Before starting engine...");
  }

  @After("startEnginePointcut()")
  public void afterStartEngine()
  {
    System.out.println("After start engine...");
  }

  @Before(value = "addFuelPointcut(litres)")
  public void beforeAddFuel(int litres)
  {
    System.out.println("Before add fuel..." + litres);
  }

}
