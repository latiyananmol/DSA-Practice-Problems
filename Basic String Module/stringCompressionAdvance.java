import java.util.*;
public class stringCompressionAdvance {
    public static void main(String[] args){
        Scanner scn=new Scanner(System.in);
        String str="aaaabbbvvvvccceeedd";
        // solution 
        String ans="";
      
        int count=1;
        ans=ans+str.charAt(0);
        for(int i=1;i<str.length();i++){
            char curr=str.charAt(i);
            char prev=str.charAt(i-1);
            if(curr==prev){
                count++; }
            else {
                if(count>1){
                ans=ans+count+curr;
                count =1;
            
            }else{
                ans=ans+curr;
            }
                
                }


        }
        if(count>1){
            ans=ans+count;
        }
        System.out.println(ans);
    }
    
}
