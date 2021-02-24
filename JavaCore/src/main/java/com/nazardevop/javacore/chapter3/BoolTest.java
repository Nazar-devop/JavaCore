package com.nazardevop.javacore.chapter3;

public class BoolTest {
    public static void main(String[] args) {
        boolean b;

        b = false;
        System.out.println("b равно: " + b);

        b = true;
        System.out.println("b равно: " + b);

        if (b) System.out.println("Етот код виполняеться.");
        b = false;
        if (b) System.out.println("Етот код не виполняеться.");

        System.out.println("10 > 9 равно " + (10>9));
    }
}
