package Lessons;

import java.util.Scanner;

public class SwitchMain {

   /* public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int emotion = scanner.nextInt();
	       /*
	       1 - "You are happy!"
	       2 - "You are sad!"
	       3 - "You are angry!"
	       4 - "You are surprised!"
	       other - "Unknown emotion."
	       */
      /*  switch (emotion){
            case 1 :
                System.out.println( " You are happy! ");
                break;
            case 2:
                System.out.println(" You are sad!");
                break;
            case 3:
                System.out.println(" You are anrgy! ");
                break;
            case 4:
                System.out.println(" You are suprised!");
                break;
            default:
                System.out.println( " Unknown emotion. ");
                    break;
        }

    }*/

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int firstBadGuy = read.nextInt();
        int secondBadGuy = read.nextInt();

        for (int i = 1; i <= 7; i++) {
            if (firstBadGuy==i || secondBadGuy==i)
                System.out.println(" Bad guy " );
            else{
              System.out.println(" Good guy " );

            }
        }

    }


}

