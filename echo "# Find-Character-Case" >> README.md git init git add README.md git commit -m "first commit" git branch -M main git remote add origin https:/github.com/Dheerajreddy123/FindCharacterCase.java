import java.util.*;
public class Solution {
    
    public static void main(String[] args) {
      String str;
        Scanner s=new Scanner(System.in);
        str=s.next();
        char c=str.charAt(0);
        if(c>='A'&&c<='Z'){
            System.out.println("1");
        }
        else if(c>='a'&&c<='z'){
            System.out.println("0");
        }
        else{
            System.out.println("-1");
        }
        
    }
}
