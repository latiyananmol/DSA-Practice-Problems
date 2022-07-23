// four.java any base addition 
import java.util.*;
public class four {
    public static void main(String[] args){
        Scanner scn=new Scanner(System.in);
        System.out.println("enter the base ");
        int b=scn.nextInt();
        int n1=scn.nextInt();
        int n2=scn.nextInt(); int c=0;
        int ans=0;
        int mult=1;
        while(n1>0||n1>0||c>0){
            int a=n1%10; n1=n1/10;
            int a2=n2%10; n2=n2/10;
            int f=a+a2+c;
          int   f1=f%b;
          ans=ans+f1*mult;
          c=f/b;
          mult =mult*10;

        }
        System.out.println("the final answer is  "+ans+" in base "+b);
    }
    
}
