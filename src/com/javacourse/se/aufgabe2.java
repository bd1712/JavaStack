package com.javacourse.se;

import java.util.Scanner;

public class aufgabe2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите first число: ");
        int a = in.nextInt();
        System.out.println("Введите second число: ");
        int b = in.nextInt();
        System.out.println("Введите third число: ");
        int c = in.nextInt();
    }
        /*if ((a % 10 == b % 10)|| (a % 10 == c % 10) || (b % 10 == c % 10)) {
            System.out.println("The Number are : " + true);
        }
        if (b>a && c>b){
            System.out.println(true);
        }*/
        public static boolean test(int a, int b, int c, boolean abc)
        {
            if(abc)
                return (c > b);
            return (b > a && c > b);
        }
    }
