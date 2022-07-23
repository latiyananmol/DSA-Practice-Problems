// bar chart 
import java.util.*;
public class four {
    public static void main(String[] args){
        Scanner scn=new Scanner(System.in);
        int [] arr={4,5,3,4,2,6,7,3,4,10,11};
        int max=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        for(int qw=max;qw>=1;qw--){
            for(int i=0;i<arr.length;i++){
                if(arr[i]>=qw){
                System.out.print("*\t");
                }
                else {
                    System.out.print("\t");
                }
            }
            System.out.println();     System.out.println();
        }

    }
    
}
