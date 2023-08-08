import java.math.BigInteger;
import java.util.Scanner;

public class JavaBigInteger {


    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        
        String numA = scanner.nextLine();
        String numB = scanner.nextLine();
        scanner.close();

        BigInteger bigA = new BigInteger(numA);
        BigInteger bigB = new BigInteger(numB);

        BigInteger sum = bigA.add(bigB);
        BigInteger multiply = bigA.multiply(bigB);

        System.out.println(sum);
        System.out.println(multiply);

    }
}