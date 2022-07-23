import java.util.*;
public  class five{
    public static void main(String[] args){
        Scanner scn=new Scanner(System.in);
        int [] arr={3,4,5};
        int [] arr2={9,9,9};
        int []ans=new int[arr.length>arr2.length?arr.length:arr2.length];
        int j=arr.length-1;// arr
        int i=arr2.length-1;// arr2
        int k=arr.length-1; int c=0; int d=0;
        while(k>=0){
            if(i>=0&&j>=0){
             d=arr[j]+arr2[i]+c;}
            else if(i>=0){
                d=arr2[i]+c;
            }else if(j>=0){
                d=arr[j]+c;
            }

            ans[k]=d%10;
            c=d/10;
            j--;
            k--;
            i--;
            
        }
        if(c!=0){
            System.out.print(c+" ");
        }
        for(int q:ans){
            System.out.print(q+" ");
        }


    }
}