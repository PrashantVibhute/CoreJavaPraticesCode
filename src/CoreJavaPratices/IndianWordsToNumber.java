package CoreJavaPratices;
import java.util.*;

public class IndianWordsToNumber {
    private static final Map<String, Integer> numberMap = new HashMap<>();

    static {
        numberMap.put("one", 1); numberMap.put("two", 2); numberMap.put("three", 3);
        numberMap.put("four", 4); numberMap.put("five", 5); numberMap.put("six", 6);
        numberMap.put("seven", 7); numberMap.put("eight", 8); numberMap.put("nine", 9);
        numberMap.put("ten", 10); numberMap.put("eleven", 11); numberMap.put("twelve", 12);
        numberMap.put("thirteen", 13); numberMap.put("fourteen", 14); numberMap.put("fifteen", 15);
        numberMap.put("sixteen", 16); numberMap.put("seventeen", 17); numberMap.put("eighteen", 18);
        numberMap.put("nineteen", 19); numberMap.put("twenty", 20); numberMap.put("thirty", 30);
        numberMap.put("forty", 40); numberMap.put("fifty", 50); numberMap.put("sixty", 60);
        numberMap.put("seventy", 70); numberMap.put("eighty", 80); numberMap.put("ninety", 90);
        numberMap.put("hundred", 100); numberMap.put("thousand", 1000);
        numberMap.put("lakh", 100000); numberMap.put("crore", 10000000);
    }

    public static int convertWordsToNumber(String words) {
        String[] tokens = words.toLowerCase().trim().replaceAll(" and", "").split("\\s+");
        int result = 0, temp = 0;

        for (String word : tokens) {
            if (numberMap.containsKey(word)) {
                int num = numberMap.get(word);
                if (num == 100) {
                    temp *= num;
                } else if (num >= 1000) {
                    result += temp * num;
                    temp = 0;
                } else {
                    temp += num;
                }
            }
        }
        return result + temp;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Indian currency in words: ");
        
        if (scanner.hasNextLine()) {
            String input = scanner.nextLine().trim();
            int number = convertWordsToNumber(input);
            System.out.println("Output: " + number);
        } else {
            System.out.println("Invalid input!");
        }
        scanner.close();
    }
}
