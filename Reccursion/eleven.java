import java.util.*;
public class eleven {
    public static int findFirst(int []arr,int find,int index){
       if(index==arr.length){
        return -1;
       }

        int fi=findFirst(arr, find, index+1);
        if(fi==-1){
            if(arr[index]==find){
                return index;
            }else{
                return -1;
            }
        }
              
            else{
                if(arr[index]==find){
                    return index;
                }
            }
            return fi;
        
        }
        
    
    public static void main(String[] args){
        Scanner scn=new Scanner(System.in);
        int[] arr={10,10,10,30,40,50,60,60,70,70,80,90,101,101,12,13,16,999,1919,1010};
        int find=10;//12
       int ans= findFirst(arr,find,0);
       System.out.println("THE DIFFRENCE BETWEEN THE "+ans);
    }
    
}
