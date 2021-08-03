package com.javacourse.se;

public class This {
    public static void main(String[] args) {
        Human human1 = new Human();
        human1.setAge(18);
        human1.setName("Tom");
        human1.getInfo();

        Human human2 = new Human();
        human2.setAge(19);
        human2.setName("Jan");
        human2.getInfo();

        Human human3 = new Human();
        human3.setAge(20);
        human3.setName("Paul");
        human3.getInfo();

    }
}
class Human {
    String name;
    int age;

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
    public void getInfo() {
        System.out.println(" My name is "+ name +  " Me is " + age + " year old " );
    }
}



