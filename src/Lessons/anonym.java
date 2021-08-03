package Lessons;

public class anonym {
        public static void main(String[] args) {

            Purchase customer = new Purchase();
            Purchase specialCustomer = new Purchase(){
              @Override  public int totalAmount(int a) {
                  return a;
                }
            };
            System.out.println(specialCustomer.totalAmount(100000*20)/100);
            System.out.println(customer.totalAmount(1000));

        }
    }

    class Purchase {
        int price;

        public int totalAmount(int price) {
            return price - (price*10)/100;
        }

    }

