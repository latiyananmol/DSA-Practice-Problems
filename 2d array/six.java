// ROTATE 90 DEGREE
import java.util.*;
public class six {
    public static void main(String[] args){
        Scanner scn=new Scanner(System.in);
        System.out.println("enter the r1 and c1");
        int r1=scn.nextInt();
        int c1=scn.nextInt();
        int [][]arr=new int[r1][c1];

        for(int r=0;r<arr.length;r++){
            for(int c=0;c<arr[0].length;c++){
                arr[r][c]=scn.nextInt();
            }
        }
        for(int r=0;r<arr.length;r++){
            for(int c=0;c<arr[0].length;c++){
                System.out.print(arr[r][c]+"  ");
            }
            System.out.println();
        }
        System.out.println("************************************************************************");
/////////////////////////////////////////////////////////////////////////////////////////////////////
// transpose of the above matrix is 
for(int r=0;r<arr.length;r++){
    for(int c=r;c<arr[0].length;c++){
        int temp=arr[r][c];
        arr[r][c]=arr[c][r];
        arr[c][r]=temp;
      
    }
 
}
System.out.println("************************************************************************");

// printing the transposed matrix
for(int r=0;r<arr.length;r++){
    for(int c=0;c<arr[0].length;c++){
        System.out.print(arr[r][c]+"  ");
    }
    System.out.println();
}
// INVERSING IT 
for(int r=0;r<arr.length;r++){
int i=0;
int j=arr[0].length-1;
while(i<=j){
    int temp=arr[r][i];
    arr[r][i]=arr[r][j];
    arr[r][j]=temp;
    i++;
    j--;

}

    
   
}
System.out.println("************************************************************************");
        // 
        for(int r=0;r<arr.length;r++){
            for(int c=0;c<arr[0].length;c++){
                System.out.print(arr[r][c]+"  ");
            }
            System.out.println();
        }
    }
    
}
