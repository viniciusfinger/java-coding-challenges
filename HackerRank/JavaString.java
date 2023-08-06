import java.util.Scanner;

public class JavaString {

    private static String capitalizeFirstChar(String string){
        return string.substring(0, 1).toUpperCase() + string.substring(1);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); 
        String stringA = scanner.nextLine();
        String stringB = scanner.nextLine();
        scanner.close();

        System.out.println(stringA.length() + stringB.length());
        System.out.println(stringA.compareTo(stringB) > 0 ? "Yes" : "No");
        System.out.println(capitalizeFirstChar(stringA) + " " + capitalizeFirstChar(stringB));
    }
}