// Printing every posiblity to put in Matrix
import java.util.*;
public class Nqueens{

    public static void func(int [][]arr,int row,String psf)
    {
if(row==arr.length){
    System.out.println(psf+" ");
    return;
}

        for(int col=0;col<arr[0].length;col++){ 
            arr[row][col]=1;
         func(arr, row+1, psf+"\t"+row+"-"+col);
         arr[row][col]=0;

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