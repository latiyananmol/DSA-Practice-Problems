import java.util.*;
public class dateSort11 {
    // Integer.parseInt(arr[i],10);
    public static void  radixDateSort(String []arr){
        countSort3(arr, 1000000, 100, 32);// days
        countSort3(arr, 10000, 100, 13);// months
        countSort3(arr, 1, 10000, 2501);// years


    }
    public static void countSort3(String []arr,int div,int mod,int range){
        String []ans=new String[arr.length];  // String[] arr=new String[n];
        int[] fr=new int [range];
        for(int i=0;i<arr.length;i++){
            int pof=(Integer.parseInt(arr[i],10)/div)%mod;
            fr[pof]++;
        }
        // sumUpFrequency Array
        for(int i=1;i<fr.length;i++){
            fr[i]=fr[i]+fr[i-1];
            
        }
        // now 
        for(int z=arr.length-1;z>=0;z--){ // sorting according to input
            int  val=(Integer.parseInt(arr[z],10)/div)%mod;
            int pos=fr[val]-1;
            ans[pos]=arr[z];
            fr[val]--;
        }
        System.out.println();
        for(String val:ans){
            
            System.out.print(val+"\t");
        }


    }
    public static void main(String[] args){
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt(); 
        String[] arr=new String[n];
        for (int i = 0; i < n; i++) {
            String str = scn.next();
            arr[i] = str;
          }
        radixDateSort(arr);
    }
    
}
