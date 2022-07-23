import java.util.*;
public class arraylist{

    public static void main(String[] args){
        Scanner scn=new Scanner(System.in);
       ArrayList<Integer> ans=new ArrayList<>();
       ans.add(10);
       ans.add(20);
       ans.add(30);
       ans.add(40);
       ans.add(1,100);
    //    ans.add(3,9);
    //    ans.set(0,201010);
    //    ans.remove(5);
    //    
    for(int val:ans){
        System.out.print(val+"  ");
       }
;

        
    }
}