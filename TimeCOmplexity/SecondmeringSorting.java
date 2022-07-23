// sorting a array using the function merge two sorted array ..
// ek program m ek single array ko sorted kese kare using (merge tow sorted array)
import java.util.*;
public class SecondmeringSorting {
    public static  int [] mergeTwoSortedArray(int []arr,int[]arr2){
        int []ans=new int[arr.length+arr2.length];
        int i=0;//arr
        int j=0;// arr2;
        int k=0;// ans
        while(i<arr.length&&j<arr2.length){
        if(arr[i]<arr2[j]){
            ans[k]=arr[i];
            k++;
            i++;
        }else{
            ans[k]=arr2[j];
            k++;j++;
        }
        }

       while(i<arr.length){
        ans[k]=arr[i];
        k++;i++;
       }
       while(j<arr2.length){
        ans[k]=arr2[j];
        k++;j++;
       }
       return ans;
    }
   
    public static int[] mergeSort(int arr[],int lo,int hi){
        if(lo==hi){
            int []fin=new int[1];
            fin[0]=arr[lo];
            return fin;

        }
        
        int mid=(lo+hi)/2;
        int fsa[]=mergeSort(arr, lo, mid);
        int ssa[]=mergeSort(arr, mid+1, hi);
      int sq[]=  mergeTwoSortedArray(fsa, ssa);
      return sq;
        
    }




    public static void main(String[] args){
        Scanner scn=new Scanner(System.in);

System.out.println("anmol");
        int [] arrfive={50,40,30,20,1,3,9,21,41,4,5,6,63,-1,-2,22,25,29,30};
        int lo=0;
        int hi=arrfive.length-1;
      int qw[]= mergeSort(arrfive,lo,hi);
      for(int o:qw){
      System.out.print(o+"  ");
      }
        


    }
    
}
