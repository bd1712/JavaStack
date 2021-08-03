package com.javacourse.se;

import java.util.Scanner;

public class MatrixMult {

    public static int[][] multiplyMatrices(int[][] m1, int[][] m2) {
        int[][] ergebnismatrix = null;

        if (m1[0].length == m2.length) {
            int zeilenm1 = m1.length;
            int spaltenm1 = m1[0].length;
            int spalenm2 = m2[0].length;

            ergebnismatrix = new int[zeilenm1][spalenm2];

            for (int i = 0; i < zeilenm1; i++) {
                for (int j = 0; j < spalenm2; j++) {
                    ergebnismatrix[i][j] = 0;
                    for (int k = 0; k < spaltenm1; k++) {
                        ergebnismatrix[i][j] += m1[i][k] * m2[k][j];
                    }
                }
            }
        } else {
            int zeilen = m1.length;
            int spalten = m1[0].length;

            ergebnismatrix = new int[zeilen][spalten];
            for (int i = 0; i < m1.length; i++) {
                for (int j = 0; j < m1[0].length; j++) {
                    ergebnismatrix[i][j] = 0;
                }
            }
        }
        return ergebnismatrix;
    }}