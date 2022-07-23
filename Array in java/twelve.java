import java.util.*;
public class twelve {
    public static void main(String[] args){
        Scanner scn=new Scanner(System.in);
        int [] arr={10,20,30,40,41};
        int l=(int)Math.pow(2, arr.length);
        for(int i=0;i<l;i++){
            int temp=i;
            String ans="";
            for(int d=arr.length-1;d>=0;d--){
                int r=temp%2;
                if(r==0){
                    ans="\t"+ans;
                }else{
                  ans=arr[d]+"\t"+ans;
                }
                temp=temp/2;

            }
            System.out.println(ans);

            }
        }

    }
    

