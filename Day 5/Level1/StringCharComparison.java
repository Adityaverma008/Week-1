import java.util.Scanner;

public class StringCharComparison {

    // Method to return characters in a string without using toCharArray()
    public static char[] getCharacters(String str) {
        char[] characters = new char[str.length()];
        for (int i = 0; i < str.length(); i++) {
            characters[i] = str.charAt(i);
        }
        return characters;
    }

    // Method to compare two character arrays
    public static boolean compareArrays(char[] array1, char[] array2) {
        if (array1.length != array2.length) {
            return false;
        }
        for (int i = 0; i < array1.length; i++) {
            if (array1[i] != array2[i]) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Take user input
        System.out.print("Enter a string: ");
        String input = scanner.next();

        // Get characters using user-defined method
        char[] userDefinedResult = getCharacters(input);

        // Get characters using built-in toCharArray() method
        char[] builtInResult = input.toCharArray();

        // Compare the two arrays
        boolean areEqual = compareArrays(userDefinedResult, builtInResult);

        // Display results
        System.out.println("User-defined method result: " + new String(userDefinedResult));
        System.out.println("Built-in method result: " + new String(builtInResult));
        System.out.println("Are the arrays equal? " + areEqual);

        scanner.close();
    }
}
