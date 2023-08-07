import java.util.ArrayList;
import java.util.List;

public class JavaArraysDS {
    
        public static List<Integer> reverseArray(List<Integer> a) {
        List<Integer> reversedArray = new ArrayList<>();
        
        while (a.size() > 0){
            reversedArray.add(a.get(a.size() -1));
            a.remove(a.size() - 1);
        }     

        return reversedArray;
    }
}
