package com.javacourse.se;

public class ForLoop {
    public static void main(String[] args) {
        System.out.println("division durch 3 :");
        for( int i=1;i<100 ;i++ ){
            if(i%3==0){
                System.out.print( i+" , ");
            }}

        System.out.println("division durch 5 :");
        for( int i=0;i<100 ;i++ ){

            if(i%5==0){
                System.out.print(i+", ");
            }}

        System.out.println("division durch 3 und 5 ");
        for( int i=0;i<100 ;i++ ){

            if(i%3==0 && i%5==0){
                System.out.print( i+", ");
            }

        }
    }
}
