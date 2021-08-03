package Lessons;

import java.util.Scanner;

public class Iter {

    /*public static void main1(String[] args) {

        int n;
        n = 0;
        for (int i = 0; i <= 6; i++) {
            n = i;
            System.out.println(" " + i);

            while (n > 1) {
                if (n % 2 == 0) {
                    n = n / 2;
                    System.out.println(" " + n);
                } else {
                    n = 3 * n + 1;
                }
                System.out.println(" Iteration " + n);


            }
        }
    }*/

    public static void main1(String[]args){


        Scanner sc = new Scanner(System.in);
        System.out.println(" geben Sie ein Zahl : ");
        int n = sc.nextInt(), x = 0, j = 1, gesold = 0;

        while(n>1) {
            if(x%2==0){
                x=x/2;
                System.out.println(" " + x);
                gesold+=x;
            }
            else { x=3*x+1;

                System.out.println(" Iteration " + x );
                gesold+=x;
            }
            j++;

        }
        System.out.println(" (" + j + ")=" + n);
    }
}