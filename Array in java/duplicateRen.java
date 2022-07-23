import java.util.*;
public class duplicateRen{
public static boolean isSmaller(int []arr,int j,int i){
    if(arr[j]<arr[i]){
        return true;
    }
    return false;

}
public static void swap(int []arr,int i,int j){
    int temp=arr[i];
    arr[i]=arr[j];
    arr[j]=temp;
}
    public static void sorting(int arr[]){
        for(int i=0;i<arr.length-1;i++){
            int min=i;
            for(int j=i+1;j<arr.length;j++){
                if(isSmaller(arr,j,min)){
                    min=j;

                }
            }
            swap(arr, i, min);

        }
         
    }
    public static void main(String[] args){
    
        int []arr={10,10,20,1,1,24,24,5,7,9,3,4,5,6,3,3,3,4,4,5,6,7,9,9};
        sorting(arr);
        for(int val:arr){
            System.out.print(val+"\t");
        }
        int []temp=new int[arr.length];
        int j=0;
        for(int i=0;i<arr.length-1;i++){
            if(arr[i]!=arr[i+1]){
                temp[j]=arr[i];j++;
            }
            if(i==arr.length-2){
                temp[j]=arr[i+1];j++;
            }
        }
        System.out.println();
        for(int k=0;k<j;k++){
            System.out.print(temp[k]+" ");
        }
    }
}