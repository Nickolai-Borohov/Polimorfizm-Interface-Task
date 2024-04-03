package com.itacademy;

public class Car extends Transport implements Signal {

  @Override
  public void beepbeep() {System.out.println("beepbeep method");}
  @Override
  public void volume () {System.out.println("Beep-Beep volume= "+ decibels);}

@Override
  public void move()
{
  System.out.println("CarMove");
}
}
