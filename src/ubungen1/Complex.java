package ubungen1;


public class Complex <T> {
    private double real;
    private double imaginary;

    public  Complex(double r, double i) {
        real = r;
        imaginary = i;
    }

    Complex add(Complex a,Complex b) {
        Complex c = new Complex(0,0);
        c.real = a.real + b.real;
        c.imaginary = a.imaginary + b.imaginary;
        return c;
    }

    Complex sub(Complex a,Complex b) {
        Complex c = new Complex(0,0);
        c.real = a.real - b.real;
        c.imaginary = a.imaginary - b.imaginary;
        return c;
    }





    double getr() {
        return this.real;
    }

    double geti() {
        return this.imaginary;
    }

    Complex div(Complex a,Complex b) {
        Complex c = new Complex(0,0);
        c.real = (a.real*b.real+a.imaginary*b.imaginary)/(b.real*b.real+b.imaginary*b.imaginary);
        c.imaginary =(a.imaginary*b.real-a.real*b.imaginary) /(b.real*b.real+b.imaginary*b.imaginary) ;
        return c;
        //System.out.println(" "+ c);
    }

    Complex multi(Complex a,Complex b) {
        Complex c = new Complex(0,0);
        c.real = a.real*b.real - a.imaginary*b.imaginary;
        c.imaginary = a.real * b.imaginary + b.real * a.imaginary;
        return c;
    }

   /* public static void main(String[] args) {
        Complex a;
        Complex b;
        double c;
        a=2;
        b=3;

        Complex ca = new Complex(10,10);

        System.out.println(" a+b ="+ca.add(a,b));
      //  System.out.println(" a+c ="+ca.add(a, b));
        System.out.println(" a+a ="+ca.add(a, a));

        System.out.println(" a/b ="+ca.div(a, b));
        System.out.println(" a/c ="+ca.sub(a, b));
       // System.out.println(" a/0.0 ="+ca.div(a, 0.0));
    }*/

}



