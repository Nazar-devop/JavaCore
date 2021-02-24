package com.nazardevop.javacore.chapter7;

public class VarArgs2 {
    static void vaTest (String msg, int ... v){
        System.out.println(msg + v.length + "Содердимое: ");

        for (int x : v)
            System.out.print(x +  " ");
        System.out.println();
    }

    public static void main(String[] args) {
        vaTest("Один параметр переменной длинни: ",10);
        vaTest("Три параметр переменной длинни: ",1,2,3);
        vaTest("Без параметр переменной длинни: ");
    }
}
