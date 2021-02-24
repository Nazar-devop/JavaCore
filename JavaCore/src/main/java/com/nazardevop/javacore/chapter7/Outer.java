package com.nazardevop.javacore.chapter7;

public class Outer {
    int outer_x = 100;

    void test() {
        Inner inner = new Inner();
        inner.display();
    }

    class Inner{
        void display(){
            System.out.println(outer_x);
        }
    }
}

class InnerClasDemo {
    public static void main(String[] args) {
        Outer outer = new Outer();
        outer.test();
    }
}

