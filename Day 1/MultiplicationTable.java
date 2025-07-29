import java.util.*;

// 3. Write a program to print multiplication table of any number.

public class MultiplicationTable {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter thr number of which you want to Print Multiplication Table :");
        int number = sc.nextInt();
        table(number);
    }

    static void table(int a){
        for(int i=1; i <=10; i++){
            System.out.println(a + " " + "*" + " " + i + " " + "=" + " " + a*i);
        }
    }
}
