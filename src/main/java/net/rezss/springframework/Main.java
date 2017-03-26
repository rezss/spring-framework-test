package net.rezss.springframework;

import net.rezss.springframework.model.Auto;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main
{
  public static void main(String[] args)
  {
    final ApplicationContext context = new ClassPathXmlApplicationContext("di-config.xml");
    final Auto a3 = (Auto) context.getBean("A3");
    System.out.println(a3);
  }
}
