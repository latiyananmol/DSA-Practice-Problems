import java.util.*;
 public class three {
    public static void main(String[] args){
        Scanner scn=new Scanner(System.in);
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
        for(int col=0;col<arr[0].length;col++){
            if(col%2==0){
                for(int r=0;r<arr.length;r++){
                    System.out.println(arr[r][col]);
                }
            }
            else {
                for(int r=arr.length-1;r>=0;r--){
                    System.out.println(arr[r][col]);
                }
            }
        }
        
    }


    }
    
