package com.nazardevop.javacore.chapter7;

public class OverloadDemo {
    void test(){
        System.out.println("Параметри отсутствуют");
    }
    void  test (int a){
        System.out.println("a: " + a);
    }
    void test (int a, int b){
        System.out.println("a i b: " + a + " " + b);
    }
    double test ( double a){
        System.out.println("double a: " + a);
        return a*a;
    }

    static class Overload {
        public static void main(String[] args) {
            OverloadDemo ob = new OverloadDemo();
            double result;

            ob.test();
            ob.test(10);
            ob.test(10,20);
            result = ob.test(123.23);
            System.out.println("Результат визова ob.test(123.23): " + result);
        }
    }
}
