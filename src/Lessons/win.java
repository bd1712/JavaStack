package Lessons;
import java.util.Scanner;
public class win {



        public static void main(String[] args) {
            // Scanner read = new Scanner(System.in);
            //int number = read.nextInt();

            //your code goes here
            int number = 34110;
            int number2= 13710;

            if (number % 10 == 0 && number % 9 == 0 ) {
                System.out.println("You won $200");
            } else {
                if (number % 4 == 0 || number % 6 == 0) {
                    System.out.println("You won  $50");
                } else {
                    System.out.println("Try again");
                }
            }

            if (number2%10==0 && number2%9==0){
                System.out.println("You won $200");
            }
            else {
                if (number2%4==0 || number2%6==0){
                    System.out.println("You won  $50");
                }

                else {
                System.out.println("Try again");
            }
        }
}
}



