import java.util.*;
public class one {
    public static void main(String[] args){
        Scanner scn=new Scanner(System.in);
        int []arr=new int[10];
        System.out.println("enter the complete array");
        for(int i=0;i<arr.length;i++){
       arr[i]=scn.nextInt();
        }



        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]+" At Index "+i);
        }
    }
    
}
