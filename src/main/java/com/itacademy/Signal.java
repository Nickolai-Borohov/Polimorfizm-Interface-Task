package com.itacademy;

public interface Signal {
    int decibels =100;
    void beepbeep ();

    default void volume () {}  // дефолтный метод
}
