package net.rezss.springframework.example;

import org.springframework.stereotype.Component;

@Component("helloWorldService")
public class HelloWorldService extends HelloWorldBase
{
  public String getMessage()
  {
    return "Hello Message!";
  }
}
