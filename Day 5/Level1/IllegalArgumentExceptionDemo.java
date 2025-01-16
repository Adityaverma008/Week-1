import java.util.Scanner;

public class IllegalArgumentExceptionDemo {

    // Method to generate IllegalArgumentException
    public static void generateException(String input) {
        // Attempt to use substring with invalid indices
        System.out.println("Substring result: " + input.substring(5, 3));
    }

    // Method to handle IllegalArgumentException
    public static void handleException(String input) {
        try {
            // Attempt to use substring with invalid indices
            System.out.println("Substring result: " + input.substring(5, 3));
        } catch (IllegalArgumentException e) {
            System.out.println("Caught an IllegalArgumentException: " + e.getMessage());
        } catch (RuntimeException e) {
            System.out.println("Caught a RuntimeException: " + e.getMessage());
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
        } catch (IllegalArgumentException e) {
            System.out.println("Caught exception in main: " + e.getMessage());
        }

        // Call method to handle exception
        System.out.println("\nHandling exception:");
        handleException(input);

        scanner.close();
    }
}
