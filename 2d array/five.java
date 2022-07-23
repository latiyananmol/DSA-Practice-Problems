import java.util.*;
public class  five {
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
int i=0,j=0;
int dir=0;
        while(true){
            dir=(dir+arr[i][j])%4;{
            if(dir==0){
                j=j+1;
            }
            else if(dir==1){
                i=i+1;
            }
            else if(dir==2){
                j=j-1;

            }else if(dir==3){i=i-1;
            }
            if(i<0){
                i++; break;
            }
            else if(j<0){
                j++;break;
            }
            else if(i==arr.length){
                i--; break;
            }
            else if(j==arr[0].length){
                j--;
                break;
            }



            

        }
        
    
}
System.out.println("  "+i+"\t"+j);}

}
