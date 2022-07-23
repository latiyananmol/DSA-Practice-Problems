import java.util.*;
public class one {
    public static void printInc(int n){

     if(n==0){return;}
     printInc(n-1);
     System.out.print(n+" ");
    }
    public static void main(String[] args){
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        printInc(n);
    }
    
}
