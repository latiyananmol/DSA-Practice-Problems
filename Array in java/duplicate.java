import java.util.*;
public class duplicate {
    public static void main(String[] args){
        int []arr={10,10,20,20,30,40,50,50,50,};
        int []arr1=new int[arr.length];
        int i=0,j=0;
        for(int count=0;count<arr.length;count++){
            if(count==0||count==arr.length-1){
                arr1[i]=arr[count];
                i++;
            }
            else if(arr[count-1]==arr[count]){
            

            }
            else{
                arr1[i]=arr[count];
                i++;
            }
            
        }
        for(int cal:arr1){
            System.out.println(cal+"  ");
        }
    }
    
}
