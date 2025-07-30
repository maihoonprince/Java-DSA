import java.util.*;

// Find the maximum and minimum element in the array.

public class minAndMaxElement {
    public static void main(String[] args){
         Scanner sc = new Scanner(System.in);

         System.out.println("Enter size of Array :");
         int size = sc.nextInt();

         int[] arr = new int[size];

         System.out.println("Enter the Elements os Array :");

         for(int i=0; i<size; i++){
            arr[i] = sc.nextInt();
         }

         printArray(arr);
         System.out.println();
         minElement(arr);
         System.out.println();
         maxElement(arr);
    }

    static void printArray(int[] arr){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i] + "," + " ");
        }
    }

    static void minElement(int[] arr){
        int min = arr[0];

        for(int i=0; i<arr.length; i++){
            if(arr[i] < min){
                min = arr[i];
            }
        }
        System.out.print("Min Element in this Array is : " + min);
    }

    static void maxElement(int[] arr){
        int max = arr[0];

        for(int i=0; i<arr.length; i++){
            if(arr[i] > max){
                max = arr[i];
            }
        }
        System.out.print("Max Elemnt of This Array is : " + max);
    }
}
