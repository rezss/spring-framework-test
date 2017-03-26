package net.rezss.springframework.model;

import net.rezss.springframework.model.fuel.Kraftstoff;

public class Auto
{
  private Kraftstoff kraftstoff;
  private String name;

  public Kraftstoff getKraftstoff()
  {
    return kraftstoff;
  }

  public void setKraftstoff(Kraftstoff kraftstoff)
  {
    this.kraftstoff = kraftstoff;
  }

  public void setName(String name)
  {
    this.name = name;
  }

  @Override
  public String toString()
  {
    return String.format("name: %s, fuel: %s", name, kraftstoff);
  }

  public String getName()
  {
    return name;
  }
}
