import java.util.Scanner;

public class StringSplitComparison {

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

    // Method to compare two string arrays
    public static boolean compareStringArrays(String[] arr1, String[] arr2) {
        if (arr1.length != arr2.length) {
            return false;
        }
        for (int i = 0; i < arr1.length; i++) {
            if (!arr1[i].equals(arr2[i])) {
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

        // Split the text using built-in split()
        String[] builtInSplit = input.split(" ");

        // Split the text using custom method
        String[] customSplitResult = customSplit(input);

        // Compare the results
        boolean areEqual = compareStringArrays(builtInSplit, customSplitResult);

        // Display the results
        System.out.println("\nWords using built-in split method:");
        for (String word : builtInSplit) {
            System.out.println(word);
        }

        System.out.println("\nWords using custom split method:");
        for (String word : customSplitResult) {
            System.out.println(word);
        }

        System.out.println("\nAre both results equal? " + areEqual);

        scanner.close();
    }
}
