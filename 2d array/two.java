// matrix multiplication 
import java.util.*;
public class two {
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
        


        System.out.println("enter the r2 and c2");
        int r2=scn.nextInt();
        int c2=scn.nextInt();
        int [][]arr2=new int[r2][c2];

        for(int r=0;r<arr2.length;r++){
            for(int c=0;c<arr2[0].length;c++){
                arr2[r][c]=scn.nextInt();
            }
        }
        for(int r=0;r<arr2.length;r++){
            for(int c=0;c<arr2[0].length;c++){
                System.out.print(arr2[r][c]+"  ");
            }
            System.out.println();
        }

        int[][] ans=new int [r1][c2];
        for(int r=0;r<ans.length;r++){
            for(int c=0;c<ans[0].length;c++){
            for(int count=0;count<r2;count++){
             ans[r][c]=arr[r][count]*arr2[count][c]+ans[r][c];
                      
            }
               
            }
        
        }
        for(int ro=0;ro<ans.length;ro++){
            for(int col=0;col<ans[0].length;col++){
                System.out.print(ans[ro][col]+"\t");
            }
            System.out.println();
        }
        
    }
    
}
