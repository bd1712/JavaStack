package Lessons;

import java.util.Scanner;

public class screenshots {


      /*  public static void main(String[] args) {
            Scanner read = new Scanner(System.in);
            String name = read.next();

            //screenshots
            ScreenShot screenshot1 = new ScreenShot();
            ScreenShot screenshot2 = new ScreenShot();

            //outputting the names
            System.out.println(screenshot1.getName());
            System.out.println(screenshot2.getName());
        }
    }

    class ScreenShot{
        private String name;

        //complete the first constructor
        ScreenShot( name){
        this.setName(name);
        }

        //complete the second constructor
        ScreenShot(){
        this.setName("Screenshot");
        }

        //Setter
        public void setName(String name){
            this.name = name;
        }

        //Getter
        public String getName(){
            return name;
        }*/

    //////////////////////////////////////////////////////////////////////////////
      /*  public static void main(String[] args) {
            Scanner read = new Scanner(System.in);
            String movie = read.nextLine();
            int row = read.nextInt();
            int seat = read.nextInt();
            Ticket ticket = new Ticket(movie, row, seat);
            System.out.println("Movie: " + ticket.getMovie());
            System.out.println("Row: " + ticket.getRow());
            System.out.println("Seat: " + ticket.getSeat());
        }
    }

    class Ticket {
        private String movie;
        private int row;
        private int seat;

        //complete the constructor
        public Ticket(String movie, int row, int seat) {
        this.movie = movie;
        this.row = row;
        this.seat = seat;
        }

        public String getMovie() {
            return movie;
        }

        public int getRow() {
            return row;
        }

        public int getSeat() {
            return seat;
        }*/
/////////////////////////////////////////////////////////////////////////////////////////////////////
    static class Converter {
        String binary ;
        public static String toBinary(int num) {

            Converter converter = new Converter();
            converter.binary = "";
            while (num > 0) {

               converter.binary = (num % 2) + converter.binary;

                num /= 2;
            }
            return converter.binary;
        }
    }

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int x = sc.nextInt();
            System.out.print(Converter.toBinary(x));

        }
}


