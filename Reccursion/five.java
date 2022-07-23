import java.util.*;
public class five {
    public static int  powlog(int x,int n){
        if(n==0){return 1;}
        int ans=powlog(x,n/2);
        int f=ans*ans;
        if(n%2==1){
            f=f*x;
        }
      return f;
    }

    public static void main(String[] args){
        Scanner scn=new Scanner(System.in);
        int x=scn.nextInt();
        int n=scn.nextInt();
        System.out.println("anmol");
       int ans= powlog(x,n);
       System.out.println(ans);
    }
    
}
