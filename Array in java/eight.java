// rotation in array
import java.util.*;
public class eight {
    public static int[] inverse(int[] arr,int i,int j){
    
    while(i<=j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
        i++;
        j--;

    }return arr;
    }
    public static void main(String[] args){
        Scanner scn=new Scanner(System.in);
        int [] arr={10,20,30,40,50,60};
        for(int val:arr){
            System.out.print(val+"  ");
        }
        
        int rotate=scn.nextInt();
        inverse(arr, 0, arr.length-1-rotate);
        inverse(arr, arr.length-rotate, arr.length-1);
        inverse(arr, 0, arr.length-1);
        for(int val:arr){
            System.out.print(val+"  ");
        }
       
    }
    
}
