// why we need String builder 
import java.util.*;
public class problemInString {
    
    public static void main(String[] args){
        Scanner scn=new Scanner(System.in);
        String st="abc";
        for(int i=0;i<10000000;i++){
            String ans=st+i;
            System.out.print(ans+"  ");
        }
    }
}
// so over come this we use the StringBuilder