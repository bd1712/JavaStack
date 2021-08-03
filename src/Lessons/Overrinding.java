package Lessons;

import java.util.Scanner;

public class Overrinding {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        double saving = read.nextDouble();
        double checking = read.nextDouble();

        Account savingAcc = new SavingAcc(saving);
        Account checkingAcc = new CheckingAcc(checking);

        System.out.println(savingAcc.getIncome(saving));
        System.out.println(checkingAcc.getIncome(checking));
    }
}
class Account {

    private double amount;

    public Account(double amount) {
        this.amount = amount;
    }

    public double getAmount() {
        return amount;
    }

    public double getIncome(double amount) {

        return 0;
    }


}

class SavingAcc extends Account {

    public SavingAcc(double amount) {
        super(amount);
    }
    //Override the method for saving account
    //@Override
    public double getIncome(double a) {
    double save = 0;
    save = a + a*0.2;
    return save;
    }
}
class CheckingAcc extends Account {

    public CheckingAcc(double amount) {
        super(amount);
    }
    //Override the method for checking account
    //@Override
    public double getIncome(double a) {
     double check = 0;
     check= a+a*0.05;
     return check;
    }
}

