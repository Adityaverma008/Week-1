
public class SpringSeason {
    public static void main(String[] args) {
        if (args.length < 2) {
            System.out.println("Please enter the month.");
            return;
        }

        // Parse month and day from command line arguments
        int month = Integer.parseInt(args[0]);
        int day = Integer.parseInt(args[1]);

        // Check if it's Spring Season
        boolean isSpring = (month == 3 && day >= 20 && day <= 31) || 
                           (month == 4 && day >= 1 && day <= 30) || 
                           (month == 5 && day >= 1 && day <= 31) || 
                           (month == 6 && day >= 1 && day <= 20);

        if (isSpring) {
            System.out.println("It's a Spring Season.");
        } else {
            System.out.println("Not a Spring Season.");
        }
    }
}
