import java.util.Scanner;

public class JavaStringReversePalindrome {
//Given a string , print Yes if it is a palindrome, print No otherwise.
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String word = scanner.nextLine();
        scanner.close();
        
        StringBuilder stringBuilder = new StringBuilder(word);
        String reverseWord = stringBuilder.reverse().toString();

        if (word.equals(reverseWord)){
            System.out.println("Yes");
        } else { 
            System.out.println("No");
        }
    }
}
