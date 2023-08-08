import java.util.ArrayList;
import java.util.Scanner;
import java.util.List;
import java.util.Collections;
import java.util.Comparator;
import java.math.BigDecimal;


public class JavaBigDecimal {
    
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        
        Integer inputQuantity = Integer.parseInt(scanner.nextLine());

        List<BigDecimal> bigDecimalList = new ArrayList<>();


        while (inputQuantity > 0){
            bigDecimalList.add(new BigDecimal(scanner.nextLine()));    
            inputQuantity--;
        }

        Collections.sort(bigDecimalList, Comparator.reverseOrder());

        scanner.close();

        bigDecimalList.forEach(System.out::println);

    }
}
