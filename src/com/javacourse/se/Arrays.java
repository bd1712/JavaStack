package com.javacourse.se;

public class Arrays {
    public static void main(String[] args) {
       /* int number =19;   //примитивный тип данных
        char character= 'a';  // primitiv type
        String s = "Hello";  // создание обьекта Хеллоу в ссылочном типе стринг s
        String s1= new String("Hello"); // создание обьекта Хеллоу в ссылочном типе стринг s1*/


       /* int number = 10;  приммтивный тип данных
        int [] numbers = new int[5]; ссыллочный тип данных
        numbers[0]=11;
        numbers[1]=12;
        numbers[3]=15;
        numbers[2]=14;
        numbers[4]=16;

        System.out.println(numbers[4]);
        System.out.println(numbers[3]);*/

        // однодименсинальный массив

        int[] numbers = new int[5];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = i * 10;
        }
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i]+ " ");
        }

        System.out.println();

        int []numbers1= {1,45,4};
        for(int i=0; i< numbers1.length;i++){
            System.out.print(numbers1[i]+ " ");
        }

    }
}