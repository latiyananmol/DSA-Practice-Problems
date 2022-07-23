// GET KEY pAD 
import java.util.*;
public class getKey {
    public static String[] key={"?.","acb","def","ghi","jkl","mnop","qrst","uv","wxyz",",;"};
    public static ArrayList<String> getKeyPad(String str){
        if(str.length()==0){
            ArrayList<String>  base=new ArrayList<>();
            base.add("");
            return base;
        
        }

         
         String st=str.substring(1);
         ArrayList <String> list1=getKeyPad(st);
         ArrayList<String>  result=new ArrayList<>();
         String ch=key[str.charAt(0)-'0'];
         for(int i=0;i<ch.length();i++){
            for(String q:list1){
                result.add(ch.charAt(i)+q);
            }
         }
         return result;


    }
    public static void main(String[] args){
        Scanner scn=new Scanner(System.in);
        String ans=scn.nextLine();
        ArrayList<String> ansf=getKeyPad(ans);
        System.out.println(ansf);


    }
    
}
