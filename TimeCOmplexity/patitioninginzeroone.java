import java.util.*;
public class patitioninginzeroone {
    public static void swap(int []arr,int i,int j){
        int temp =arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
    public static void part(int[]arr,int pivit){
        int i=0;
        int j=0;
        while(i<arr.length){
            if(arr[i]>pivit){
                i++;
            }
            else if(arr[i]<=pivit){
                swap(arr,i,j);
                i++;j++;
            }
        }
    }
    public static void main(String[] args){
        int []arr={0,0 ,0 ,1,1,1,1,1,0,0,0,0,0,0,0,1,1,1,1};
        part(arr,0);
        for(int a:arr){
            System.out.print(a+" ");
        }

    }
}
