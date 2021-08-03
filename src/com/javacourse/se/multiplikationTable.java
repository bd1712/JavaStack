package com.javacourse.se;

public class multiplikationTable {
    public static void main(String[] args) {
        int[][] numbers = new int[10][10];

        for (int i = 0; i < 11; i++) {
            for (int j = 0; j < 11; j++) {

                System.out.println(j+"x"+i+"="+(j*i)+"\t");

            }
        }
    }
}
