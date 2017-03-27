package net.rezss.springframework.example;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("bankAccount")
@Scope("prototype")
public class BankAccount
{
  private int id;
  private double balance;

  public void setAccountID(int id)
  {
    this.id = id;
  }

  public void insertMoney(double amount)
  {
    this.balance += amount;
    System.out.printf("Es wurde %.2f€ auf %d eingezahlt\n", amount, id);
  }

  @Override
  public boolean equals(Object obj)
  {
    return ((BankAccount)obj).id == id;
  }
}
