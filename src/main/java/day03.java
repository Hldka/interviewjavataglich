import java.util.Scanner;

public class day03 {

    // how many Fibonacci want to see?
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("How many Fibonnacci want to see?");

       int number=scan.nextInt();
    fibonnacci(number);

    }public static void fibonnacci(int number ){
        int fibo1 = 1;
        int fibo2 = 1;
        int fibonacci = 0;
        System.out.print(fibo1 + " ");
        System.out.print(fibo2 + " ");

        for (int i = 1; i < number-1; i++) {
            fibonacci = fibo1 + fibo2;
            fibo1 = fibo2;
            fibo2 = fibonacci;
            System.out.print(fibonacci + " ");
        }

    }
}
