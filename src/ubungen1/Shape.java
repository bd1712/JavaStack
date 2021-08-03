package ubungen1;

abstract class Shape {
    //int b = 20;
    double x =5.0;
    double y = 3.0;
    void moveTo() {

    }
    abstract void calcArea();
    abstract void calcPerimeter();
}

class Rectangle extends Shape {


    public static void main(String args[]) {
        Rectangle obj = new Rectangle();
       obj.x = 20;
       obj.y =10;
       obj.calcArea();
    }

    public void calcArea() {
        System.out.println("Area ist " + (x * y));
    }
    @Override
    void calcPerimeter() {
        System.out.println("Perimeter ist" + (x*2 + y*2));

    }
}
