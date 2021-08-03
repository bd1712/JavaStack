package com.javacourse.se;
import java.util.*;

import static java.lang.System.out;


public class RekursionBin {

    /*static int convert(int i) {
        if (i > 0) {
            convert (i/2);
            System.out.println(i%2);
            return 0;
        } else {
            return 0;
        }
    }

    public static void main(String[]  args) {
        RekursionBin.convert(17);
    }*/



    public static void main(String[] args) {

        int input;
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter number to convert to binary: ");
        input = scan.nextInt();
        convert(input);

    }

    public static void convert(int num) {
        if (num>0) {
            convert(num/2);
           System.out.print(num%2 + " ");
        }
    }


}
