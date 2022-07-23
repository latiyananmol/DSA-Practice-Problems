import java.util.*;
public class toggl {
    public static String toggle(String ans){
        StringBuilder an=new StringBuilder(ans);
        for(int i=0;i<an.length();i++){
            char ch=ans.charAt(i);
            if(ch>='a'&&ch<='z'){
                char uch=(char)('A'+ch-'a');
                an.setCharAt(i, uch);
            }
            else {
                char lch=(char)('a'+ch-'A');
                an.setCharAt(i, lch);
            }
        }
        return an.toString();
        



    }
    public static void main(String[] args){
        Scanner scn=new Scanner(System.in);
        String ans="pepCODING";
        String a=toggle(ans);
        System.out.println(a);

    }
    
}
