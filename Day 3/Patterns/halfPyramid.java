import java.util.*;


public class halfPyramid {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter no of Row : ");
        int row = sc.nextInt();

        halfPyramidMethod(row);
    }

    static void halfPyramidMethod(int row){
        for(int i=1; i<=row; i++){
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
