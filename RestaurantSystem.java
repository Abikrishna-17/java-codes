
import java.util.Scanner;

public class RestaurantSystem{

    static int sum =0;

    public static class Menuitems{
        static void list() {
            System.out.println("Welcome to our restaurant 😍");
            System.out.println("1.Noodles 🍜");
            System.out.println("2.Idli ⚪");
            System.out.println("3.Parotta 🫓");
            System.out.println("4.Chicken Briyani 🍗");
            System.out.println("5.Exit 🚪");
            System.out.println("6.Bill 👛");
        }
    }

    public static class order {

        public static void details() {
            Scanner sc = new Scanner(System.in);
            int n;
            while(true) {
                System.out.println("-----------------------------------");
                System.out.println("Enter your Dish 🤤: ");
                 n = sc.nextInt();
                 if(n==5){
                     break;
                 }

                int quantity,store;
                switch (n) {

                    case 1:
                        System.out.println("Enter the quantity : ");
                        quantity = sc.nextInt();
                        store = quantity * 25;
                        sum=sum+store;
                        break;

                    case 2:
                        System.out.println("Enter the quantity : ");
                        quantity = sc.nextInt();
                        store = quantity * 15;

                        sum=sum+store;
                        break;
                    case 3:
                        System.out.println("Enter the quantity : ");
                        quantity = sc.nextInt();
                        store = quantity * 20;
                        sum=sum+store;
                        break;
                    case 4:
                        System.out.println("Enter the quantity : ");
                        quantity = sc.nextInt();
                        store = quantity * 100;
                        sum=sum+store;
                        break;
                    case 6:
                        Bill b = new Bill();
                        b.total(sum);
                        return;

                    default:
                        System.out.println("Not available");
                }
            }

        }
    }

    public static void main(String[] args) {
        Menuitems m = new Menuitems();
        m.list();
        order o = new order();
        o.details();


    }
}

 class Bill{

    void total(int amount){
        System.out.println("-----------------------------------");
        System.out.println("Your Bill 😊 : "+amount);
    }
}
