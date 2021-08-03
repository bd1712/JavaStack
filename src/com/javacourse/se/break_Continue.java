package com.javacourse.se;

public class break_Continue {
    public static void main(String[] args) {
       /* int i=0;
        while(true){
            if (i==15){
                break;}

            System.out.println(i);
            i++;
        }
        System.out.println("we have it");
        }*/
        for (int i = 0; i < 20; i++) {
            if (i % 2 ==0) {
                continue;   // выдает нечетные числа
            }
            System.out.println("ungerade Zahlen : "+i);
        }
    }
}

