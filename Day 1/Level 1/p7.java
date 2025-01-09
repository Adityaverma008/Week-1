import java.util.*;
public class p7{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int km = 6378;
        double km_to_miles = 0.621371;

        double volume3 = ((4/3) * 3.14 * (Math.pow(6378 , 3)));
        double radius_miles = km * km_to_miles;
        double volume_miles = ((4/3) * 3.14 * (Math.pow(radius_miles , 3)));
    
        

        System.out.println("The volume   is " + volume3 + " and cubic miles" + volume_miles );
        
    }
}