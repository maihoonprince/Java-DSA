import java.util.*;

public class linearSearch {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Size  of Array :");
        int size = sc.nextInt();

        int[] arr = new int[size];

        System.out.println("Enter the elements of Array : ");
        for(int i=0; i<size; i++){
            arr[i] = sc.nextInt();
        }

        printArray(arr);

        System.out.println("Enter the number you want to Search in array :");
        int serchElement = sc.nextInt();

        linearSearch(arr, serchElement);

    }

    static void printArray(int arr[]){
        System.out.print("[ ");

        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i] + ", ");
        }

        System.out.println("]");
    }

    static void linearSearch(int arr[], int num){

        boolean found = false;

        for(int i=0; i<arr.length; i++){
            if(arr[i] == num){
                System.out.print("Yes, Number is present at position : " + i);
                found = true;
                break;
            }
        }

        if(!found){
            System.out.println("Number not found in Array");
        }
    }

}
