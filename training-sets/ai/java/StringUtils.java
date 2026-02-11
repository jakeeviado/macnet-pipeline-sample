/**
 * StringUtils Class - AI Generated Sample
 * Provides various string manipulation utilities
 */
public class StringUtils {

    /**
     * Reverse a string
     *
     * @param input String to reverse
     * @return Reversed string
     */
    public static String reverseString(String input) {
        if (input == null) {
            return null;
        }

        StringBuilder result = new StringBuilder(input);
        result.reverse();
        return result.toString();
    }

    /**
     * Check if a string is a palindrome
     *
     * @param input String to check
     * @return true if palindrome, false otherwise
     */
    public static boolean isPalindrome(String input) {
        if (input == null) {
            return false;
        }

        String cleaned = input.replaceAll("\\s+", "").toLowerCase();
        String reversed = new StringBuilder(cleaned).reverse().toString();

        return cleaned.equals(reversed);
    }

    /**
     * Count the number of vowels in a string
     *
     * @param input String to analyze
     * @return Number of vowels
     */
    public static int countVowels(String input) {
        if (input == null) {
            return 0;
        }

        int count = 0;
        String vowels = "aeiouAEIOU";

        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            if (vowels.indexOf(ch) != -1) {
                count++;
            }
        }

        return count;
    }

    /**
     * Count the number of words in a string
     *
     * @param input String to analyze
     * @return Number of words
     */
    public static int countWords(String input) {
        if (input == null || input.trim().isEmpty()) {
            return 0;
        }

        String[] words = input.trim().split("\\s+");
        return words.length;
    }

    /**
     * Capitalize the first letter of each word
     *
     * @param input String to capitalize
     * @return Capitalized string
     */
    public static String capitalizeWords(String input) {
        if (input == null || input.isEmpty()) {
            return input;
        }

        String[] words = input.split("\\s+");
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < words.length; i++) {
            String word = words[i];
            if (!word.isEmpty()) {
                String capitalized =
                    word.substring(0, 1).toUpperCase() + word.substring(1);
                result.append(capitalized);

                if (i < words.length - 1) {
                    result.append(" ");
                }
            }
        }

        return result.toString();
    }

    /**
     * Remove duplicate characters from a string
     *
     * @param input String to process
     * @return String with duplicates removed
     */
    public static String removeDuplicates(String input) {
        if (input == null) {
            return null;
        }

        StringBuilder result = new StringBuilder();
        boolean[] seen = new boolean[256]; // ASCII characters

        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            if (!seen[ch]) {
                seen[ch] = true;
                result.append(ch);
            }
        }

        return result.toString();
    }

    /**
     * Check if a string contains only digits
     *
     * @param input String to check
     * @return true if contains only digits, false otherwise
     */
    public static boolean isNumeric(String input) {
        if (input == null || input.isEmpty()) {
            return false;
        }

        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            if (!Character.isDigit(ch)) {
                return false;
            }
        }

        return true;
    }

    /**
     * Main method - Example usage
     *
     * @param args Command line arguments
     */
    public static void main(String[] args) {
        // TODO: Demonstrate string utilities

        // Test string
        String testString = "hello world";

        // Example usage
        System.out.println("Original: " + testString);
        System.out.println("Reversed: " + reverseString(testString));
        System.out.println("Is palindrome: " + isPalindrome(testString));
        System.out.println("Vowel count: " + countVowels(testString));
        System.out.println("Word count: " + countWords(testString));
        System.out.println("Capitalized: " + capitalizeWords(testString));
        System.out.println("No duplicates: " + removeDuplicates(testString));
        System.out.println("Is numeric: " + isNumeric(testString));
    }
}
