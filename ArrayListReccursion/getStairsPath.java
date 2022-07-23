
import java.util.*;
public class getStairsPath {
    public static ArrayList<String> getStairsPath(int n){

        if(n==0){
            ArrayList<String> base=new ArrayList<>();
            base.add("");
            return base;
        }
        else if(n<0){
            ArrayList<String> base2=new ArrayList<>();
            return base2;

        }

        ArrayList<String> path1=getStairsPath(n-1);
        ArrayList<String> path2=getStairsPath(n-2);
        ArrayList<String> path3=getStairsPath(n-3);
        ArrayList<String> result=new ArrayList<>();
        for(String q:path1){
            result.add("1"+q);
        }
        for(String q:path2){
            result.add("2"+q);
        }
        for(String q:path3){
            result.add("3"+q);
        }
        return result;


        
    }
    
    public static void main(String[] args){
        Scanner scn=new Scanner(System.in); System.out.println("enter the staris");
        int n=scn.nextInt();
      
        ArrayList<String> ans=getStairsPath(n);
        System.out.println(ans);
    }
}
