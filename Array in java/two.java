// span of array span =maxin array- min in array;
import java.util.*;
public class two {
    public static void main(String[] args){
        Scanner scn=new Scanner(System.in);
        int []arr={10,20,30,50,99,1,22,23,5,6,90,76,56,34,54,65};
        int max=Integer.MIN_VALUE;
        for(int i=1;i<arr.length;i++){
            if(max<arr[i]){
                max=arr[i];
            }

        }
        int min=Integer.MAX_VALUE;
        for(int i=0;i<arr.length;i++){
            if(min>arr[i]){
                min =arr[i];

            }
        }
        System.out.println("the minimum is "+min);
        System.out.println("the Maximum  is "+max);
    System.out.println("Span is  "+(max-min));


    }
    
}
