import java.util.Arrays;
import java.util.Scanner;

/*
 * Two strings a and b, are called anagrams if they contain all the same characters
 *  in the same frequencies. For this challenge, the test is not case-sensitive.
 *  For example, the anagrams of CAT are CAT, ACT, tac, TCA, aTC, and CtA.
 */
public class JavaAnagram {
    

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in); 
        String stringA = scanner.nextLine().toLowerCase();
        String stringB = scanner.nextLine().toLowerCase();
        scanner.close();
        
        char[] arrayA = stringA.toCharArray();
        char[] arrayB = stringB.toCharArray();

        Arrays.sort(arrayA);
        Arrays.sort(arrayB);

        if (Arrays.equals(arrayA, arrayB)){
            System.out.println("Anagrams");
        } else {
            System.out.println("Not Anagrams");
        }
    }
}
