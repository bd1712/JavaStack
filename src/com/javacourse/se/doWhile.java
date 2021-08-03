package com.javacourse.se;

import java.util.Scanner;

public class doWhile {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);

    /*    int value;
        do {
            System.out.println("gib mir 5 ");            // do-while
             value = scanner.nextInt();

        }while (value!=5);

            System.out.println(" True");
        }*/



        System.out.println("gib mir ein  Zahl : ");// вход
        int a = scanner.nextInt();
        if(a % 2 == 0){
            System.out.println(" gerade ZAHL "+a);        //while
        } else
        System.out.println(" ungerade Zahl "+a );


    }}

