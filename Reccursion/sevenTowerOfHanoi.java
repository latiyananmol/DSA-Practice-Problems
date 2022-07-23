import java.util.*;
public class sevenTowerOfHanoi {
    public static void towerOfHanoi(int n,int t1,int t2, int t3){
        if(n==0) return;
        towerOfHanoi(n-1, t1, t3, t2);
        System.out.println(n+"ko move karo "+t1+"se"+t2);
        towerOfHanoi(n-1, t3, t2, t1);
    }

    public static void main(String[] args){
        Scanner scn=new Scanner(System.in);
        int t1=10;
        int t2=20;
        int t3=30;
        int numberofdics=scn.nextInt();
        towerOfHanoi(3,t1,t2,t3);//
    }
    
}
