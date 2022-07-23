import java.util.*;
public class three {
    // any base to any base 
    public static void main(String[] args){
        Scanner scn=new Scanner(System.in);
        System.out.println("ENTER THE BASE 1 THEN NUMBER 1 AND THEN BASE TO AND GET HTE RESPECTIVE OUT PUT IN BASE 2  ");
        int b1=scn.nextInt();

        int n1=scn.nextInt(); int dum=n1;
        int b2=scn.nextInt();
        int ans=0;
        int mult=1;
        while(n1>0){
            int r=n1%b2;
            ans=ans+mult*r;
            n1=n1/b2;
            mult =mult*b1;

        }
        System.out.println(dum+"in base"+b2+" is "+ans);
    }
    
}
