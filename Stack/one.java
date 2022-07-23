import java.util.*;
public class one {
    public static void main(String[] args){
        Scanner scn=new Scanner(System.in);
        String ans="(a+b)+((c+d))";
        Stack<Character> st=new Stack<>();
        for(int i=0;i<ans.length();i++){
            char ch=ans.charAt(i);
            if(ch==')'){
                if(st.peek() == '('){
                    System.out.println("contain Duplicate bracket");
                    return;
                }
            while(st.peek() != '('){st.pop();}st.pop();
            }
            else {
                st.push(ch);
            }
        }
        System.out.println("Not contains Duplicate Brackets");
        
     
            
        }
    }
    

