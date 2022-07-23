import java.util.*;
public class nine {
    public static void printR(int []arr,int index){
        if(index==arr.length){return;}
        printR(arr, index+1);
        System.out.println(arr[index]+" ");
     




    }
    public static void main(String[] args){
        Scanner scn=new Scanner(System.in);
        int[] arr={1,2,3,4,5,6,7,8,9,10};
        printR(arr,0);
    }
    
}
