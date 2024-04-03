package com.itacademy;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        Transport car = new Car ();
        Transport bus = new Bus();
        doSmth(car);
        doSmth(bus);
        Transport transport = getTransport(false);
        //________________________________________________________________
        Car mycar= new Car();
//      Signal car2 = new Car();
//      car2.volume();
        mycar.beepbeep();
        mycar.volume();
//
        Bus mybus = new Bus ();
        mybus.loadCapacity();
        mybus.numberOfSeats();
//
        AirPlane myplane = new AirPlane();
        myplane.fly();
        myplane.takeOffSpeed();

    }

    public static void doSmth (Transport transport)
    {
        transport.move();
    }
    public static Transport getTransport (boolean a)
    {
        if (a)
            return new Car();
        else
            return new Bus();
    }
}



