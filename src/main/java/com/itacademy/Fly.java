package com.itacademy;

public interface Fly {

    void fly();
    int maxspeed = 1000;
    default void takeOffSpeed () {}

}
