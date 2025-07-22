import java.util.*;
public class template {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        float max=0;
        float top=0;
        int n = sc.nextInt();
        temp[] a = new temp[n];
        for(int i=0;i<n;i++) {

            a[i] = new temp();
            System.out.println("enter student detail : "+(i+1));
            System.out.println("Enter your name:");
            a[i].name = sc.next();
            System.out.println("Enter your reg no:");
            a[i].reg = sc.nextInt();
            System.out.println("Enter your marks:");
            a[i].mark = sc.nextFloat();

            if(a[i].mark>max){

                max = Math.max(max,a[i].mark);
                top = i;
            }

        }
        for(int i=0;i<n;i++) {

            System.out.println("Student "+(i+1)+" details:");
            System.out.println(" ");
            System.out.println("student "+(i+1)+" Name : "+a[i].name);
            System.out.println("student "+(i+1)+" reg : "+a[i].reg);
            System.out.println("student "+(i+1)+" mark : "+a[i].mark);

        }
        System.out.println("Highest mark - student "+((int)top+1)+":"+(int)max);
    }
}

 class temp {

    String name;
    int reg;
    float mark;
}
