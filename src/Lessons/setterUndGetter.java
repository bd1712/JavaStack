package Lessons;
import java.util.*;
public class setterUndGetter {

        public static void main(String[] args) {
            Scanner read = new Scanner(System.in);
            int totalIncome = read.nextInt();
            int taxPercent = read.nextInt();

            //creating an Income object
            Income income =  new Income();
            income.totalIncome = totalIncome;
            income.taxPercent = taxPercent;


            income.CalculateNetRevenue(income.getNetRevenue());
            System.out.println("Net revenue: " + income.getNetRevenue());
        }
    }

    class Income{
        public int totalIncome;
        public int taxPercent;
        //the net revenue is private
        private int netRevenue;
        int n;
        int m;
        //complete setter method
        public void CalculateNetRevenue(int newRevenue){
            netRevenue = newRevenue;
            this.n = totalIncome;
            this.m = taxPercent;
            netRevenue = n - n*m/100;
        }

        //complete getter method
        public int getNetRevenue(){

            return netRevenue;
        }


    }


