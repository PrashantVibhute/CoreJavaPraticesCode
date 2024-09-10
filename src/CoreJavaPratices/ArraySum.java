package CoreJavaPratices;

import java.util.ArrayList;
import java.util.List;

public class ArraySum {

    public static List<Integer> arraySum(int[] A, int[] B) {
        // Convert array A to an integer
        int numA = 0;
        for (int i = 0; i < A.length; i++) {
            numA = numA * 10 + A[i];
        }

        // Convert array B to an integer
        int numB = 0;
        for (int i = 0; i < B.length; i++) {
            numB = numB * 10 + B[i];
        }

        // Sum the two numbers
        int totalSum = numA + numB;

        // Convert the sum back to a list of digits
        List<Integer> result = new ArrayList<>();
        while (totalSum > 0) {
            result.add(0, totalSum % 10); // Add digit at the beginning
            totalSum /= 10;
        }

        return result;
    }

    public static void main(String[] args) {
        int[] A = {4, 5, 1};
        int[] B = {3, 4, 5};

        List<Integer> result = arraySum(A, B);
        System.out.println(result);  // Output: [7, 9, 6]
    }
}
