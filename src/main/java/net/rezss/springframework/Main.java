package net.rezss.springframework;

import net.rezss.springframework.model.Car;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main
{
  public static void main(String[] args)
  {
    final ApplicationContext context = new ClassPathXmlApplicationContext("aop-config.xml");

    final Car car = context.getBean(Car.class);
    car.addFuel(20);
    car.startEngine();
    car.drive();
  }
}
