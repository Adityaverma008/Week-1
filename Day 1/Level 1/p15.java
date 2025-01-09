import java.util.*;

public class p15 {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         
         int unit_price = sc.nextInt();
	 
	 int quantity = sc.nextInt() ;
		
         int total_price  = (unit_price * quantity);



         System.out.println("the total price is INR " + unit_price +  " if the quantity " + quantity + "and the unit price is INR" + total_price);

        sc.close();
    }
}
