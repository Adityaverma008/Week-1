public class SpringSeason {

    public static void main(String[] args) {
        if (args.length < 2) {
            System.out.println("Please provide month and day as command line arguments.");
            return;
        }

        // Parse command line arguments
        int month = Integer.parseInt(args[0]);
        int day = Integer.parseInt(args[1]);

        // Check if it's Spring season
        if (isSpringSeason(month, day)) {
            System.out.println("It's a Spring Season");
        } else {
            System.out.println("Not a Spring Season");
        }
    }

    // Method to check if a given month and day falls within Spring season
    public static boolean isSpringSeason(int month, int day) {
        // Spring season is from March 20 (3, 20) to June 20 (6, 20)
        if (month < 3 || month > 6) {
            return false;
        } else if (month == 3 && (day < 20)) {
            return false;
        } else if (month == 6 && (day > 20)) {
            return false;
        }
        return true;
    }
}
