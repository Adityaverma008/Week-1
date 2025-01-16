import java.util.Scanner;

public class leading_trailing {

    // Method to trim leading and trailing spaces using the charAt() method
    public static int[] findTrimPoints(String text) {
        int start = 0;
        int end = text.length() - 1;

        // Find the starting index (skip leading spaces)
        while (start <= end && text.charAt(start) == ' ') {
            start++;
        }

        // Find the ending index (skip trailing spaces)
        while (end >= start && text.charAt(end) == ' ') {
            end--;
        }

        // Return the start and end indices in an array
        return new int[]{start, end};
    }

    // Method to create a substring from a string using the charAt() method
    public static String getSubstring(String text, int start, int end) {
        StringBuilder result = new StringBuilder();

        for (int i = start; i <= end; i++) {
            result.append(text.charAt(i));
        }

        return result.toString();
    }

    // Method to compare two strings using the charAt() method
    public static boolean compareStrings(String str1, String str2) {
        if (str1.length() != str2.length()) {
            return false;
        }

        for (int i = 0; i < str1.length(); i++) {
            if (str1.charAt(i) != str2.charAt(i)) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking input from the user
        System.out.print("Enter a string with leading and trailing spaces: ");
        String input = scanner.nextLine();

        // Trim the string using the charAt() method
        int[] trimPoints = findTrimPoints(input);
        String trimmedText = getSubstring(input, trimPoints[0], trimPoints[1]);

        // Trim the string using the built-in trim() method
        String builtInTrimmedText = input.trim();

        // Compare the two trimmed strings
        boolean isEqual = compareStrings(trimmedText, builtInTrimmedText);

        // Display the result
        System.out.println("Trimmed text using charAt(): \"" + trimmedText + "\"");
        System.out.println("Trimmed text using built-in trim(): \"" + builtInTrimmedText + "\"");
        System.out.println("Are both trimmed strings equal? " + isEqual);

        scanner.close();
    }
}
