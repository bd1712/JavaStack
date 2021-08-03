package Lessons;

public class zweiDimArray {

    public static void main(String[] args) {
       // int [] [] brett = new int [8] [8];//8 Zeilen und 8 Spalte
      /*  brett[0]= new int[2];
        brett[1]= new int[2];
        brett[2]= new int[2];
        brett[3]= new int[2];
        brett[4]= new int[2];
        brett[5]= new int[2];
        brett[6]= new int[2];
        brett[7]= new int[2];*/
        int a[][]=new int [8][8]; // [zeilen][spalten]
        for(int i=0;i<8;i++) {
            for(int j=0;j<8;j++) {

                /*if (a [i][j] == 4) {
                    System.out.println(a[i][j] == 1);
                }
                if(a [i][j] == 6) {
                    System.out.println( a[i][j] == 2);

                }
                if(a [i][j] == 7) {
                    System.out.println( a[i][j] == 5);
                }*/
               /* else {
                    return;*/

                System.out.print(a[i][j] + " ");
            }
            System.out.print("\n");
        }

        //Array mit Werten füllen
      /* brett[0][0]=2;
        brett[0][1]=7;
        brett[1][0]=3;
        brett[1][1]=12;
        brett[1][2]=2;
        brett[2][0]=4;
        brett[2][2]=22;
        brett[2][3]=3;*/

        //Werte aus dem Array lesen
        /*System.out.println(brett[0][0]);
        System.out.println(brett[0][1]);
        System.out.println(brett[1][0]);
        System.out.println(brett[1][1]);
        System.out.println(brett[1][2]);
        System.out.println(brett[2][0]);
        System.out.println(brett[2][1]);
        System.out.println(brett[2][2]);
        System.out.println(brett[2][3]);*/
}}
