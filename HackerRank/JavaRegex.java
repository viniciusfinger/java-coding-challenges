import java.util.Scanner;

/*Write a class called MyRegex which will contain a string pattern. 
You need to write a regular expression and assign it to the pattern such that it 
can be used to validate an IP address. Use the following definition of an IP address.
*/
public class JavaRegex {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        while(scanner.hasNext()){ 
            System.out.println(scanner.nextLine().matches(new MyRegex().pattern));
        }

        scanner.close();
    }
    
}

class MyRegex { 
    String pattern = "^((25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)\\.){3}(25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)$";
}
