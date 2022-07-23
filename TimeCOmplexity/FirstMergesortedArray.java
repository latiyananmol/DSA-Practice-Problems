import java.util.*;
public class FirstMergesortedArray {
    public static void main(String[] args){
        Scanner scn=new Scanner(System.in);
        int []arr={10,20,30,40,50,60};
        int []arr2={11,12,13,14,15,16,25,35,45,55};   
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
    
for(int val:ans){
    System.out.print(val+"  ");
}
    
    
    
    
    }
    
}
