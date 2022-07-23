import java.util.*;
public class four {
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
        

        int limit =r1*c1;
        int count =1;
        int minr=0;
        int minc=0;
        int maxr=arr.length-1;
        int maxc=arr[0].length-1;
        while(count<=limit){
            for(int r=minr;r<=maxr;r++){
                System.out.println(arr[r][minc]); count++;
            }
            minc++;
            for(int c=minc;c<=maxc;c++){
                System.out.println(arr[maxr][c]); count++;
            }
            maxr--;
            for(int r=maxr;r>=minr;r--){
                System.out.println(arr[r][maxc]); count++;
            }
            maxc--;
            for(int c=maxc;c>=minc;c--){
                System.out.println(arr[minr][c]); count++;
            }
            minr++;
            
            


        }
    }
    
}
