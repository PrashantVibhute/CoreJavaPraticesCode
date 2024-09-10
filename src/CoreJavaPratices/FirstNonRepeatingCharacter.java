package CoreJavaPratices;
import java.util.LinkedHashMap;
import java.util.Map;

public class FirstNonRepeatingCharacter {

    public static char findFirstNonRepeatedCharacter(String str) {
        str = str.toLowerCase(); // Case-insensitivity

        Map<Character, Integer> charCount = str.chars()
                .mapToObj(c -> (char) c)
                .collect(LinkedHashMap::new, (map, c) -> map.merge(c, 1, Integer::sum), Map::putAll);

        return charCount.entrySet().stream()
                .filter(entry -> entry.getValue() == 1)
                .map(Map.Entry::getKey)
                .findFirst()
                .orElse('\0'); // Return null character if none found
    }

    public static void main(String[] args) {
        String input = "prashantaabbccddeeffg";
        char firstNonRepeated = findFirstNonRepeatedCharacter(input);

        if (firstNonRepeated != '\0') {
            System.out.println("First non-repeated character: " + firstNonRepeated);
        } else {
            System.out.println("No non-repeated characters found.");
        }
    }
}