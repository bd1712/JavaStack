package com.javacourse.se;


import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
       // String s = new String(); // создание какого-либо обьекта
        Scanner s = new Scanner(System.in);  // создание обьекта с сканером

        System.out.println("Как вас зовут:");
        String string =  s.nextLine();
        System.out.println("Ваше имя :" + string ) ;
        System.out.println("Сколько вам лет ? ");
        int a = s.nextInt();
        System.out.println("Вам: " + a+" лет");

        if (a>70) {
            System.out.println("Вы пенсионер");
        }
        if (a<16){
            System.out.println("Вам не разрешено голосовать");
        }else {
            System.out.println("Вы в праве голосовать на Выборах");
    }

}}
