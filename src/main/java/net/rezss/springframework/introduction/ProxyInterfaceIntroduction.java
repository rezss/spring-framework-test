package net.rezss.springframework.introduction;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.DeclareParents;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class ProxyInterfaceIntroduction
{
  @DeclareParents(value = "net.rezss.springframework.example.HelloWorldService",
    defaultImpl = ProxyInterfaceImpl.class)
  public ProxyInterface proxyInterface;
}
