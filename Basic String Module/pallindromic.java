import java.util.*;
public class pallindromic {
    public static void main(String[] args){
        Scanner scn=new Scanner(System.in);
        String str="NAMAN";
        int i=0;
        int j=str.length()-1;
        while(i<=j){
            if(str.charAt(i)!=str.charAt(j)){
                System.out.println("the string is not a pallindromic ");return;
            }
            i++;
            j--;
        }
        System.out.println("the string   "+"{"+str+"}"+"   is Pallindromic String");
    }
    
}
