package com.nazardevop.javacore.chapter7;

public class OverloadDemo1 {
    void test(){
        System.out.println("Параметри отсутствуют!");
    }

    void test(int a, int b){
        System.out.println("a i b: " + a + " " + b);
    }
    void test(double a){
        System.out.println("Внутренние преобразование при визове "+ " test (double) a: " + a);
    }
    static class Overload{
        public static void main(String[] args) {
            OverloadDemo ob = new OverloadDemo();
            int i = 88;

            ob.test();
            ob.test(10,20);
            ob.test(i);
            ob.test(123.2);

        }
    }
}
