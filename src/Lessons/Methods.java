package Lessons;

import java.util.Scanner;

//import static Lessons.ploshad.printArea;
 // вычисление площади

public class Methods {
    public static void main(String[] args) {
        Rectangle rec = new Rectangle();
        Scanner in = new Scanner(System.in);

        System.out.println("Введите длину прямоугольника: ");
        int num1 = in.nextInt();
        System.out.println("Введите ширину прямоугольника: ");
        int num2 = in.nextInt();

        // rec.perimeterCalculator(num1,num2);
        rec.areaCalculator(num1, num2);

        rec.viewResult();
    }

    public static class Rectangle {
        public int side1, side2;

        public Rectangle() {
        }

        //Формула для нахождения площади
        public void areaCalculator(int num1, int num2) {
            side1 = (num1 * num2);
           // return side1;
        }

        //Формула для нахождения периметра прямоугольника
       // public double perimeterCalculator(double num1, double num2) {
         //   side2 = (num1 + num2) * 2;
         //   return side2;
      //  }

        public void viewResult() {
            System.out.println("Площадь прямоугольника: " + side1);
        ///    System.out.println("Периметра прямоугольника: " + side2);
        }
    }
}