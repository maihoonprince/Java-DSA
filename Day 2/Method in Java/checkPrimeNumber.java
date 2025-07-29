import java.util.*;

// Write a method to check if a number is prime.

public class checkPrimeNumber {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Number to check it is Prime or Not :");
        int number = sc.nextInt();

        isPrime(number);
    }

    static void isPrime(int a){
        int count = 0;

        for(int i=1; i<=a; i++){
            int rem = a % i;
            if(rem == 0){
                count = count + 1;
            }
        }

        if(count == 2){
            System.out.println(a + " " + "is a Prime Number" );
        }
        else{
            System.out.println(a + " " + "is not a Prime Number");
        }
    }
}
