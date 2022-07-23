import java.util.*;
public class quickSelect {
    public static void swap(int []arr,int i,int j){
        int temp =arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
    public static int pati(int [] arr,int lo,int hi,int piviot){

        int i=lo;
        int j=lo;
        while(i<=hi){
            if(arr[i]>piviot){
                i++;
            }else {
                swap(arr,i,j);
                i++;
                j++;

            }
        }j--;
        return  j;


    }
    public static int quickSelecto(int arr[],int pos, int lo,int hi){


        int piviot=arr[hi];
        int pi= pati(arr, lo, hi, piviot);
        if(pi==pos){
            return arr[pi];
        }
        else if(pos<pi){
         return   quickSelecto(arr, pos, lo, pi-1);
            
        }
        else{ // indx>
       return     quickSelecto(arr, pos, pi+1, hi);

        }




    }
    public static void main(String[] args){
        Scanner scn=new Scanner(System.in);
        int []arr={1,3,41,99,21,39,29,31,24,4,56,57,6,8,37,43,49,32};
        // [1,2,4,6,8]
        System.out.println("find  the  fourth greatest number from the arr and arr is not sorted");
        // the number is forth smallest toh it will be at index 3
        int thxthsmallest=arr.length;
        int indexofthexthsmallestwillbe=thxthsmallest-1;
        int lo=0;
        int hi=arr.length-1;
     int number=   quickSelecto(arr,indexofthexthsmallestwillbe,lo,hi);
     System.out.println(number);


    }
    
}
