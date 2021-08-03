package Lessons;

import com.sun.security.jgss.GSSUtil;

import java.util.Scanner;

public class hotel {
    /*public static void main (String args []) {
        Scanner read = new Scanner (System.in);
        String firstName = read.nextLine();
        String secondName = read.nextLine();
        int age = read.nextInt();
        int roomNumber = read.nextInt();
        Customer customer = new Customer();
        customer.age= read.nextInt();
        // присвоить данные клиента атрибутам обьекта


       customer.firstName = firstName;
        customer.secondName = secondName;
        customer.age = age;
        customer.roomNumber  = roomNumber;
        customer.saveCustomerInfo();
    }
}

class Customer {
    String firstName;
    String secondName;
    int age;
    int roomNumber;       // добавить все необхлдимые атрибуты

    public void saveCustomerInfo () {
        System.out.println("First name : " + firstName);
        System.out.println("SecondName : " + secondName);
        System.out.println(" Age: "+ age);
        System.out.println("Room number" + roomNumber);
    }
*/
    //////////////////////////////////////////////////
  /*  public static void main(String[] args) {
        //James
        Worker worker1 = new Worker();
        String workerFirst= "James";
        int worker1salary = 200000;

        //Tom
        Worker worker2 = new Worker();
        String workerSecond = "Tom";
       int worker2salary = 150000;

        System.out.println(CalculateTotalSalary(worker1salary,worker2salary));
    }

    //complete the function to calculate the total salary
    static int CalculateTotalSalary(int worker1salary, int worker2salary){
    return worker1salary+worker2salary;

    }
}
class Worker{
    private String name;
    private int salary;

}

   */

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        String name = read.nextLine();
        int age = read.nextInt();
        Student student = new Student();
        student.name = name;
        student.setAge(age);
     //   student.setAge(0);
        if (age <= 0) {
            System.out.println(" Invalid age ");
        }
        //set the age via Setter


        System.out.println("Name: " + student.name);
        System.out.println("Age: " + student.getAge());
    }
}

class Student {

    public String name;
    private int age;

    public int getAge() {
        if ( age < 0 ){
            age = 0;

         //complete Getter     возвращает
        }
            return age;
        }

        public void setAge ( int age){
            this.age = age; //complete Setter   устанавливает

        }
    }




