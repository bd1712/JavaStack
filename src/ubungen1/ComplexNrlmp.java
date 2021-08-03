package ubungen1;

public class ComplexNrlmp {

    public static class ComplexNr {
        public float real;
        public float img;
    }

    public static void main(String[] args) {

        ComplexNr z1 = init(10, 5);
        ComplexNr z2 = init(12, 4);
        //    ComplexNr z3 = sub(conjugate(add(z1,z2)),z1);
        printComplex((add(z1,z2)));
        printComplex((sub(z1,z2)));
    }

    public static ComplexNr init(float real, float img){
        ComplexNr p = new ComplexNr();
        p.real = real;
        p.img = img;
        return p;
    }

    public static float real(ComplexNr p){
        return p.real;
    }

    public static float img(ComplexNr p){
        return p.img;
    }

    public static ComplexNr add(ComplexNr z1, ComplexNr z2){
        ComplexNr c = init((z1.real+z2.real),(z1.img+z2.img));
        return c;
    }

    public static ComplexNr sub(ComplexNr z1, ComplexNr z2){
        return init(z1.real-z2.real,z1.img-z2.img);
    }

    public static ComplexNr mult(ComplexNr z1, ComplexNr z2){
        return init(z1.real*z2.real-z1.img*z2.img,z1.real*z2.real+z1.img*z2.img);
    }

    /*public static ComplexNr div(ComplexNr z1, ComplexNr z2){
    return ComplexNr;
    }*/

    public static float norm(ComplexNr z){
        return (float)Math.sqrt((z.real*z.real)+(z.img*z.img));
    }

    /*public static float dist(ComplexNr z1, ComplexNr z2){
    }*/

    public static ComplexNr conjugate(ComplexNr z){
        return init(z.real,-1*z.img);
    }

    public static boolean equal(ComplexNr z1, ComplexNr z2){
        if (z1.real == z2.real && z1.img == z2.img)
            return true;
        return false;
    }

    public static void printComplex(ComplexNr p){
        System.out.println("Complex: "+real(p)+" + "+img(p)+"i");
    }



}
