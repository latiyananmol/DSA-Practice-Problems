import java.util.*;
public class printSubsequence {
    public static void printSubseq(String str,String ans){
        if(str.length()==0){
            System.out.print(ans+" ");
            return;
        }

        printSubseq(str.substring(1), ans+"");

        printSubseq(str.substring(1), ans+str.charAt(0));
    



    }
    public static void main(String[] args){
        Scanner scn=new Scanner(System.in);
        String str="abc";
        printSubseq(str,"");
    }
}
