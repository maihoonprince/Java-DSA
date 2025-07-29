import java.util.*;

// 4. Print all prime numbers between 1 to 100.

public class primeNumber {
    public static void main(String[] args){
        System.out.println("Printing All Prime Number in between 1 to 100");
        for(int i=1; i<=100; i++){
            primeNumberBetween1to100(i);
        }
    }

    static void primeNumberBetween1to100(int a){
        int count = 0;
        
        for(int i=1; i<=a; i++){
            int rem = a % i;
            if(rem == 0){
                count = count + 1;
            }
        }
        if(count == 2){
            System.out.println(a + " " + ":" + " " + "is a Prime Number" );
        }
    }
    
}
