
public class two {
    public static void inverse(String ans1[],int i,int j){
      //  int i=0;
       // int j=ans1.length-1;
        while(i<=j){
        String temp=ans1[i];
        ans1[i]=ans1[j];
        ans1[j]=temp;
    i++;
j--;}

    }
    public static void main(String[] args){
        // Scanner scn=new Scanner(System.in);
        String ans="I am Anmol latiyan good boy";   // convert it in the ==> latiyan good boy I am Anmol 
        String[] ans1=ans.split(" ");
        inverse(ans1,0,2);
        inverse(ans1, 3, 5);
        inverse(ans1, 0, 5);
        System.out.println("anmol");
        for(String val:ans1){
            System.out.print(val+" ");
        }






    



    }
    
}
