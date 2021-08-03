package com.javacourse.se;

import java.util.Scanner;

public class ScannerFasleTrue {

    public static void main(String[] args) {

         /* int a =5;
          int b =10;
          int c=15;
          if (a+b==c) {
              System.out.println(true);
          }else {
              System.out.println(false);



          }
        }
    }*/
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите first число: ");
        int a = scanner.nextInt();
        System.out.println("Введите second число: ");
        int b = scanner.nextInt();
        System.out.println("Введите third число: ");
        int c = scanner.nextInt();
        /* *//* System.out.println("The result is : " + test_last_digit(a, b, c, true));
        System.out.println("/n");*//*
    }*/

        if (a + b == c) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }



           /* public static boolean test_last_digit(int a, int b,int c, boolean abc)
            {
                return (a % 10 == b % 10) || (a % 10 == c % 10) || (b % 10 == c % 10);
            }
        }*/

    }
}