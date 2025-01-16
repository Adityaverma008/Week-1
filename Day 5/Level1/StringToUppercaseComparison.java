import java.util.Scanner;

public class StringToUppercaseComparison {

    // Method to convert text to uppercase using ASCII values
    public static String convertToUppercase(String text) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            if (ch >= 'a' && ch <= 'z') {
                result.append((char) (ch - 32));
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

        // Convert text to uppercase using built-in method
        String upperCaseBuiltIn = input.toUpperCase();

        // Convert text to uppercase using custom method
        String upperCaseCustom = convertToUppercase(input);

        // Compare the results
        boolean areEqual = compareStrings(upperCaseBuiltIn, upperCaseCustom);

        // Display the results
        System.out.println("\nUppercase using built-in method: " + upperCaseBuiltIn);
        System.out.println("Uppercase using custom method: " + upperCaseCustom);
        System.out.println("Are both results equal? " + areEqual);

        scanner.close();
    }
}
