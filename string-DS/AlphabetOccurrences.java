import java.util.LinkedHashMap;
import java.util.Map;

public class AlphabetOccurrences {
    public static void main(String[] args) {
        String inputString = "occurrences";
        String result = countAlphabetOccurrences(inputString);
        System.out.println(result);
    }

    public static String countAlphabetOccurrences(String inputString) {
        // Create a LinkedHashMap to store the occurrences of each alphabet in the order
        // they appear
        Map<Character, Integer> alphabetCount = new LinkedHashMap<>();

        // Iterate through the characters in the input string
        for (char c : inputString.toCharArray()) {
            // Check if the character is an alphabet (ignore case)
            if (Character.isLetter(c)) {
                // Convert the character to lowercase to make it case-insensitive
                c = Character.toLowerCase(c);

                // Increment the count for the alphabet in the LinkedHashMap
                alphabetCount.put(c, alphabetCount.getOrDefault(c, 0) + 1);
            }
        }

        // Create a StringBuilder to build the result string
        StringBuilder result = new StringBuilder();

        // Iterate through the LinkedHashMap and append alphabet and its count to the
        // result string
        for (Map.Entry<Character, Integer> entry : alphabetCount.entrySet()) {
            result.append(entry.getKey()).append(entry.getValue());
        }

        return result.toString();
    }
}
