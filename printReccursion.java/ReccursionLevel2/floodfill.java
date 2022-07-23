import java.util.*;
public class floodfill{
    public static void floodfiller(int[][]arr,int  r,int c,String psf,int [][]bol){
        if(r<0||c<0||r==arr.length||c==arr[0].length||arr[r][c]==1||bol[r][c]==1){
            return;

        }

        else if((r==arr.length-1)&&(c==arr[0].length-1)){
            System.out.println(psf);return;

        }

bol[r][c]=1;

        floodfiller(arr, r-1, c, psf+"T", bol);// Top
        floodfiller(arr, r+1, c, psf+"D", bol);// Down
        floodfiller(arr, r, c-1, psf+"L", bol);// left
        floodfiller(arr, r, c+1, psf+"R", bol); // right 
        bol[r][c]=0;


    }
    public static void main(String[] args){
        Scanner scn=new Scanner(System.in);
        System.out.println("enter the roe and col");
        int r=scn.nextInt();
        int c=scn.nextInt();
        int [][]bol=new int[r][c];
        int [][] arr=new int[r][c];
        System.out.println("enter the complete array here");
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                arr[i][j]=scn.nextInt();
            }
        }
        System.out.println("enter the complete array Bro");
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }

        floodfiller(arr,0,0,"",bol);

    }
}