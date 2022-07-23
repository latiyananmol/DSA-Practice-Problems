import java.util.*;
public class sixPrintZigzag {
    public static void print(int n){
        if(n==0){return;}
        System.out.println("PRE "+n);
        print(n-1);
        System.out.println("IN "+n);
        print(n-1);
        System.out.println("POST "+n);
 

    }
    public static void main(String[] args){
        System.out.println("BRO");
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
         
        print(n);
    }
    
}
