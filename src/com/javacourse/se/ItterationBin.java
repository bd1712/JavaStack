package com.javacourse.se;

import java.util.Scanner;

public class ItterationBin {
    public static void main(String[] args) {

        /*Scanner sc = new Scanner(System.in);
        System.out.println(" Gebe ein Zahl : ");
        int n = sc.nextInt(), x = 0, j = -1, gesold = 0;

        while (n >= gesold) {
            if(x == 0) {
                x = 1;
                System.out.println("x= " + x);
                gesold += x;
            }
            else {
                x *= 2;
                System.out.println("x="+x);
                gesold += x;

            }
            j++;
        }

        System.out.println(" 2^" +j);
    }*/

        int number, i = 0;
        int binary[] = new int[100];
        Scanner sc = new Scanner(System.in);
        System.out.println("Gebe ein Dezimal Zahl : ");
        number = sc.nextInt();
        while (number != 0) {
            binary[i] = number % 2;
            number = number / 2;
            i++;
        }
        System.out.println("Binaer Ziffer : ");
        for (int j = i - 1; j > 0; j--) {
            System.out.println("binary : " + binary[j]);
        }
    }
}
