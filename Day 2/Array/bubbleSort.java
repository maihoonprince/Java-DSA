import java.util.*;

// Sort an array using bubble sort.

public class bubbleSort {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of Array : ");
        int size = sc.nextInt();

        int arr[] = new int[size];

        System.out.println("Enter elements of Array :");
        for(int i=0; i<size; i++){
            arr[i] = sc.nextInt();
        }

        System.out.print("Inputed Array is :");
        printArray(arr);
        // System.out.println(Arrays.toString(arr));
        System.out.println();

        bubbleSorting(arr);

        System.out.print("Sorted Array:");
        printArray(arr);
        // System.out.println(Arrays.toString(arr));

    }

    static void bubbleSorting(int[] arr){
        for(int i=0; i<arr.length - 1;  i++){
            for(int j=0; j<arr.length - i - 1; j++){
                if(arr[j] > arr[j+1]){
                    swap(arr, i, j);
                }
            }
        }
    }

    static void swap(int arr[], int i, int j){
        int temp = arr[j];
        arr[j] = arr[j+1];
        arr[j+1] = temp;
    }

    static void printArray(int[] arr){
        System.out.print("[");
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i] + ", ");
        }
        System.out.print("]");
    }
}
