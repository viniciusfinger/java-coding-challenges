import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

/*
 * Given a large integer n, determine and print whether it's prime or not prime.
 */

public class JavaPrimalityTest {


    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String n = bufferedReader.readLine();
        bufferedReader.close();

        BigInteger bigInteger = new BigInteger(n);
        
        if(bigInteger.isProbablePrime(1)){
            System.out.println("prime");
        } else { 
            System.out.println("not prime");
        }
    }

}
