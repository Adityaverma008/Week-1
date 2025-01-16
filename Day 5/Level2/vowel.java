import java.util.Scanner;

public class vowel {

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

    // Method to find vowels and consonants in a string
    public static int[] countVowelsAndConsonants(String text) {
        int vowelCount = 0;
        int consonantCount = 0;

        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);
            String result = checkCharacter(c);
            
            if (result.equals("Vowel")) {
                vowelCount++;
            } else if (result.equals("Consonant")) {
                consonantCount++;
            }
        }

        // Return the count of vowels and consonants in an array
        return new int[] {vowelCount, consonantCount};
    }

    public static void main2(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Taking input from the user
        System.out.print("Enter a string: ");
        String text = scanner.nextLine();
        
        // Get vowel and consonant counts
        int[] counts = countVowelsAndConsonants(text);
        
        // Display the result
        System.out.println("Vowels count: " + counts[0]);
        System.out.println("Consonants count: " + counts[1]);
        
        scanner.close();
    }
}
