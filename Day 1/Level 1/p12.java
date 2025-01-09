import java.util.Scanner;

public class p12 {
    public static void main(String[] args) {
        // Constants for conversion
        final double INCH_TO_CM = 2.54;

        Scanner sc = new Scanner(System.in);

        // Input base and height in inches
        System.out.print("Enter the base of the triangle (in inches): ");
        double baseInInches = sc.nextDouble();
        
        System.out.print("Enter the height of the triangle (in inches): ");
        double heightInInches = sc.nextDouble();

        // Calculate area in square inches
        double areaInInches = 0.5 * baseInInches * heightInInches;

        // Convert base and height to centimeters
        double baseInCm = baseInInches * INCH_TO_CM;
        double heightInCm = heightInInches * INCH_TO_CM;

        // Calculate area in square centimeters
        double areaInCm = 0.5 * baseInCm * heightInCm;

        // Display results
        System.out.println("Area of the triangle:");
        System.out.printf("- In square inches: %.2f\n", areaInInches);
        System.out.printf("- In square centimeters: %.2f\n", areaInCm);

        sc.close();
    }
}
