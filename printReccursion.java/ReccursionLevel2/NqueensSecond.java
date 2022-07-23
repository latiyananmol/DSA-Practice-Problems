// is queenSafe
import java.util.*;
public class NqueensSecond {
    
    public static boolean isQueenSafe(int[][]chess,int row,int col){

    
        for(int i=row-1,j=col;i>=0;i--){
            if(chess[i][col]==1){
                return false;
            }
        }
        for(int i=row-1,j=col-1;i>=0&&j>=0;i--,j--){
            if(chess[i][j]==1){
                return false;
            }
        }
        for(int i=row-1,j=col+1;i>=0&&j<chess.length;i--,j++){
            if(chess[i][j]==1){
                return false;
            }
        }
return true;
    }
    public static void func(int [][]arr,int row,String psf)
    {
if(row==arr.length){
    System.out.println(psf+" ");
    return;
}

        for(int col=0;col<arr.length;col++){
          
            if(isQueenSafe(arr,row,col)==true){ 
            arr[row][col]=1;
         func(arr, row+1, psf+"\t"+row+"-"+col);
         arr[row][col]=0;

        }
    }
      


    }
    public static void main(String[] args){
        Scanner scn=new Scanner(System.in);
        int r=scn.nextInt();
        int c=scn.nextInt();
        int [][]arr=new int[r][c];
        func(arr,0,"");
    }
}