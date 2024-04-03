package com.itacademy;

public class AirPlane extends Transport implements Fly{
    @Override
    public void fly(){System.out.println("Fly method");}

    public void takeOffSpeed () {System.out.println("Max take off speed= "+ maxspeed+"km");}
}
