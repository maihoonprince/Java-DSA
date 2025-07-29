import java.util.*;

// Write a method to reverse a number.

public class reverseNumber {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number you want to Reverse :");
        int number = sc.nextInt();

        reverseNum(number);
    }

    static void reverseNum(int num){
        int reversedNumber = 0;

        while(num != 0){
            int rem = num % 10;
            reversedNumber = reversedNumber * 10 + rem;
            num = num / 10;
        }

        System.out.println("Reversed Number is " + reversedNumber);
    }
}
