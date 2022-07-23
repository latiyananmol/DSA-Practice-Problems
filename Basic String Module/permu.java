import java.util.*;
public class permu{
    public static  int fact(int a){
        if(a==1){return a;};
        int ans=a*fact(a-1);
        return ans;
    }
    public static void main(String[] args){
        Scanner scn=new Scanner(System.in);
        String str="abc";
        int q=str.length();
     
        int l=fact(str.length());
        for(int i=0;i<l;i++){
            StringBuilder sb=new StringBuilder(str);
            int temp=i;
            for(int div=q;div>=1;div--){
                int r=temp%div;
                temp=temp/div;
                System.out.print(sb.charAt(r)+ " ");
                sb.deleteCharAt(r);
            }
            System.out.println();
   
        }


    }
}