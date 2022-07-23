// example jeemain ranking arr m content bhut jada hai but diffrence jada nahi hai
//WHY USE COUNT SORT
import java.util.*;
public class countSrt {
    public static void main(String[] args){
        Scanner scn=new Scanner(System.in);
        int[] arr={9,6,3,5,3,4,3,9,6,4,6,5,8,9,9};
        int min=Integer.MAX_VALUE;
        
        for(int i=0;i<arr.length;i++){
            if(min>arr[i]){
                min=arr[i];
            }
        }
        System.out.println("min"+min);
        int max=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(max<arr[i]){
                max=arr[i];
            }
        }
        System.out.println("max"+max);



        int []frequencyarr=new int[max-min+1];
        for(int k=0;k<arr.length;k++){
            int q=arr[k]-min;
            frequencyarr[q]++;
            
        }

System.out.println("frequency arr is ");
    // 
        for(int as:frequencyarr){
            System.out.print(as+"\t");
        }
        System.out.println("frequency arr is  summing ");
        // sumuping 
        for(int i=1;i<frequencyarr.length;i++){
            frequencyarr[i]=frequencyarr[i]+frequencyarr[i-1];
        }
        System.out.println("frequency arr is ");
        for(int as:frequencyarr){
            System.out.print(as+"\t");
        }
        // Ranking array is 
        int []rank=new int[arr.length];
        System.out.println("rank arr is ");
        for(int i=arr.length-1;i>=0;i--){
            int k=arr[i]-min;
    
            int index=frequencyarr[k]-1;
            frequencyarr[k]--;
            
          
            rank[index]=arr[i];

        }
        for(int as:rank){
            System.out.print(as+"\t");
        }
    }

    
    
}
