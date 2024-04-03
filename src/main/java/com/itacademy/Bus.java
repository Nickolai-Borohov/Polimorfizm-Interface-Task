package com.itacademy;

public class Bus extends Transport implements LoadCapacity {

    @Override
    public void loadCapacity () { System.out.println("Bus Load Capacity method"); }
    @Override
    public void numberOfSeats () {System.out.println("Number of seats="+ busNumberOfSeats);}

    @Override
    public void move ()
{
    System.out.println("Bus");
}
}
