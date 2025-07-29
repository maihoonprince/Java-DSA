import java.util.*;

public class arrayRevision {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        

        // Direct Declairation :
        // int[] arr = {2, 4, 6, 7};

        // Taking array elements input from user 

        System.out.println("Enter the size of Array :");
        int n = sc.nextInt();

        int arr[] = new int[n];

        System.out.println("Enter elements of Array :");
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        arrayPrint(arr);
    }

    static void arrayPrint(int[] arr){
        System.out.print("Array is :" + "{");

        for(int i=0; i <= arr.length-1; i++){
            System.out.print(arr[i]);
            System.out.print(",");
        }
        
        System.out.print("}");
    }


}
