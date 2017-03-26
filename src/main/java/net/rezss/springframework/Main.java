package net.rezss.springframework;

import net.rezss.springframework.scan.HelloWorldPrinter;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

public class Main
{
  public static void main(String[] args)
  {
    final AbstractApplicationContext context = new AnnotationConfigApplicationContext(SpringConfiguration.class);
    final HelloWorldPrinter printer = (HelloWorldPrinter) context.getBean("helloWorldPrinter");
    printer.print();
    context.registerShutdownHook();
  }
}
