import java.util.Random;

public class percentage {

    // Method to generate random 2-digit scores for Physics, Chemistry, and Math for students
    public static int[][] generateScores(int numStudents) {
        Random rand = new Random();
        int[][] scores = new int[numStudents][3]; // Array to store scores for PCM

        for (int i = 0; i < numStudents; i++) {
            scores[i][0] = rand.nextInt(100); // Physics
            scores[i][1] = rand.nextInt(100); // Chemistry
            scores[i][2] = rand.nextInt(100); // Math
        }

        return scores;
    }

    // Method to calculate total, average, and percentage for each student
    public static double[][] calculateResults(int[][] scores) {
        double[][] results = new double[scores.length][4]; // Total, average, percentage

        for (int i = 0; i < scores.length; i++) {
            int total = scores[i][0] + scores[i][1] + scores[i][2];
            double average = total / 3.0;
            double percentage = (total / 300.0) * 100;
            
            // Store rounded values
            results[i][0] = total;
            results[i][1] = Math.round(average * 100.0) / 100.0;
            results[i][2] = Math.round(percentage * 100.0) / 100.0;
        }

        return results;
    }

    // Method to calculate the grade based on the percentage
    public static String[][] calculateGrades(double[][] results) {
        String[][] grades = new String[results.length][1]; // Grade based on percentage

        for (int i = 0; i < results.length; i++) {
            double percentage = results[i][2];

            if (percentage >= 90) {
                grades[i][0] = "A+";
            } else if (percentage >= 80) {
                grades[i][0] = "A";
            } else if (percentage >= 70) {
                grades[i][0] = "B+";
            } else if (percentage >= 60) {
                grades[i][0] = "B";
            } else if (percentage >= 50) {
                grades[i][0] = "C";
            } else {
                grades[i][0] = "F";
            }
        }

        return grades;
    }

    // Method to display the scorecard of all students
    public static void displayScorecard(int[][] scores, double[][] results, String[][] grades) {
        System.out.println("Student | Physics | Chemistry | Math | Total | Average | Percentage | Grade");
        System.out.println("---------------------------------------------------------------");

        for (int i = 0; i < scores.length; i++) {
            System.out.printf("Student %d | %7d | %9d | %4d | %5.0f | %7.2f | %10.2f | %5s%n",
                    i + 1, scores[i][0], scores[i][1], scores[i][2], results[i][0],
                    results[i][1], results[i][2], grades[i][0]);
        }
    }

    public static void main(String[] args) {
        int numStudents = 5; // Number of students
        int[][] scores = generateScores(numStudents); // Generate random scores
        double[][] results = calculateResults(scores); // Calculate total, average, percentage
        String[][] grades = calculateGrades(results); // Calculate grade based on percentage

        // Display the scorecard
        displayScorecard(scores, results, grades);
    }
}
