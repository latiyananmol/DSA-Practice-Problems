// all indices in Array
import java.util.*;
public class thirteenth{
    public static int[] allIndicesInArray(int []arr,int fsf,int find, int index ){
    if(index==arr.length){
        int []ans=new int[fsf];
        return ans;
    }
        if(arr[index]==find){
            int []arr1=allIndicesInArray(arr, fsf+1, find, index+1);
                 arr1[fsf]=index;
                 return arr1;
        }
        else{
            int []arr2=allIndicesInArray(arr, fsf, find, index+1);
            return arr2;

        }



    }
    public static void main(String[] args){
        Scanner scn=new Scanner(System.in);
        int [] arr={10,20,30,10,40,50,60,10,100,10,101,10,21,25};
        int fill=10;
        int index=0;
     int[] ans=   allIndicesInArray(arr,0,fill,index);
     for(int val:ans){
        System.out.print(val+"  ");
     }

    }

}