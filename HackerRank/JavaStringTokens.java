import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class JavaStringTokens {
    /*
     * Given a string, s, matching the regular expression
     * [A-Za-z !,?._'@]+, split the string into tokens. We define a token
     * to be one or more consecutive English alphabetic letters. Then, print the
     * number of tokens, followed by each token on a new line.
     */

    public static void main(String[] args) {
        String sentence = "He is a very very good boy, isn't he?";
        
        List<String> tokens = new ArrayList<>(Arrays.asList(sentence.split("[^A-Z-a-z]")));
        
        tokens.removeAll(Collections.singleton(""));
        
        System.out.println(tokens.size());
        tokens.forEach(System.out::println);
    }
}
