import java.util.Scanner;

public class JavaSubstring {
    /*Given a string S, and two indices start and end, print a substring
    consisting of all characters in the inclusive range from start to end -1. 
    substring method helpful in completing this challenge.
    */

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String S = in.next();
        int start = in.nextInt();
        int end = in.nextInt();

        in.close();

        System.out.println(S.substring(start, end));
    }
}
