
import java.util.*;

public class p6 {
   public static void main(String[] var0) {
      Scanner sc = new Scanner(System.in);
      int student_fee = sc.nextInt();
      int discount_percentage = sc.nextInt();
      int finaly = student_fee * discount_percentage / 100;
      System.out.println("The discount amount  is " + (student_fee - finaly));
   }
}
