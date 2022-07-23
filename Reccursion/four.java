import java.util.*;
public class four {
    public static int pow(int x,int n){
        if(n==0){return 1;}
        int ans=x*pow(x,n-1);
        return ans;
    }
    public static void main(String[] args){
        Scanner scn=new Scanner(System.in);
        System.out.println("enter the x");
        int x=scn.nextInt();
        System.out.println("enter the n");
        int n=scn.nextInt();
        int ans=pow(x,n);
        System.out.println("answer is " +ans);
    }
    
}
