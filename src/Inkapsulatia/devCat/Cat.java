package Inkapsulatia.devCat;

public class Cat {           // erzeugen einen Objekt Cat
    private int age;                   // dali peremennye
    private String poroda;
    private String name;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getPoroda() {
        return poroda;
    }

    public void setPoroda(String poroda) {
        this.poroda = poroda;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return " Cat [имя кота : " + name + " порода кота " + poroda +   " возраст кота " + age + " ]" ;
    }
}
