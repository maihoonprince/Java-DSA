import java.util.*;

// 2. Write a program to check whether a number is even or odd.

public class evenOddChecker {
    public static void main(String[] args){
        System.out.println("Enter number you want to check :");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        evenOddCheckMethod(num);
    }

    static void evenOddCheckMethod(int number){
        int div = number % 2;

        if(div==0){
            System.out.println("Number you entered is a Even Number");
        }
        else{
            System.out.println("Number you entered is a Odd Number");
        }
    }
}
