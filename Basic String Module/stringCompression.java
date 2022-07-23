import java.util.*;
public class stringCompression {
    public static void main(String[] args){
        Scanner scn=new Scanner(System.in);
        String str=scn.nextLine(); //aabbccc
        String ans=""+str.charAt(0);
        for(int i=1;i<str.length();i++){
            char cur=str.charAt(i);
            char prev=str.charAt(i-1);
            if(cur!=prev){
                ans=ans+cur;
            }

        }
        System.out.println("Compressed String is "+ans);

    

    }
    
}
