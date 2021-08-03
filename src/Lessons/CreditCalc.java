package Lessons;

import java.util.Scanner;

public class CreditCalc {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int amount = scanner.nextInt();
    for( int i=0; i<6; i++) {
        amount -= (amount * 0.1);
    }
        System.out.println(amount);

    }
    }




