package ubungen1;

public class Construktor {
    public static void main(String[] args) {
        Human human1 = new Human(34);
        Human human2 = new Human();
    }
}
  class Human {
      private String name;
      private int age;

      public Human() {   // konstruktor imeet pohoje nazvanie kak class
          System.out.println("Hey from first Construktor!");
      }

      public Human(String name) { // konstruktor
          System.out.println("Hey from second Constuktor!");
          this.name = name;

      }

      public Human(int age) {
          System.out.println("Hey from fourth  Constuktor!");
          this.age = age;
      }

      public Human(String name, int age) {
          System.out.println("Hey from third Constuktor");
          this.name = name;
          this.age = age;

      }


      public void setName(String name) {
          this.name = name;
      }

      public void setAge(int age) {
          this.age = age;
      }

}



