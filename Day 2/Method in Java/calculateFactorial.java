import java.util.*;

// Write a method to calculate factorial of a number.

// Formula: n! = n * (n-1) * (n-2) * (n-3)....       Example :--->  5! = 5 * 4 * 3 * 2 * 1

public class calculateFactorial {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter thr Number which you want to Calculate Factorial :");
        int num = sc.nextInt();

        factorial(num);
    }

    static void factorial(int number){
        int result = 1;

        for (int i=1; i<=number; i++){
            result = result * i;
        }

        System.out.println(result);
    }
}
