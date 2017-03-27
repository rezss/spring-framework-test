package net.rezss.springframework;

import net.rezss.springframework.example.BankAccount;
import net.rezss.springframework.example.HelloWorldService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main
{
  public static void main(String[] args)
  {
    final ApplicationContext context = new ClassPathXmlApplicationContext("aop-config.xml");
    final HelloWorldService helloWorldService = (HelloWorldService) context.getBean("helloWorldService");

    final BankAccount bankAccount = (BankAccount) context.getBean("bankAccount");
    bankAccount.setAccountID(4);
    bankAccount.insertMoney(200);

    helloWorldService.getMessage();
  }
}
