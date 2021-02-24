package com.nazardevop.javacore.chapter8;

public class A1 {
    int i,j;
    A1(int a, int b){
        i=a;
        j=b;
    }
    void show(){
        System.out.println(i +" " +  j);
    }
}
class B1 extends A1{
    int k;
    B1(int a, int b, int c) {
        super(a, b);
        k = c;
    }
    void show(String msg){
        System.out.println(msg + k);
    }
}
class Override{
    public static void main(String[] args) {
        B1 subOb = new B1(1,2,3);

        subOb.show("Ето k: ");
        subOb.show();
    }
}
