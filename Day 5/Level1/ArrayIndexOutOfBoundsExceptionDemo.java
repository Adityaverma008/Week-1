import java.util.Scanner;

public class ArrayIndexOutOfBoundsExceptionDemo {

    // Method to generate ArrayIndexOutOfBoundsException
    public static void generateException(String[] names) {
        // Attempt to access an index out of bounds
        System.out.println("Accessing element at index 10: " + names[10]);
    }

    // Method to handle ArrayIndexOutOfBoundsException
    public static void handleException(String[] names) {
        try {
            // Attempt to access an index out of bounds
            System.out.println("Accessing element at index 10: " + names[10]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Caught an ArrayIndexOutOfBoundsException: " + e.getMessage());
        } catch (RuntimeException e) {
            System.out.println("Caught a RuntimeException: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Take user input for array size and elements
        System.out.print("Enter the number of names: ");
        int size = scanner.nextInt();
        String[] names = new String[size];

        System.out.println("Enter the names:");
        for (int i = 0; i < size; i++) {
            names[i] = scanner.next();
        }

        // Call method to generate exception
        System.out.println("\nGenerating exception:");
        try {
            generateException(names);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Caught exception in main: " + e.getMessage());
        }

        // Call method to handle exception
        System.out.println("\nHandling exception:");
        handleException(names);

        scanner.close();
    }
}
