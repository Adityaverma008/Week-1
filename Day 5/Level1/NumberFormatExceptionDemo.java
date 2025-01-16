import java.util.Scanner;

public class NumberFormatExceptionDemo {

    // Method to generate NumberFormatException
    public static void generateException(String input) {
        // Attempt to parse an invalid number
        int number = Integer.parseInt(input);
        System.out.println("Parsed number: " + number);
    }

    // Method to handle NumberFormatException
    public static void handleException(String input) {
        try {
            // Attempt to parse an invalid number
            int number = Integer.parseInt(input);
            System.out.println("Parsed number: " + number);
        } catch (NumberFormatException e) {
            System.out.println("Caught a NumberFormatException: " + e.getMessage());
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
        } catch (NumberFormatException e) {
            System.out.println("Caught exception in main: " + e.getMessage());
        }

        // Call method to handle exception
        System.out.println("\nHandling exception:");
        handleException(input);

        scanner.close();
    }
}
