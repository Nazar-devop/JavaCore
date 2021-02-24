package com.nazardevop.javacore.chapter3;

public class Long {
    public static void main(String[] args) {
        int lightspeed;
        long days;
        long seconds;
        long distance;

        lightspeed = 186000;
        days = 1000;
        seconds = days * 24 * 60 * 60;
        distance = lightspeed * seconds;

        System.out.print("Za " + days);
        System.out.print(" Дней свет пройдет около ");
        System.out.println(distance + " миль.");
    }
}
