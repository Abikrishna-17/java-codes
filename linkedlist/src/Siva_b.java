import java.util.*;

public class Siva_b {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a=sc.next();

        switch (a){

            case "biryani" :
                System.out.println("price : 180");
                break;

            case "burger" :
                System.out.println("price : 100");
                break;

            case "pizza" :
                System.out.println("price : 150");
                break;

            case "meals" :
                System.out.println("price : 200");
                break;

            default :
                System.out.println("not available");
        }

    }
}