import java.util.Scanner;


public class JavaStaticInitialization {

    /*
    * initialize static variables in those blocks.
    * It's time to test your knowledge of Static initialization blocks. You can read about it here.
    * You are given a class Solution with a main method. Complete the given code so that it outputs the area of a parallelogram with breadth b and height h. You should read the variables from the standard input.
    * If b <= 0 or h <= 0, the output should be "java.lang.Exception: Breadth and height must be positive" without quotes.
    */
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final Integer breadth = scanner.nextInt();
        final Integer height = scanner.nextInt();
        scanner.close();

        if (breadth <= 0 || height <= 0){
            System.out.println("java.lang.Exception: Breadth and height must be positive");
        } else {
            System.out.println(breadth * height);
        }
    }
}