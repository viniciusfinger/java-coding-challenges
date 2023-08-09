import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import java.text.NumberFormat;

public class JavaCurrencyFormatter {
    

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        Double value = scanner.nextDouble();
        scanner.close();

        List<Locale> localesList = Arrays.asList(
            Locale.US, 
            new Locale("hi", "IN"),
            Locale.CHINA,
            Locale.FRANCE
        );

        
        localesList.forEach(locale -> {
            NumberFormat numberFormat = java.text.NumberFormat.getCurrencyInstance(locale);
            System.out.println(locale.getCountry() + ": " + numberFormat.format(value));
        });
    }
}
