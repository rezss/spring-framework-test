package net.rezss.springframework.scan;

import net.rezss.springframework.beans.HelloWorldService;
import net.rezss.springframework.beans.HelloWorldServiceExtended;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.annotation.Resource;
import javax.inject.Inject;

@Component("helloWorldPrinter")
public class HelloWorldPrinter
{
  @Inject
  private HelloWorldService service;
  @Resource(name = "helloWorldServiceExtended")
  private HelloWorldServiceExtended hugo;

  public void print()
  {
    System.out.println(service.getMessage());
    System.out.println(hugo.getMessage());
  }

  @PostConstruct
  public void sayHello()
  {
    System.out.println("System Booted...");
  }

  @PreDestroy
  public void sayGoodby()
  {
    System.out.println("Shutdown System...");
  }
}
