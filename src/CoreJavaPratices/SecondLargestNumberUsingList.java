package CoreJavaPratices;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class SecondLargestNumberUsingList {
    public static void main(String[] args) {
        // Creating a list of integers
        List<Integer> numbers = Arrays.asList(45, 12, 56, 15, 24, 75, 31, 89);

        // Finding the second largest number using Stream API
        Optional<Integer> secondLargest = numbers.stream().distinct() // Remove duplicates
                .sorted(Comparator.reverseOrder()) // Sort the stream in descending order
                .skip(1) // Skip the largest number
                .findFirst(); // Find the second largest number
        // Displaying the second largest number
        secondLargest.ifPresent(number -> System.out.println("Second Largest Number: " + number));

        // Finding the largest number using Stream API
        Optional<Integer> Largest = numbers.stream().distinct().min(Comparator.reverseOrder());
        Largest.ifPresent(number1 -> System.out.println("Second Largest Number: " + number1));
    }
}