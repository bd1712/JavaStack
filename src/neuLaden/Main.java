package neuLaden;

import java.util.Scanner;

     public class Main {
         public static void main(String[] args) {
             Scanner read = new Scanner(System.in);
             int number = read.nextInt();
             int i = 1;
             //your code goes here
             while(i<=number){
                 if (i%3==0|| i%10==3){
                     System.out.println(i);
                 }
                 i++;
             }

         }
     }
