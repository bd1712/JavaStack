package Inkapsulatia.devCat;

import Inkapsulatia.devPeople.People;
  // Наследование
public class Sportsman  extends People {

    private String typeSport;

      public String getTypeSport(String tennis) {
          return typeSport;
      }

      public Sportsman(String name, String lastName, int age, Cat cat) {
          super(name, lastName, age, cat);
      }   // расширяем спртсмена с импортом People это наше ребенок

}
