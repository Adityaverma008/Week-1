import java.util.Scanner;

public class StringIndexOutOfBoundsExceptionDemo {

    // Method to generate StringIndexOutOfBoundsException
    public static void generateException(String input) {
        // Attempt to access an index beyond the string length
        System.out.println("Accessing character at index 100: " + input.charAt(100));
    }

    // Method to handle StringIndexOutOfBoundsException
    public static void handleException(String input) {
        try {
            // Attempt to access an index beyond the string length
            System.out.println("Accessing character at index 100: " + input.charAt(100));
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("Caught a StringIndexOutOfBoundsException: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Take user input
        System.out.print("Enter a string: ");
        String input = scanner.next();

        // Call method to generate exception
        System.out.println("\nGenerating exception:");
        try {
            generateException(input);
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("Caught exception in main: " + e.getMessage());
        }

        // Call method to handle exception
        System.out.println("\nHandling exception:");
        handleException(input);

        scanner.close();
    }
}
