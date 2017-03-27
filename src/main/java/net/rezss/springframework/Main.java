package net.rezss.springframework;

import net.rezss.springframework.example.HelloWorldService;
import net.rezss.springframework.introduction.ProxyInterface;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main
{
  public static void main(String[] args)
  {
    final ApplicationContext context = new ClassPathXmlApplicationContext("aop-config.xml");
    final HelloWorldService helloWorldService = (HelloWorldService) context.getBean("helloWorldService");

    System.out.println(helloWorldService.getMessage());
    System.out.println(helloWorldService.getBaseMessage());
    System.out.println(((ProxyInterface) helloWorldService).getProxyMessage());
  }
}
