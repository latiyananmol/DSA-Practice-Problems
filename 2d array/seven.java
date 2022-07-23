import java.util.*;
public class seven {
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

        // atempt 
        for(int i=0;i<arr[0].length;i++){
            for(int col=i,row=0;col<arr[0].length;col++,row++){
                System.out.print(arr[row][col]+"\t");
            }
        }
        
    }
    
}
