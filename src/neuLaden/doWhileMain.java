package neuLaden;



import java.util.Scanner;

public class doWhileMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();



        do {
            if (number == 1) {
                System.out.println("Language selection"); // 1

                break;
            }

            if (number == 2) {
                System.out.println("Customer support"); // 2

                break;
            }

            if (number == 3) { // 3
                System.out.println("Check the balance");
                number++;
                break;
            }

            if (number == 4)

            { // 4
                System.out.println("Check loan balance");
                break;
            }

            if(number==0 || number>4); { //5
                System.out.println("Exit"); break; }

            // take input and output corresponding message
            /*
             * 1 => Language selection 2 => Customer support 3 => Check the balance 4 =>
             * Check loan balance 0 => Exit
             */
        } while (number != 0);

    }}

