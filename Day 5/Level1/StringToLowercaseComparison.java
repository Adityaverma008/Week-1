import java.util.Scanner;

public class StringToLowercaseComparison {

    // Method to convert text to lowercase using ASCII values
    public static String convertToLowercase(String text) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            if (ch >= 'A' && ch <= 'Z') {
                result.append((char) (ch + 32));
            } else {
                result.append(ch);
            }
        }
        return result.toString();
    }

    // Method to compare two strings character by character
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

        // Take user input
        System.out.print("Enter the text: ");
        String input = scanner.nextLine();

        // Convert text to lowercase using built-in method
        String lowerCaseBuiltIn = input.toLowerCase();

        // Convert text to lowercase using custom method
        String lowerCaseCustom = convertToLowercase(input);

        // Compare the results
        boolean areEqual = compareStrings(lowerCaseBuiltIn, lowerCaseCustom);

        // Display the results
        System.out.println("\nLowercase using built-in method: " + lowerCaseBuiltIn);
        System.out.println("Lowercase using custom method: " + lowerCaseCustom);
        System.out.println("Are both results equal? " + areEqual);

        scanner.close();
    }
}
