package com.nazardevop.javacore.chapter5;

public class IfElse {
    public static void main(String[] args) {
        int month = 4;
        String season;
        if (month ==12 || month ==1 || month ==2)
            season = "зима";
        else if (month ==3 || month ==4 || month ==5)
            season = "весне";
        else if (month ==6 || month ==7 || month ==8)
            season = "лету";
        else if (month ==9 || month ==10 || month ==11)
            season = "осени";
        else
            season = "вимишленим месяцем";
        System.out.println("Апрель относиться к " + season );
    }
}
