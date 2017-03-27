package net.rezss.springframework;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class PointcutAspect
{
  @Pointcut("execution(* get*())")
  public void allGetMethods()
  {

  }

  @Pointcut("target(net.rezss.springframework.example.HelloWorldService)")
  public void helloWorldService()
  {

  }

  @Pointcut("within(net.rezss.springframework.example.HelloWorldService)")
  public void helloWorldWithin()
  {

  }

  @Pointcut("this(net.rezss.springframework.introduction.ProxyInterface)")
  public void helloWorldThis()
  {

  }

  @Before("allGetMethods() && helloWorldService()")
  public void targetAdvice()
  {
    System.out.println("Target Advice executed");
  }

  @Before("allGetMethods() && helloWorldWithin()")
  public void withinAdvice()
  {
    System.out.println("Within Advice executed");
  }

  @Before("allGetMethods() && helloWorldThis()")
  public void thisAdvice()
  {
    System.out.println("This Advice executed");
  }
}
