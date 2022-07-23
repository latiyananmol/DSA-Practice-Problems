import java.util.*;
public class printPermutation {
    public static void printPer(String str,String ans){
        if(str.length()==0){
            System.out.print(ans+"  ");
            return;
        }
       

        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
             
             String p =str.substring(0,i)+str.substring(i+1);// IMPOrtant
            printPer(p, ans+ch); 
            
        }



    }
    public static void main(String[] args){
        Scanner scn=new Scanner(System.in);

        String str="abc";
        System.out.println(str.substring(0,0)+"\t"+str);


        
     printPer(str,"");
    
}
}