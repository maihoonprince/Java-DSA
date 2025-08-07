import java.util.*;

public class pattern {
    public static void main(String[] args){
        Scanner sc = new  Scanner(System.in);

        System.out.print("Enter number of row in Pattern : ");
        int row = sc.nextInt();

        System.out.print("Enter number of Column : ");
        int column = sc.nextInt();

        fullRowColumn(row);
        halfTriangle(row);
        imvertedTrianglePattern(row);

        System.out.println("Pattern with diffrent Row and Column :");
        fullPattern2(row, column);
        oppositeHalfTriangle(row, column);
        
    }

    static void fullRowColumn(int  row){
        System.out.println("Full Pattern :-");
        for(int i=1; i<=row; i++){
            for(int j=1; j<=row; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    static void halfTriangle(int row){
        System.out.println("Half Triangle Pattern :-");
        for(int i=1; i<=row; i++){
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    static void imvertedTrianglePattern(int row){
        System.out.println("Inverted Triangle Pattern :-");
        for(int i=row; i>=1; i--){
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    static void fullPattern2(int row, int column){
        System.out.println("Full Pattern with Row and Column :-");
        for(int i=1; i<=row; i++){
            for(int j=1; j<=column; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    static void oppositeHalfTriangle(int row, int column){
        System.out.println("Opposite Half Triangle Pattern :-");
        int space = row-1;
        // int star = 1;

        for(int i=1; i<=row; i++){

            for(int j=1; j<=space; j++){
                System.out.print(" ");
                space--;
            }

            for(int k=1; k<=i; k++){
                System.out.print("*");
            }

            System.out.println();
        }
    }
}
