import java.util.*;

public class swithCaseCalculator {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter First number :");
        int num1 = sc.nextInt();

        System.out.print("Enter Second Number :");
        int num2 = sc.nextInt();

        System.out.println("Choose the Options shown below :");
        System.out.println("choose 1 for Addition of two numbers");
        System.out.println("choose 2 for substraction of two numbers");
        System.out.println("choose 3 for multiplication of two numbers");
        System.out.println("choose 4 for division of num2 from num1");

        int choice = sc.nextInt();

        calculator(num1, num2, choice);

    }

    static void calculator(int num1, int num2, int choice){
        switch (choice) {
            case 1:
            System.out.println(num1 + num2); 
            break;

            case 2:
            System.out.println(num1 - num2);
            break;

            case 3:
            System.out.println(num1 * num2);
            break;

            case 4:
            System.out.println(num1 / num2);
            break;
        
            default:
            System.out.println("You Entered wrong choice");
        }
    }
}
