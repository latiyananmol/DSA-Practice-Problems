import java.util.*;
public class InsertionSort {
    public static void swap(int []arr,int i,int j){
        int temp =arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
    public static boolean isGreater(int[]arr,int j,int i){
if(arr[j]>arr[i]){return true;}
else{return false;}
    }
    public static void main(String[] args){
        Scanner scn=new Scanner(System.in);
        int []arr={5,8,2,1,9,99,999,1,2,3,4,5,101,35};
        for(int i=1;i<arr.length;i++){
            for(int j=i;j>=1 ;j--){
                if(isGreater(arr,j-1,j)){
                    swap(arr,j-1,j);
                }
                else {
                    break;
                }

            }
        }
        for(int val:arr){
            System.out.print(val+" ");
        }
    }
    
}
