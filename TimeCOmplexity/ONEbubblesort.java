import java.util.*;
public class ONEbubblesort{ // BABLU SAB SE BDA LAST M LE K JAO STEP BY STEP
    /**
     * @param arr
     * @param i
     * @param j
     * @return
     */
    public static boolean isSmaller(int[]arr,int i,int  j){
        if(arr[i]<arr[j]){
            return true;
        }else
        {
            return false;
        }

    }
    public static void swap(int []arr,int i,int j){
        int temp =arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
    public static void main(String[] args){
        Scanner scn=new Scanner(System.in);
        int[] arr={9,6,3,5,3,4,3,9,6,4,6,5,8,9,9};
        for(int itr=1;itr<=arr.length-1;itr++){
            for(int j=0;j<arr.length-itr;j++){
                if(isSmaller(arr, j+1 ,j )){
                    swap(arr, j+1, j);
                }
            }
        }












        // for(int i=0;i<arr.length-1;i++){
        //     for(int j=0;j<arr.length-1-i;j++){
        //         if(isSmaller(arr,j+1,j)){
        //             swap(arr,j+1,j);
        //         }
        //     }
        // }
    for(int val:arr){
        System.out.print(val+"  ");
    }
    
    }
}