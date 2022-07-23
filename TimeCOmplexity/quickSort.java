import java.util.*;
public class quickSort { // sorting using partition 
    public static void swap(int []arr,int i,int j){
        int temp =arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
    public static int partition(int []arr,int piviot,int lo,int hi){
        int i=lo;
       int  j=lo;
       while(i<=hi){
        if(arr[i]>piviot){
            i++;
        }
        else if (arr[i]<=piviot){
            swap(arr,i,j);
            j++;
            i++;
        }
       }
j=j-1; // pivit index
      return j;
    }
    public static void quickSortig(int []arr,int lo,int hi){
        if(lo>=hi){
        return;
        }
   
       
        int piviot=arr[hi];
        int p= partition(arr, piviot,lo,hi);
          quickSortig(arr, lo, p-1);
          quickSortig(arr, p+1,  hi);
    }
    public static void main(String[] args){
        int []arr={10,2,5,19,43,21,34,99,91,92,1,3};
        int lo=0;
        int hi=arr.length-1;
        quickSortig(arr, lo, hi);
        for(int p:arr){
            System.out.print(p+"   ");
        }
    }
}
