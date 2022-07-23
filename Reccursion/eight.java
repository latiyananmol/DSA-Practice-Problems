import java.util.*;
public class eight {// DISPLAY  ARRAY
    public static void DisplayArr(int []arr,int index){
        if(index==arr.length){
            return;
        }
        System.out.println(arr[index]);
       DisplayArr(arr, index+1);
    }
    public static void main(String[] args){
        Scanner scn=new Scanner(System.in);
        int [] arr={10,20,30,40,50,60,70,80,90};
        DisplayArr(arr,0);
        

        
    }
    
}
