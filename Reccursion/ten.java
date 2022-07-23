//  Ten java // FIND MAXIMUM IN ARRAY 
import java.util.*;
public class ten {
    public static int  findMax(int[] arr,int index){
        if(index==arr.length-1){
           return arr[index];
        }

        int max=findMax(arr, index+1);
        if(arr[index]>max){
            return arr[index];
        }else{
            return max;
        }
    }
    public static void main(String[] args){
        Scanner scn=new Scanner(System.in);
        int [] arr={1000,1,20,200,21,23,99,201,203,204,210};
       int max= findMax(arr,0);
       System.out.println("THE MAXIMUM  IS "+max);
    }
    
}
   