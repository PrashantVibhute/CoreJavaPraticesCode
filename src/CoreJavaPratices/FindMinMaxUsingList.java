package CoreJavaPratices;

import java.util.List;
import java.util.Optional;
import java.util.List;
import java.util.Comparator;

public class FindMinMaxUsingList {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(5, 2, 9, 1, 7);

        // Find the smallest number
        int smallest = numbers.stream()
                .min(Comparator.naturalOrder())
                .orElse(Integer.MIN_VALUE); // Default value if list is empty

        // Find the largest number
        int largest = numbers.stream()
                .max(Comparator.naturalOrder())
                .orElse(Integer.MAX_VALUE); // Default value if list is empty

        System.out.println("Smallest number: " + smallest);
        System.out.println("Largest number: " + largest);
    }
}