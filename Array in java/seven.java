// inverse in array
import java.util.*;
public class seven {
    public static int[] inverse(int[] arr){
        int j=arr.length-1;
        int i=0;
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
        inverse(arr);
        for(int val:arr){
            System.out.print(val+"  ");
        }
    }
    
}
