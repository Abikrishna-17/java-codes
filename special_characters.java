// Your current selection is Java

import java.util.*;

class special{
    public static void main(String[] arga){
        
        Scanner sc = new Scanner(System.in);
        
        String s = sc.nextLine().trim().toLowerCase();
        
        for(int i=0;i<s.length();i++){
            
            char ch = s.charAt(i);
            if(!(ch>='a'&& ch<='z') && !(ch>='0' && ch<='9') && ch!=' '){
                System.out.print(ch+" ");
            }
        }
    }
}
