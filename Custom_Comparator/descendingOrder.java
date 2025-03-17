package Custom_Comparator;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class descendingOrder {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(3, 1, 4, 1, 5, 9);
        
        // Custom comparator for descending order
        Collections.sort(numbers, new Comparator<Integer>() {
            @Override
            public int compare(Integer a, Integer b) {
                return b - a;  // descending order
            }
        });
        
        System.out.println("Sorted in descending order: " + numbers);
    }
}
