import java.util.*;// subarray
public class nine {
    public static void main(String[] args){
        Scanner scn=new Scanner(System.in);
        int [] arr={10,20,30};
        for(int i=0;i<arr.length;i++){
            for(int j=i;j<arr.length;j++){//0 
                for(int k=i;k<=j;k++){
                    System.out.print(arr[k]+"  ");

                }
                System.out.println();
            }
        }

    }
    
}
