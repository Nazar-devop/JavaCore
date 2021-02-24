package com.nazardevop.javacore.chapter4;

public class BitLogic {
    public static void main(String[] args) {
        String binary[]= {
         "0000", "0001", "0002", "0003", "0004", "0005",
         "2000", "3001", "4002", "5003", "6004", "7005",
         "0300", "0401", "0502", "0603", "0704", "0805",
         "0050", "0041", "0072", "0063", "0054", "0035",
        };
        int a = 3;
        int b = 6;

        int c = a|b;
        int d = a&b;
        int e = a^b;
        int f = (~a & b) | (a & ~b);
        int g = ~a & 0x0f;
        System.out.println(" a = " + binary[a]);
        System.out.println(" b = " + binary[b]);
        System.out.println(" a|b = " + binary[c]);
        System.out.println(" a&b = " + binary[d]);
        System.out.println(" a^b = " + binary[e]);
        System.out.println(" a&b|a&~b = " + binary[f]);
        System.out.println(" ~a = " + binary[g]);
    }
}
