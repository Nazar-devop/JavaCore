package com.nazardevop.javacore.chapter5;

public class SampleSwitch {
    public static void main(String[] args) {
        for (int i = 0; i < 6; i++) {
            switch (i) {
                case  0:
                    System.out.println(" і равно нулю.");
                    break;
                case  1:
                    System.out.println(" і равно 1.");
                    break;
                case  2:
                    System.out.println(" і равно 2.");
                    break;
                case  3:
                    System.out.println(" і равно 3.");
                    break;
                default:
                    System.out.println(" і больше трех");
            }
        }
    }
}
