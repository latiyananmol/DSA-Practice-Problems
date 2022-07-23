// decimal to binary Number .
import java.util.*;
public class one{
        public static void main(String[] args){
        Scanner scn=new Scanner(System.in);
        int n =scn.nextInt();
        int mult=1;
        int ans=0;
        while(n>0){
            int r=n%2;
            ans=ans+r*mult;
            mult=mult*10;
            n=n/2;
        }
        System.out.println("binary of the respective number is "+ans);
    }
}