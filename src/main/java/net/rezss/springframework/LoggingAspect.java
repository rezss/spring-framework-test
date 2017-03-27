package net.rezss.springframework;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LoggingAspect
{
  @Before("target(net.rezss.springframework.example.HelloWorldService)")
  public void logging(JoinPoint joinPoint)
  {
    final Object[] args = joinPoint.getArgs();

    System.out.printf("[LOG] - [%s] - Method: %s\n",
      joinPoint.getSignature().getDeclaringTypeName(),
      joinPoint.getSignature().getName());

    if (args.length > 0)
    {
      final StringBuilder builder = new StringBuilder("Arguments:\n");
      for (final Object o : args)
      {
        builder.append(o.toString());
        builder.append('\n');
      }
    }
  }
}
