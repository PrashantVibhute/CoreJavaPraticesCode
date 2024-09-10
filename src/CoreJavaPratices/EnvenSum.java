package CoreJavaPratices;

import java.util.Arrays;
import java.util.List;

public class EnvenSum {
    public static void main(String[] args) {
        List < Integer > numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
//        even numbers
        numbers.stream()
                .filter(n -> n % 2 == 0)
                .forEach(System.out::print);
        // Sum of even numbers
        int sumOfEvens = numbers.stream()
                .filter(num -> num % 2 == 0)
                .mapToInt(Integer::intValue)
                .sum();

        System.out.println(" Sum of even numbers: " + sumOfEvens);

        // Sum of odd numbers
        int sumOfOdds = numbers.stream()
                .filter(num -> num % 2 != 0)
                .mapToInt(Integer::intValue)
                .sum();

        System.out.println("Sum of odd numbers: " + sumOfOdds);
    }
}
