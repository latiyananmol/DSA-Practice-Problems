import java.util.*;
public class jumpo{
    public static ArrayList<String> getJumps(int sr,int sc,int dr,int dc){
        if(sr==dr&&sc==dc){
            ArrayList<String> base=new ArrayList<>();
            base.add("");
            return base;
            
        }
     



        ArrayList<String> re=new ArrayList<>();
        // horizontal 
        for(int i=1;i<=dc-sc;i++){
            ArrayList<String> ans=getJumps(sr,sc+i,dr,dc);
            for(String val:ans){
                re.add("h"+i+val);
            }
        }
        for(int i=1;i<=dr-sr;i++){
            ArrayList<String> ans1=getJumps(sr+i,sc,dr,dc);
            for(String val:ans1){
                re.add("v"+i+val);
            }
        }







return re;


    }
    public static void main(String[] args){
        Scanner scn=new Scanner(System.in);
        ArrayList<String> ans=getJumps(1,1,5,5);
        System.out.println(ans);

    }

}