import java.util.Scanner;

public class JavaValidUsernameRegex {
    
    /*
    The username consists of 8 to 30 characters inclusive. If the username consists of less than 8 or greater than 30  characters, then it is an invalid username.
    The username can only contain alphanumeric characters and  _. Alphanumeric characters describe the character set consisting of lowercase characters  a to z, uppercase characters A to Z, and digits 0 to 9 .
    The first character of the username must be an alphabetic character, i.e., either lowercase character a to z or A to Z uppercase character .
    */

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        
        while (scanner.hasNext()){
            boolean matches = scanner.nextLine().matches("^[a-zA-Z][a-zA-Z0-9_]{7,29}$");

            System.out.println(matches ? "Valid" : "Invalid");
        
        }
        
        scanner.close();

    }
}
