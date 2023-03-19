import java.util.Scanner;

public class day1 {
    //write a java program to reverse a string
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter a Strintg to reverse");
        String st=scan.nextLine();
        //1. way
        StringBuilder stB=new StringBuilder();
        stB.append(st);
        System.out.println(stB.reverse());
        //2. way
        String [] strl=st.split("");
        String sub= "";
       for (int i=strl.length;i>0;i--){
           sub=sub+i;

           System.out.print(sub);
       }
//3.way
        System.out.println(revStr(st));

    }public static String revStr(String str){
        String st="";
        for (int i=str.length()-1;i>=0;i--){
            st=st+str.charAt(i);

        }return st;
    }
}
