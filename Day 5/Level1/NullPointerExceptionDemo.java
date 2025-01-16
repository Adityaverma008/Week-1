public class NullPointerExceptionDemo {

    // Method to generate NullPointerException
    public static void generateException() {
        String text = null;
        // This will throw NullPointerException
        System.out.println(text.length());
    }

    // Method to handle NullPointerException
    public static void handleException() {
        String text = null;
        try {
            // Attempt to access a method on a null object
            System.out.println(text.length());
        } catch (NullPointerException e) {
            System.out.println("Caught a NullPointerException: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        // Call method to generate exception
        System.out.println("Generating exception:");
        try {
            generateException();
        } catch (NullPointerException e) {
            System.out.println("Caught exception in main: " + e.getMessage());
        }

        // Call method to handle exception
        System.out.println("\nHandling exception:");
        handleException();
    }
}
