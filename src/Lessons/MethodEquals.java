package Lessons;

import java.lang.reflect.InvocationHandler;
import java.sql.SQLOutput;

import static java.lang.Boolean.*;

public class MethodEquals {
    public static void main(String[] args) {

        String a ="hello";
        String b ="hello1233".substring(0,5);
        System.out.println(b);
        System.out.println(a.equals(b));


       /* Animal animal1 = new Animal (1);
        Animal animal2 = new Animal(1);*/
        //System.out.println(animal1.equals(animal2));

    }
    }
    class Animal {
    private int id;
    public Animal(int id ){
        this.id=id;
    }
    public boolean equals(Object obj)
    {
        Animal otherAnimal = (Animal)obj;
        return this.id==otherAnimal.id;

    }    }
    


        



