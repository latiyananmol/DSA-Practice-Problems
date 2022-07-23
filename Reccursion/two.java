import java.util.*;
public class two {
    public static void printd(int n){
        if(n==0){return;}
        System.out.print(n+" ");
        printd(n-1);
    
    }
    public static void main(String[] args){
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        printd(n);
    }
    
}
