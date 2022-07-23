import java.util.*;
public  class six{
    public static void main(String[] args){
        Scanner scn=new Scanner(System.in);
        int [] arr={1,0};
        System.out.println("anmol");
        int [] arr2={1,0,0,0,0,1,0,};
        int []ans=new int[arr.length>arr2.length?arr.length:arr2.length];
        int i=arr.length-1;// arr
        int j=arr2.length-1;// arr2 bigger 
        int k=ans.length-1; int c=0; int d=0;
        while(k>=0){
            
            if(i>=0){
                if(arr2[j]>=arr[i]){
                d=arr2[j]-arr[i]+c;
                c=0;
                }else{
                    d=10+arr2[j]-arr[i]+c;
                     c=-1;
                }
            }else {
                d=arr2[j]+c;
                if(d<0){d=d+10; c=-1;}
            } 
        
            ans[k]=d;
            i--;
            k--;
            j--;
        }
        for(int val:ans){
            System.out.print(val+" ");
        }
        
    }}