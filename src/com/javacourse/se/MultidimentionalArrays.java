package com.javacourse.se;

public class MultidimentionalArrays {
    public static void main(String[] args) {
        int [] numbers={2,3,4};   //одномерный массив
        /*123
         * 234
         * 567*/
        int[][]matrix= {{1,2,3},{4,0,0},{2,0,1}};
     /*   System.out.println(matrix[2][1]);
        System.out.println(matrix[0][2]);*/

        for(int i =0; i< matrix.length;i++){
            for(int j=0;j< matrix[i].length;j++){
              /*  if (matrix [i][j] == 2) {
                    System.out.println(matrix[i][j] == 1);
                }
                if(matrix [i][j] == 1) {
                    System.out.println( matrix[i][j] == 3);

                }
                if(matrix [i][j] == 3) {
                    System.out.println( matrix[i][j] == 2);
                }*/

                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }



    }
}
