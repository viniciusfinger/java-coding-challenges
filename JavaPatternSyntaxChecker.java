import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

public class JavaPatternSyntaxChecker {

        public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Integer n = Integer.parseInt(scanner.nextLine());
        
        for (int i = 0; i < n; i++){
            try {
                String regex = scanner.nextLine();
                Pattern.compile(regex);
                System.out.println("Valid");
            } catch (PatternSyntaxException pse){
                System.out.println("Invalid");
            }
        }

        scanner.close();       
    }
}
