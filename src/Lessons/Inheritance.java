package Lessons;

class Standard {
    protected void draw() {      //protected method make the variable visible inside class
        System.out.println("Drawing");
    }

    protected void write() {   //method
        System.out.println("Writing");
    }
}
//fix the class исправить
class Pro extends Standard{

    protected void useEffects() {
        System.out.println("Using Effects");
    }

    protected void changeResolution() {
        System.out.println("Changing Resolution");
    }
}

public class Inheritance {
    public static void main(String[] args) {
        Standard standard1 = new Standard();
        Pro pro1 = new Pro();

        //standard version
        standard1.draw();  // risovat
        standard1.write();


        //Pro version
        pro1.draw();
        pro1.write();
        pro1.useEffects();
        pro1.changeResolution();
    }
}
