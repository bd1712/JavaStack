package com.javacourse.se;

public class ClassesAndObjekts { //главный класс
    public static void main(String[] args) {
        Person person1 = new Person();
        person1.setNameAndAge("Noha", +25);
        person1.speak();
        Person person2 = new Person();
        person2.setNameAndAge("Jan", +35);
        person2.speak();
        Person person3 = new Person();
        person3.setNameAndAge("Mila", 12);
        person3.speak();

    }}
class Person{  //подкласс
    String name;
    int age;

    void setNameAndAge(String username, int userage){//первый метод создали
        name=username;
        age=userage;
    }
    void speak(){ // второй метод создали
           /*int i=0;
           while(i<2){
               i++;
               System.out.println(" My name is " + name + " i am " + age);
           }*/
        for(int i =0;i<2;i++) {
            System.out.println(" My name is " + name + " i am " + age);
        }}}