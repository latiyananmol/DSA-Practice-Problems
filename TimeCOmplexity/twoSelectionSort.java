import java.util.*;
public class twoSelectionSort { // ek min man lo aout phir  check kro ki minimumt konsa hai phit ushko staring m dalte jao 
    // select  minimum 
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
        int []arr={5,8,2,1,9};
        for(int sel=0;sel<arr.length-1;sel++){
            int min=sel;
            for(int k=sel+1;k<arr.length;k++){
                if(isSmaller(arr, k, min)){
                    min=k;
                }
            }
            swap(arr, sel, min);
        }
        for(int val:arr){
            System.out.print(val+" \t");
        }

    }
    
}
