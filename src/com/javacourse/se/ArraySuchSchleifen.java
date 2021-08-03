package com.javacourse.se;


    class ArraysuchsChleifen {

        public static int maxRealation(int a[][]) { //     a[a][b]
            int zeileold = 0,zeilenew = 0,Zeile=0;

            for(int i = 0; i <= a.length-1; i++) {
                for(int j = 0; j <= a[i].length-1; j++) {
                    if(a[i][j] == 1) {
                        zeileold++;
                    }
                }
                if (zeileold > zeilenew) {
                    zeilenew = zeileold;
                    Zeile=i;
                }
            }



            return Zeile;
        }


        public static void main(String[] args) {

            int a[][] = new int[20][20];

            for(int i = 0; i <= a.length-1; i++) {
                for(int j = 0; j <= a[i].length-1; j++) {
                    a[i][j] = i+j;
                }

            }

            System.out.println(maxRealation(a));
        }

    }

