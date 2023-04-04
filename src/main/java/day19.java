import java.util.Scanner;

public class day19 {/*
	  	Ask user to enter the number of lines of an inverted pyramid.
	  	Type a program to create the inverted pyramid.
  	    For example; if the number of lines is 5, the pyramid will be like; * * * * * * * * *
																			  * * * * * * *
																			    * * * * *
																			      * * *
																			        *
    */

    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        System.out.println("Enter the number of lines of an inverted pyramid");

        int rows = scan.nextInt();

        for(int i = rows; i > 0; --i) {

            for(int space = 0; space < rows - i; space++) {
                System.out.print("  ");
            }

            for(int j=0; j < 2 * i - 1; j++) {
                System.out.print("* ");
            }

            System.out.println();
        }
    }
}
