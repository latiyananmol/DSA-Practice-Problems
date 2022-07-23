import java.util.*;
public class printMazePathwithJumps {
public static void printMazeJumpo(int sr,int sc,int dr,int dc,String ans){
    if(sr==dr&&sc==dc){
        System.out.print(ans+" ");return;
    }

 // Horizontal 
 for(int i=1;i<=dc-sc;i++){
    printMazeJumpo(sr, sc+1, dr, dc,ans+"h"+i);

 }
 // ver 
 for(int i=1;i<=dr-sr;i++){
    printMazeJumpo(sr+i, sc, dr, dc,ans+"V"+i);

 }
 // diagonmally
 for(int i=1;i<= dr-sr && i<=dc-sc ;i++){
    printMazeJumpo(sr+i, sc+i, dr, dc,ans+"D"+i);


 }





  
}
    public static void main(String[] args){
        Scanner scn=new Scanner(System.in);
        printMazeJumpo(1,1,3,3,"");
        
    }
    
}
