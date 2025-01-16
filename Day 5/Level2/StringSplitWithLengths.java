import java.util.Scanner;

public class StringSplitWithLengths {

    // Method to find the length of a string without using length()
    public static int findLength(String text) {
        int length = 0;
        for (char ch : text.toCharArray()) {
            length++;
        }
        return length;
    }

    // Method to split a string into words without using split()
    public static String[] customSplit(String text) {
        int length = findLength(text);
        int wordCount = 1;

        // Count the number of words
        for (int i = 0; i < length; i++) {
            if (text.charAt(i) == ' ') {
                wordCount++;
            }
        }

        // Store the indices of spaces
        int[] spaceIndexes = new int[wordCount - 1];
        int index = 0;
        for (int i = 0; i < length; i++) {
            if (text.charAt(i) == ' ') {
                spaceIndexes[index++] = i;
            }
        }

        // Extract words using the space indices
        String[] words = new String[wordCount];
        int start = 0;
        for (int i = 0; i < wordCount - 1; i++) {
            words[i] = text.substring(start, spaceIndexes[i]);
            start = spaceIndexes[i] + 1;
        }
        words[wordCount - 1] = text.substring(start);

        return words;
    }

    // Method to return a 2D array of words and their lengths
    public static String[][] wordsWithLengths(String[] words) {
        String[][] result = new String[words.length][2];
        for (int i = 0; i < words.length; i++) {
            result[i][0] = words[i];
            result[i][1] = String.valueOf(findLength(words[i]));
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Take user input
        System.out.print("Enter the text: ");
        String input = scanner.nextLine();

        // Split the text using custom method
        String[] customSplitResult = customSplit(input);

        // Get the words with their lengths
        String[][] wordsWithLengths = wordsWithLengths(customSplitResult);

        // Display the results in a tabular format
        System.out.println("\nWord\tLength");
        for (String[] wordWithLength : wordsWithLengths) {
            System.out.println(wordWithLength[0] + "\t" + Integer.parseInt(wordWithLength[1]));
        }

        scanner.close();
    }
}
