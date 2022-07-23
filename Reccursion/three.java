import java.util.*;
public class three {
    public static int fact(int n){
        if(n==1){return 1;}
        int q=n*fact(n-1);
        return q;
    }
    public static void main(String[] args){
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        int ans=fact(n);
        System.out.println(ans+"  THIS FINAL ANSWER ");
    }
}
