package Lessons;


import com.sun.security.jgss.GSSUtil;

import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;

public class genericsParametrizatia {
    public static void main(String[] args) {
        ////////////Java 5////////////
        List animals =new ArrayList();
        animals.add("act"); //0
        animals.add("dog"); //1
        animals.add("cow");  //2

        String animal = (String)animals.get(2);
        System.out.println(animal);


        ////////////////java mit Generics////////////

        List<String> animal2=new ArrayList<>();
        animal2.add("cat");
        animal2.add("cow");
        animal2.add("dog");

        String animal1 = animal2.get(2);
        System.out.println(animal2);
    }
}
