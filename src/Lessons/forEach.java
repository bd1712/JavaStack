package Lessons;

import java.util.Scanner;

public class forEach {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int length = scanner.nextInt();
        int[] sides =  new int[length];
        for (int i = 0; i < length; i++) {
            sides[i] = scanner.nextInt();
        }
        int result=0;

        for ( int  list : sides){
           result = (list * list);
            System.out.println(result);
        }

    }
}
