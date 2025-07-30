import java.util.*;

public class printArry {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Size of array :");
        int size = sc.nextInt();

        int[] arr = new int[size];

        System.out.println("Enter Elements os Array :");
        for(int i=0; i<size; i++){
            arr[i] = sc.nextInt();
        }

        printArray(arr);
    }

    static void printArray(int[] arr){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i] + "," + " ");
        }
    }
}
