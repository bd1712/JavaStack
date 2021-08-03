package Lessons;

public class setPriorityr {

    public static void main(String[ ] args) {
        Name name = new Name();
        //set priority



        Welcome welcome = new Welcome();
        //set priority

        welcome.start();
        name.start();

    }
}




//extend the Thread class
      class Welcome  extends Thread{   // унаследованно
    public void run() {

        System.out.println("Welcome!");
    }


}

//extend the Thread class
    class Name extends Thread{      //унаследованно от класса Thread  , Thread importiert sich selbst ohne zu importieren
    public void run() {
        System.out.println("Please enter your name");
    }
}