import java.util.*;
public class printStairs {
    public static void printStairs(int n,String ans){
        if(n==0){
            System.out.print(ans+"\t");
            return;
        }else if(n<0){
            return;
        }


        printStairs(n-1, ans+"1");
        printStairs(n-2, ans+"2");
        printStairs(n-3, ans+"3");
        

    }
    public static void main(String[] args){
        Scanner scn=new Scanner(System.in);
        int stairs=scn.nextInt();
        printStairs(stairs,"");
    
}
}