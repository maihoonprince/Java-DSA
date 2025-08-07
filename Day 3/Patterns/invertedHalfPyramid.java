import java.util.*;

public class invertedHalfPyramid {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of Row : ");
        int row = sc.nextInt();

        invertedHalfPyramidMethod(row);
    }

    static void invertedHalfPyramidMethod(int row){
        for(int i=row; i>=1; i--){
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
