import java.util.*;

public class p8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = sc.nextLine();

        System.out.print("Enter your starting city: ");
        String fromCity = sc.nextLine();

        System.out.print("Enter the city you're passing through: ");
        String viaCity = sc.nextLine();

        System.out.print("Enter your final destination city: ");
        String toCity = sc.nextLine();

        System.out.print("Enter the distance from " + fromCity + " to " + viaCity + " in miles: ");
        double fromToVia = sc.nextDouble();

        System.out.print("Enter the distance from " + viaCity + " to " + toCity + " in miles: ");
        double viaToFinalCity = sc.nextDouble();

        System.out.print("Enter the total time taken for the journey in hours: ");
        double timeTaken = sc.nextDouble();

        double totalDistance = fromToVia + viaToFinalCity;
        double averageSpeed = totalDistance / timeTaken;

        System.out.println("Name: " + name);
        System.out.println("Route: " + fromCity + " -> " + viaCity + " -> " + toCity);
        System.out.println("The results of Int Operations are " + totalDistance + ", " + timeTaken + ", and " + averageSpeed);

        sc.close();
    }
}
