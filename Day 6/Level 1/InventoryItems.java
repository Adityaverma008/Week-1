import java.util.*;

class Items {
    public void details(int item_code, String item_name, int item_price) {
        System.out.println("The code of the item is: " + item_code);
        System.out.println("The name of the item is: " + item_name);
        System.out.println("The price per item is: " + item_price);
        System.out.println("The total cost of 5 units is: " + (5 * item_price));
    }
}

public class InventoryItems {
    public static void main(String[] args) {
        Items obj = new Items();
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the item code: ");
        int item_code = sc.nextInt();
        
        System.out.print("Enter the item price: ");
        int item_price = sc.nextInt();
        sc.nextLine(); // Consume the newline character
        
        System.out.print("Enter the item name: ");
        String item_name = sc.nextLine();

        obj.details(item_code, item_name, item_price);
    }
}
