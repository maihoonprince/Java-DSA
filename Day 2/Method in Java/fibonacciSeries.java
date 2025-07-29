import java.util.*;

// Write a method to print Fibonacci series up to n terms.

public class fibonacciSeries {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of Element you want to Print of Fibonacci Series :");
        int n = sc.nextInt();

        fibonacci(n);
    }

    static void fibonacci(int n){
        int a = 0;
        int b = 1;
        int c = 1;

        for(int i=0; i<n; i++){
            System.out.println(a);
            a = b;
            b = c;
            c = a+b;
        }
        System.out.println("");

    }
}