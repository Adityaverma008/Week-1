import java.util.Scanner;

public class age {

    // Method to generate random ages for 'n' students
    public static int[] generateAges(int n) {
        int[] ages = new int[n];
        
        for (int i = 0; i < n; i++) {
            // Generate a random 2-digit age (between 10 and 99)
            ages[i] = 10 + (int)(Math.random() * 90);
        }
        
        return ages;
    }

    // Method to check if students can vote based on their age
    public static String[][] checkVotingEligibility(int[] ages) {
        String[][] result = new String[ages.length][2];
        
        for (int i = 0; i < ages.length; i++) {
            int age = ages[i];
            if (age < 0) {
                result[i][0] = String.valueOf(age);
                result[i][1] = "Invalid Age";
            } else {
                result[i][0] = String.valueOf(age);
                result[i][1] = age >= 18 ? "Can Vote" : "Cannot Vote";
            }
        }
        
        return result;
    }

    // Method to display the 2D array in a tabular format
    public static void displayTable(String[][] data) {
        System.out.println("Age | Can Vote?");
        System.out.println("------------------");
        
        for (int i = 0; i < data.length; i++) {
            // Print the age and voting eligibility
            System.out.printf("%-5s| %-10s%n", data[i][0], data[i][1]);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking input for the number of students
        System.out.print("Enter the number of students: ");
        int numStudents = scanner.nextInt();

        // Generate random ages for students
        int[] ages = generateAges(numStudents);

        // Check voting eligibility based on age
        String[][] result = checkVotingEligibility(ages);

        // Display the result in a tabular format
        displayTable(result);

        scanner.close();
    }
}
