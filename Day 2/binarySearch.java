import java.util.*;

// Use binary search to find an element in a sorted array.

public class binarySearch {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Size of Array : ");
        int size = sc.nextInt();

        int arr[] = new int[size];

        System.out.println("Enter elements os Array :");
        for(int i=0; i<size; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println(Arrays.toString(arr));

        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));

        System.out.print("Enter the number you want to search in Array :");
        int target = sc.nextInt();

        binarySearch(arr, target);
    }

    static void binarySearch(int arr[], int target){
        int low = 0;
        int high = arr.length-1;

        boolean found = false;

        while(low <= high){
            int mid = low + (high-low) / 2;

            if(arr[mid] == target){
                System.out.println("Target number is at position : " + mid);
                found = true;
                break;
            }
            else if(arr[mid] > target){
                high = mid - 1;
            }
            else {
                low = mid + 1;
            }
        }

        if(!found){
            System.out.println(target + " not found in Array!");
        }
        
    }
}
