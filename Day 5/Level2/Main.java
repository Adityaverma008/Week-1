import java.util.Scanner;

public class Main {
    
    // Method to split the text into words without using the split() method
    public static String[] splitText(String text) {
        String[] words = new String[100]; // Assuming there are no more than 100 words
        int index = 0;
        String word = "";
        
        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);
            if (c == ' ' || c == '.' || c == ',' || c == '!' || c == '?') {
                if (!word.isEmpty()) {
                    words[index++] = word;
                    word = "";  // Reset word
                }
            } else {
                word += c;  // Append character to word
            }
        }
        
        if (!word.isEmpty()) { // Add the last word
            words[index] = word;
        }

        return words;
    }

    // Method to find the length of a string without using the length() method
    public static int getStringLength(String word) {
        int length = 0;
        for (int i = 0; i < word.length(); i++) {
            length++;
        }
        return length;
    }

    // Method to create a 2D array of words and their corresponding lengths
    public static String[][] getWordsAndLengths(String[] words) {
        String[][] wordAndLength = new String[words.length][2];
        
        for (int i = 0; i < words.length; i++) {
            if (words[i] != null) {
                wordAndLength[i][0] = words[i]; // Word
                wordAndLength[i][1] = String.valueOf(getStringLength(words[i])); // Length
            }
        }
        
        return wordAndLength;
    }

    // Method to find the shortest and longest word lengths
    public static int[] findShortestAndLongest(String[][] wordAndLength) {
        int[] result = new int[2]; // result[0] = shortest, result[1] = longest
        int minLength = Integer.MAX_VALUE;
        int maxLength = Integer.MIN_VALUE;

        for (int i = 0; i < wordAndLength.length; i++) {
            if (wordAndLength[i][0] != null) {
                int length = Integer.parseInt(wordAndLength[i][1]);
                if (length < minLength) {
                    minLength = length;
                }
                if (length > maxLength) {
                    maxLength = length;
                }
            }
        }

        result[0] = minLength;
        result[1] = maxLength;
        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Taking input from the user
        System.out.print("Enter a sentence: ");
        String text = scanner.nextLine();
        
        // Split the text into words
        String[] words = splitText(text);
        
        // Get words and their lengths in a 2D array
        String[][] wordAndLength = getWordsAndLengths(words);
        
        // Find the shortest and longest word lengths
        int[] shortestAndLongest = findShortestAndLongest(wordAndLength);
        
        // Display the result
        System.out.println("Shortest word length: " + shortestAndLongest[0]);
        System.out.println("Longest word length: " + shortestAndLongest[1]);
        
        scanner.close();
    }
}
