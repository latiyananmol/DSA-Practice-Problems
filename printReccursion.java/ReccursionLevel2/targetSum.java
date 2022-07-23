import java.util.*;
public class targetSum {
    public static void printTargetSum(int[]arr,int index,int sum,String psf,int tar){
        if(index==arr.length){
            //System.out.println("DOT");
            if(sum==tar){
                System.out.println(psf);
            }
            return;
        }

        printTargetSum(arr, index+1, sum+arr[index], psf+"\t"+arr[index], tar);
        printTargetSum(arr, index+1, sum, psf, tar);
    }
    public static void main(String[] args){
        Scanner scn=new Scanner(System.in);
        int[] arr={10,20,30,5,25,29,1,28,2};
        int index=0;
        int sum=0;
        String psf="";
        int tar=30;
        printTargetSum(arr,index,sum,psf,tar);
        }
    
}
