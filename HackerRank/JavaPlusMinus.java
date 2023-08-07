import java.util.List;

public class JavaPlusMinus {
    
    public static void plusMinus(List<Integer> arr) {
        float pos = 0;
        float neg = 0;
        float zero = 0;
        
        for (int element : arr){
            if (element < 0){
               neg += 1;
           } else if (element == 0){
               zero += 1;
           } else {
               pos += 1;
           }
        }
        
        System.out.println(pos / arr.size());
        System.out.println(neg / arr.size());
        System.out.println(zero / arr.size());
    }
}
