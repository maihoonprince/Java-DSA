import java.util.*;

public class string {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);


        System.out.print("Enter first String : ");
        String string1 = sc.nextLine();

        System.out.println(string1);

        int sizeOfName= string1.length();
        System.out.println(sizeOfName);


        char characterAtPoint = string1.charAt(3);
        System.out.println(characterAtPoint);

        String subStringName = string1.substring(2, 5);
        System.out.println(subStringName);

        String lowerCase = string1.toLowerCase();
        System.out.println("Name in lowercase : " + lowerCase);

        String upperCase = string1.toUpperCase();
        System.out.println("String in upperCase : " + upperCase);

        System.out.print("Enter second string to check it is equal to string1 or not : ");
        String string2 = sc.nextLine();
        checkStringEqualOrNot(string1, string2);

        sc.close();
    }

    static void checkStringEqualOrNot(String string1, String string2){
       int lengthOfString1 = string1.length();
       int lengthOfString2 = string2.length();

       boolean result = false;

        if(lengthOfString1 == lengthOfString2){
            result = string2.equals(string1);                                      // check string equal (true or false) but case sensitive.

            // result = string2.equalsIgnoreCase(string1);                               // it check after igonoring case.
        }

        if(result == true){
            System.out.println("String1 is equal to String2");
        }
        else{
            System.out.println("String1 is not equal to String2");
        }
    }
}
