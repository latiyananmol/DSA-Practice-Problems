import java.util.*;
public class two {// DECIMNAL TO ANY BASE 
    public static void main(String[] args){
        Scanner scn=new Scanner(System.in);
        System.out.println("enter the number in decimal and then enter the base in which you want");
        int n=scn.nextInt();
        int n1=n;
        int b=scn.nextInt();
        int mult =1;
        int ans=0;
        while(n>0){
         int r=n%b;
         n=n/b;
         ans=ans+mult*r;
         mult =mult*10;

        }
        System.out.println(n1+" in base "+b+" is "+ans);
    }
    
}
