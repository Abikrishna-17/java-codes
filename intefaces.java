import java.util.*;

interface Draw{
    void drawable();
    void area();
}
class Circle implements Draw{
int radius;
    Circle(int radius){
        this.radius=radius;
    }
    public void drawable(){
        System.out.println("circle");
    }
    public void area(){
        System.out.println("circle area "+(3.14*radius*radius));
    }
}

class Rectangle implements Draw{

    int length;
    int breath;
    Rectangle(int length,int breath){
        this.length=length;
        this.breath=breath;
    }
    public void drawable(){
        System.out.println("rectangle");
    }
    public void area(){
        System.out.println("rectangle area "+(length*breath));
    }
}


public class ExampleOfInterface {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int radius = sc.nextInt();
        int length = sc.nextInt();
        int breath = sc.nextInt();

        Rectangle d = new Rectangle(length,breath);
        d.drawable();
        d.area();
        Circle c = new Circle(radius);
        c.drawable();
        c.area();


    }
}
