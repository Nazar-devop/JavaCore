package com.nazardevop.javacore.chapter9;

public class A {
    public interface  NestedIF{
    boolean isNitNegative(int x);
    }
}
class B implements A.NestedIF{
    public boolean isNitNegative(int x){
        return x < 0 ? false : true;
    }
}
class NestedIFDemo{
    public static void main(String[] args) {
        A.NestedIF nif = new B();

        if (nif.isNitNegative(10))
            System.out.println("Число 10 не отрицатильное");
        if (nif.isNitNegative(-12))
            System.out.println("Ето не будет виведено");
    }
}
