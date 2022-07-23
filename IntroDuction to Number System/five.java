import java.util.*;
public class five {
    public static void main(String[] args){
        Scanner scn=new Scanner(System.in);
        int n2=scn.nextInt();
        int n1=scn.nextInt();
        int b=scn.nextInt();int c=0; int mult=1;
        int diff=0; int ans=0;
        while(n2>0){
            int d2=n2%10; n2=n2/10;
            int d1=n1%10; n1=n1/10;
            d2=d2+c;
            if(d2>=d1){
                diff=d2-d1;
                c=0;
            }else{
                
                diff=d2-d1+b;
                c=-1;
            }
            ans=ans+diff*mult;
            mult=mult*10;

        }
        System.out.println(ans);
    }
    
}
