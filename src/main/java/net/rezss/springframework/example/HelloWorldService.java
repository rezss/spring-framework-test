package net.rezss.springframework.example;

import org.springframework.stereotype.Component;

@Component("helloWorldService")
public class HelloWorldService
{
  public String getMessage()
  {
    return "Hello Message!";
  }
}
