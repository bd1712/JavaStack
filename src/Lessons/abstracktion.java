package Lessons;

import java.util.Scanner;
class abstracktion {
    public static void main(String[] args) {
        //do not touch this code
        Monopoly monopoly = new Monopoly();
        Chess chess = new Chess();
        Battleships battleships = new Battleships();

        monopoly.play();
        chess.play();
        battleships.play();

    }
}

abstract class Game {
    abstract String getName(String abc);
    abstract void play();
}

class Monopoly extends Game {

    //give "Monopoly" name to game
    String getName(String a) {
        a = "Monopoly";
        return a;
    }

    // play method should print "Buy all property."
    void play() {
        System.out.println("Buy all property.");
    }
}

class Chess extends Game {

    //give "Chess" name to game
    String getName(String b) {
        b = "Chess";
        return b;
    }

    // play method should print "Kill the enemy king"
    void play() {
        System.out.println("Kill the enemy king");
    }
}

class Battleships extends Game {

    //give "Battleships" name to game
    String getName(String c) {
        c= "Battleships";
        return c;
    }

    // play method should print "Sink all ships"
    void play() {
        System.out.println("Sink all ships");
    }
}




