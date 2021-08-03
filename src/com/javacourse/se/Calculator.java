package com.javacourse.se;

public class Calculator {

    public double add(double x, double y) {
        return x+y;
    }

    public double div(double x, double y) {
        return x/y;
    }

    /**
     * @param args
     */
    public static void main(String[] args) {
        double a, b, c;
        a= 2.0;
        b= -2.2;
        c= -4.0;
        Calculator cal = new Calculator();

        System.out.println(" a+b ="+cal.add(a, b));
        System.out.println(" a+c ="+cal.add(a, c));
        System.out.println(" a+a ="+cal.add(a, a));

        System.out.println(" a/b ="+cal.div(a, b));
        System.out.println(" a/c ="+cal.div(a, c));
        System.out.println(" a/0.0 ="+cal.div(a, 0.0));

    }

}
