// find last Index in arr
import java.util.*;
public class twlve {
    public static int findLastIndex(int[]arr,int index,int find){
        if(index==arr.length){
            return -1;
        }


        int lis=findLastIndex(arr, index+1, find);
        if(lis==-1){
            if(arr[index]==find){
                return index;
            }
        }
        return lis;





    }
    public static void main(String[] args){
        Scanner scn=new Scanner(System.in);
        int []arr={1,303,20,20,21,2,3,9,4,56,6,7,8,9,101,102,303,55};//9 last index of 12
        int index=0;
        int find=55;
       int ans= findLastIndex(arr,index,find);
       System.out.println(ans);
    }
    
}
