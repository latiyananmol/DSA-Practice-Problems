import java.util.*;
public class nextGreaterElementOnRight {
    public static void main(String[] args){
        Scanner scn=new Scanner(System.in);
        int []arr={2,5,9,3,1,12,6,8,7};
        Stack<Integer> st=new Stack<>();
        int []nge=new int[arr.length];
        nge[arr.length-1]=-1;

        st.push(arr[arr.length-1]);
         System.out.println(st.peek());
         for(int j=arr.length-2;j>=0;j--){
             while(st.size()>0&&st.peek()<arr[j]){st.pop();}
             if(st.size()==0){nge[j]=-1;}
             else{
                 nge[j]=st.peek(); 
             }
           st.push(arr[j]);

     }
        for(int q:nge){
        System.out.print(q+"   ");}
    }

    
    }