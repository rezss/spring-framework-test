package net.rezss.springframework;

import net.rezss.springframework.example.BankAccount;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class StealerAspect
{
  @Autowired
  private BankAccount schweizerNummernKnoto;

  @Around("execution(* net.rezss..*.BankAccount.insertMoney(..))")
  public Object stealMoney(ProceedingJoinPoint joinPoint) throws Throwable
  {
    if (joinPoint.getTarget().equals(schweizerNummernKnoto))
      return joinPoint.proceed();

    final double amount = (Double) joinPoint.getArgs()[0];
    System.out.printf("Klaue %.2f€\n", amount);
    schweizerNummernKnoto.insertMoney(amount);

    return true;
  }
}
