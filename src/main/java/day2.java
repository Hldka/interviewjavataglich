import java.util.Scanner;

public class day2 {
    //write a java program to swap two numbers
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter two numbers to swap");
        double n1=scan.nextDouble();
        double n2=scan.nextDouble();
        System.out.println("before swapping :" +"n1: "+n1+" n2: "+n2);

        //1.way
        double n3=n1;
        n1=n2;
        n2=n3;
        System.out.println("after swapping : "+"n1: "+n1+" n2: "+n2);
    }
}
