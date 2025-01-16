import java.util.Scanner;

public class vowel_consto {

    // Method to check if the character is a vowel, consonant, or not a letter
    public static String checkCharacter(char c) {
        // Convert the character to lowercase if it's uppercase
        c = Character.toLowerCase(c);
        
        // Check if the character is a letter
        if (c >= 'a' && c <= 'z') {
            // Check if it's a vowel
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                return "Vowel";
            } else {
                return "Consonant";
            }
        } else {
            return "Not a Letter"; // If it's not a letter
        }
    }

    // Method to find vowels and consonants in a string and return a 2D array of characters and their types
    public static String[][] findVowelsAndConsonants(String text) {
        // Prepare a 2D array to store the character and its type
        String[][] result = new String[text.length()][2];

        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);
            String type = checkCharacter(c);
            result[i][0] = String.valueOf(c); // Store the character
            result[i][1] = type; // Store the character type (Vowel, Consonant, Not a Letter)
        }

        return result;
    }

    // Method to display the 2D array in a tabular format
    public static void displayTable(String[][] data) {
        System.out.println("Character | Type");
        System.out.println("-------------------");
        
        for (int i = 0; i < data.length; i++) {
            // Print the character and its type
            System.out.printf("%-10s| %-10s%n", data[i][0], data[i][1]);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking input from the user
        System.out.print("Enter a string: ");
        String text = scanner.nextLine();

        // Get the vowels and consonants info in a 2D array
        String[][] result = findVowelsAndConsonants(text);

        // Display the result in a tabular format
        displayTable(result);

        scanner.close();
    }
}
