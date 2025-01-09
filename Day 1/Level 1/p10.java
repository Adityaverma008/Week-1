
import java.util.*;

public class p10 {
   public static void main(String[] var0) {
      Scanner sc = new Scanner(System.in);
      int height = sc.nextInt();
      double inches = height / 2.54;
      double feet = height / 30.48;
      
      System.out.println("The height in cm is  " + height + "while in feet is" + feet + "and inches is" + inches);
   }
}
