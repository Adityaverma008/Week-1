
import java.util.Scanner;

public class DayOfWeek {
    public static void main(String[] args) {
       int m=Integer.parseInt(args[0]);
       int d=Integer.parseInt(args[1]);
       int y=Integer.parseInt(args[0]); 
       String days[]={"Sunday","Monday","Tuesday","Wednesday","Thrusday","Friday","Saturday"};
       int y0 = y - (14 - m) / 12 ;
		int x = y0 + (y0 / 4) - (y0 - 100) + (y0/400);
		int m0 = m + 12 * ((14 - m) / 12)- 	2 ;
		int d0 = (d + x + 31*m0 / 12) % 7 ; 
        System.out.println(days[0]);


    }
    
}
