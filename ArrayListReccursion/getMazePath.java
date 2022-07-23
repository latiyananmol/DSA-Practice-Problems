// maze is nothing but a matrix
import java.util.*;
public class getMazePath{
    public static ArrayList<String> getMazePath(int sr,int sc,int dr,int dc){
        if(sr==dr&&sc==dc){
            ArrayList<String> bs=new ArrayList<>();
            bs.add("");
            return bs;

        }else if((sr==dr+1)||(sc==dc+1)){
            ArrayList<String> s=new ArrayList<>();
            return s;

        }

        ArrayList<String> ansh=getMazePath(sr,sc+1,dr,dc);//hor;
        ArrayList<String> ansv=getMazePath(sr+1,sc,dr,dc);
        ArrayList<String> res=new ArrayList<>();
        for(String st:ansh){
            res.add("h"+st);
        }
        for(String st:ansv){
            res.add("v"+st);
        }
        return res;
    }
    public static void main(String[] args){
        Scanner scn=new Scanner(System.in);
      System.out.println("in this matrix the row and column start from the 1");

      ArrayList<String> p = getMazePath(1,1,2,2);
      System.out.println(p);
        

    }
}