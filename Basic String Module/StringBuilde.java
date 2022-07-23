import java.util.*;
public class StringBuilde {
    public static void main(String[] args){
        Scanner scn=new Scanner(System.in);
        String ans=scn.nextLine();
      StringBuilder sb=new StringBuilder(ans);
      System.out.println(sb);
      sb.insert(0,"abcd");
       System.out.println(sb);

       sb.deleteCharAt(0);
       System.out.println(sb);
       sb.append("Qwer");
       System.out.println(sb);
        
    }
    
}
