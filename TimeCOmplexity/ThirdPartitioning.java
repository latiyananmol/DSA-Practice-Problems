import java.util.*;
public class ThirdPartitioning {
    public static void swap(int []arr,int i,int j){
        int temp =arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
    public static void partition(int []arr,int piviot){
        int i=0;
       int  j=0;
       while(i<arr.length){
        if(arr[i]>piviot){
            i++;
        }
        else if (arr[i]<=piviot){
            swap(arr,i,j);
            j++;
            i++;
            
        }
       }
    }
    public static void main(String[] args){
        int []arr={7,9,4,8,3,6,2,1};
        partition(arr,5);
        for(int val:arr){
            System.out.print(val+" ");
        }
        
    }
    
}
