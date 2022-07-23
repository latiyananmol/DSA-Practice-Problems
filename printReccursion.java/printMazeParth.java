import java.util.*;
public class printMazeParth {
    public static void printMathPath(int sr,int sc,int dr,int dc,String ans){
        if(sr==dr&&sc==dc){
            System.out.print(ans+"\t");
            return;
        }
        


        // hor
        if(sc<=dc) printMathPath(sr, sc+1, dr, dc, ans+"H");
           //ver
        if(sr<=dr)   printMathPath(sr+1, sc, dr, dc, ans+"V");




    }
    public static void main(String[] args){
        Scanner scn=new Scanner(System.in);
        printMathPath(1,1,4,4,"");
    }
    
}
