// GetSubsequence
import java.util.*;
public class one {
    public static ArrayList<String> getSubSequence(String str){
        if(str.length()==0){
            ArrayList<String> a=new ArrayList<>();
            a.add("");
            return a;
        }

        char ch=str.charAt(0);
        String roq=str.substring(1);
        ArrayList<String> ans=getSubSequence(roq);
        ArrayList<String> ans1=new ArrayList<>();

        for(String q:ans){ 
            ans1.add(" "+q);}
            for(String q:ans){ 
                ans1.add(ch+q);}
        
        return ans1;
      


    }
    public static void main(String[] args){
        Scanner scn=new Scanner(System.in);
        String str=scn.nextLine();
    ArrayList<String> ans= getSubSequence(str);
//    ArrayList<Integer>no=new ArrayList<>();
//    no.add(1);
//    System.out.println(no);

//    ArrayList<String> ans=new ArrayList<>();
//    ans.add("as");
//    ans.add("bs");

//      System.out.println(ans);



    }
    
}
