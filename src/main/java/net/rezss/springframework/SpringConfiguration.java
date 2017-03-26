package net.rezss.springframework;

import net.rezss.springframework.beans.HelloWorldService;
import net.rezss.springframework.beans.HelloWorldServiceExtended;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("net.rezss.springframework.scan")
public class SpringConfiguration
{
  @Bean(name = "helloWorldService")
  public HelloWorldService helloWorldService()
  {
    return new HelloWorldService();
  }

  @Bean(name = "helloWorldServiceExtended")
  public HelloWorldServiceExtended helloWorldServiceExtended()
  {
    return new HelloWorldServiceExtended();
  }
}
