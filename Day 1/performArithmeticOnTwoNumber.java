import java.util.*;

// 1. Write a program to take input of two numbers and print their sum, difference, product, and quotient.

public class performArithmeticOnTwoNumber {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first Number :");
        int firstNum = sc.nextInt();
        System.out.print("Enter second Number :");
        int secNum = sc.nextInt();

        sumMethod(firstNum, secNum);
        diffrenceMethod(firstNum, secNum);
        productMethod(firstNum, secNum);
        quotientMethod(firstNum, secNum);
        reminderMethod(firstNum, secNum);
    }

    static void sumMethod(int a, int b){
        System.out.println(a+b);
    }

    static void diffrenceMethod(int a, int b){
        System.out.println(a - b);
    }

    static void productMethod(int a, int b){
        System.out.println(a * b);
    }

    static void quotientMethod(int a, int b){
        System.out.println(a / b);
    }

    static void reminderMethod(int a, int b){
        System.out.println(a % b);
    }
}
