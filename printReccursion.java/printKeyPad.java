import java.util.*;
public class printKeyPad {
    public static String[] key={"?.","acb","def","ghi","jkl","mnop","qrst","uv","wxyz",",;"};
    public static void printKey(String str,String ans){

        if(str.length()==0){
            System.out.print(ans+"\t");
            return;
        }

        char ch1=str.charAt(0);
        String k=key[ch1-'0'];
        for(int i=0;i<k.length();i++){
            printKey(str.substring(1), ans+k.charAt(i));

        }





    }
    
    public static void main(String[] args){
        Scanner scn=new Scanner(System.in);
        String str="567";
        printKey(str,"");
    }
}
