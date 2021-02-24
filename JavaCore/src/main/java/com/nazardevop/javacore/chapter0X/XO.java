package com.nazardevop.javacore.chapter0X;

import java.util.Random;
import java.util.Scanner;

public class XO {
    static final int RAZMER_POLYA = 3;
    static final char PLAYER = 'O';
    static final char COMP = 'X';
    static final char NULL = '!';
    static Scanner vvod = new Scanner(System.in);
    static Random random = new Random();
    static final char [][] POLE= new char[RAZMER_POLYA][RAZMER_POLYA];

    public static void main(String[] args) {
        initField();
        printField();
        while (true){
            movePerson();
            printField();
            if (checkWin(PLAYER)){
                System.out.println("You WIN!");
                break;
            }
            moveAI();
            System.out.println();
            printField();
            if (checkWin(COMP)){
                System.out.println("You Lost");
                break;
            }
        }
    }
    static  void initField(){
        for (int i = 0; i < RAZMER_POLYA; i++) {
            for (int j = 0; j < RAZMER_POLYA; j++) {
                POLE[i][j] = NULL;
            }
        }
    }
    static  void printField(){
        for (int i = 0; i < RAZMER_POLYA; i++) {
            for (int j = 0; j < RAZMER_POLYA; j++) {
                System.out.print(POLE[i][j] + "\t");
            }
            System.out.println();
        }
    }
    static void movePerson(){
        int x,y;
        do {
            x = vvod.nextInt() -1;
            y = vvod.nextInt() -1;
        }while (! isCellValid(x,y));
        POLE[y][x] = PLAYER;
    }
    static void moveAI(){
        int x,y;
        do {
            x = random.nextInt(RAZMER_POLYA);
            y = random.nextInt(RAZMER_POLYA);
        }while (! isCellValid(x,y));
        POLE[y][x] = COMP;
    }
    static boolean isCellValid(int x, int y){
        if (x<0 || x>= RAZMER_POLYA || y < 0 || y>= RAZMER_POLYA)return false;
        if (POLE[y][x] == NULL)return true;
        return false;
    }
    static boolean checkWin(char sum){
        for (int i = 0; i < RAZMER_POLYA; i++) {
            int result = 0;
            for (int j = 0; j < RAZMER_POLYA; j++) {
                if (POLE[i][j] == sum) result++;
            }
            if (result == RAZMER_POLYA) return true;
        }
        for (int i = 0; i < RAZMER_POLYA; i++) {
            int result = 0;
            for (int j = 0; j < RAZMER_POLYA; j++) {
                if (POLE[j][i] == sum) result++;
            }
            if (result == RAZMER_POLYA) return true;
        }
        int first = 0;
        for (int i = 0; i < RAZMER_POLYA; i++) {
            for (int j = 0; j < RAZMER_POLYA; j++) {
                if (j == i && POLE[i][j] == sum) first++;
            }
        }
        if (first == RAZMER_POLYA)return true;
        int second = 0;
        for (int i = 0, j = RAZMER_POLYA-1; i<RAZMER_POLYA && j >=0; i++,j--) {
            if (POLE[i][j] == sum) second++;
        }
        if (second == RAZMER_POLYA) return true;
        return false;
    }
}

