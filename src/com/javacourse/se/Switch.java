package com.javacourse.se;

import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("How old are you?");
        int age = scanner.nextInt();
        switch(age){
            case 0:
                System.out.println("You are new born");
                break;

            case 18:
                System.out.println("you are student");

                break;
        }



    }
}
