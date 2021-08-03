package Lessons;

import java.util.Scanner;

public class arraysSum {
   /* public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int length = scanner.nextInt();      // dlina massiva prinimaetsa
        int[] array = new int[length];      // elementen abstracktion

        for (int i = 0; i < length; i++) {
            array[i] = scanner.nextInt();
        }   int sum = 0;
        for (int num : array)
            if (num % 4 == 0) {
                sum += num;

            }
            System.out.println(" " + sum);
        }*/



    /*public static void main(String[] args) {
        int[][] matrix = {
                {8, 1, 6},
                {3, 5, 7},
                {4, 9, 0},
        };
        for ( int i=0; i<matrix.length; i++){
            for( int j=0; j<matrix[i].length; j++){
                System.out.println(matrix[i][j]);
            }
        }

    }*/

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        char[] arr = text.toCharArray();

        for( int i= arr.length-1; i>=0; i--){     // umekehrte reihnfolge

            System.out.print(arr[i]);
        }

    }

    }


