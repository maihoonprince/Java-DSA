import java.util.*;

public class overloadedMethod {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter two Integer Numbers :");
        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.println("Enter Float Number :");
        float c = sc.nextFloat();
        float d = sc.nextFloat();

        add(a, b);
        add(c, d);
    }

    static void add(int a, int b){
        System.out.println(a + b);
    }

    static void add(float c, float d){
        System.out.println(c + d);
    }
}
