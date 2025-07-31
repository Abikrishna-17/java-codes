
interface Payment{

   void pay(double amount);
}

class Credit_card implements Payment{

    public void pay(double amount){
        System.out.println("Pay using credit card : "+amount);
    }
}

class Upi implements Payment{

    public void pay(double amount){
        System.out.println("Pay using UPI : "+amount);
    }
}
public class In {
    public static void main(String[] args) {
        int amount = 10000;
        Upi u = new Upi();
        u.pay(amount);
    }
}
