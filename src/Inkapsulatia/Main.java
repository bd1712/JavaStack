package Inkapsulatia;

import Inkapsulatia.devCat.Cat;
import Inkapsulatia.devCat.Sportsman;
import Inkapsulatia.devPeople.People;

public class Main {
    static Cat cat = new Cat();
    static People People ;
    static Sportsman sportsman;

    public static void main(String[] args) {  //methd main
        cat.setName("Bochello");
        cat.setAge(5);
        cat.setPoroda("Mustang");

        People.setLastName("Fedorov");
        People.setAge(25);
        People.setName("Alex");

        Sportsman sportsman = new Sportsman("Alex", "kirov", 25, null);
        System.out.println(People);
        System.out.println(sportsman);
        sportsman.getTypeSport("Tennis");


      //  People.getCat();



    }
}
