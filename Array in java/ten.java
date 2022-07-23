import java.util.*;//  Binary search
public class ten {
    public static void main(String[] args){
        Scanner scn=new Scanner(System.in);
        int [] arr={10,20,30,40,50,60,70,80,90,111};
        int datatoFind=111;
        int i=0;
        int j=arr.length-1;
       
        while(i<=j){
            int mid=(i+j)/2;
        if(arr[mid]==datatoFind){
            System.out.println(mid);
            return;
        }
        else if(arr[mid]<datatoFind){
          
            i=mid+1;
            
        }else if(arr[mid]>datatoFind){
            j=mid-1;
            
        }}
    }
    
}
