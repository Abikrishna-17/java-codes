import java.util.Scanner;

class Stall{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("1.chikenbriyani 🍗");
        System.out.println("2.muttonbriyani 🐐");
        System.out.println("3.chikenbriyaniwith65 🐔🍗");
        String s = sc.next();
        if(s.equals("chikenbriyaniwith65")){
            Chickenbriyani_with65 cb65 = new Chickenbriyani_with65();
            cb65.add65();
        } else if (s.equals("muttonbriyani")) {
            Muttonbriyani m = new Muttonbriyani();
            m.addmutton();
        }
        else if(s.equals("chickenbriyani")){
            Chickenbriyani c = new Chickenbriyani();
            c.addchicken();
        }
        else {
            System.out.println("no dish available");
        }

    }
}

 class BriyaniRice {

    void addrice(){
        System.out.println("biryani rice added 🍚");

    }
}

class Chickenbriyani extends BriyaniRice{

    void addchicken(){

        System.out.println("chicken added 🍗🍚");
        addrice();
    }
}

class Muttonbriyani extends BriyaniRice{
    void addmutton(){
        System.out.println("mutton added 🐐");
        addrice();
    }
}

class Chickenbriyani_with65 extends Chickenbriyani{
    void add65(){
        addchicken();
        System.out.println("serve chicken 65 with chicken briyani 🐔🍗🍚");
    }
}
