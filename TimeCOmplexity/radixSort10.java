import java.util.*;
public class radixSort10{
    public static void radixSort(int[]arr){
        int max=Integer.MIN_VALUE;
        for(int val:arr){
            if(val>max){
                max=val;
            }
        }
        System.out.println("Maximum is "+max);
        int exp=1;
        while(exp<=max){
            countSort2(arr,exp);
            exp=exp*10;
        }
    }
    public static void countSort2(int []arr,int exp){
        int []ans=new int [arr.length];
        int []fr=new int [10];
        for(int i=0;i<arr.length;i++){
            int p=(arr[i]/exp)%10;
            fr[p]++;
        }
        // ferquencySUmarray
        for(int i=1;i<fr.length;i++){
            fr[i]=fr[i]+fr[i-1];
        }
        // 
        for(int k=arr.length-1;k>=0;k--){
            int last=(arr[k]/exp)%10;
            int pos=fr[last]-1;
            ans[pos]=arr[k];
            fr[last]--;

        }
        for(int i=0;i<arr.length;i++){
            arr[i]=ans[i];
        }
        System.out.println();
        for(int val:arr){
            
            System.out.print(val+"\t");
        }


        }

    public static void main(String[] args){
        Scanner scn=new Scanner(System.in);
        // int []arr=new int [10];
       int []arr={213,97,718,123,37,443,982,64,375,683};

        // for(int i=0;i<arr.length;i++){
        //     arr[i]=scn.nextInt();
        // }
radixSort(arr);
    }
}