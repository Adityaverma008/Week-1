import java.util.Scanner;

class CartItem {
    String name;
    double price;
    int quantity;

    CartItem(String name, double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    double totalCost() {
        return price * quantity;
    }
}

public class ShoppingCart {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        CartItem[] cart = new CartItem[10]; // Fixed-size array for up to 10 items
        int itemCount = 0;

        while (true) {
            System.out.println("\n1. Add Item  2. Remove Item  3. View Cart  4. Total Cost  5. Exit");
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            if (choice == 1) {
                if (itemCount < 10) {
                    System.out.print("Enter item name: ");
                    String name = scanner.nextLine();
                    System.out.print("Enter price: ");
                    double price = scanner.nextDouble();
                    System.out.print("Enter quantity: ");
                    int quantity = scanner.nextInt();
                    cart[itemCount++] = new CartItem(name, price, quantity);
                    System.out.println(name + " added to the cart.");
                } else {
                    System.out.println("Cart is full!");
                }
            } else if (choice == 2) {
                System.out.print("Enter item name to remove: ");
                String name = scanner.nextLine();
                boolean found = false;

                for (int i = 0; i < itemCount; i++) {
                    if (cart[i].name.equalsIgnoreCase(name)) {
                        found = true;
                        for (int j = i; j < itemCount - 1; j++) {
                            cart[j] = cart[j + 1]; // Shift items left
                        }
                        cart[--itemCount] = null; // Decrease count and clear last slot
                        System.out.println(name + " removed from the cart.");
                        break;
                    }
                }

                if (!found) {
                    System.out.println("Item not found in the cart.");
                }
            } else if (choice == 3) {
                if (itemCount == 0) {
                    System.out.println("Cart is empty.");
                } else {
                    System.out.println("Your Cart:");
                    for (int i = 0; i < itemCount; i++) {
                        CartItem item = cart[i];
                        System.out.println(item.name + " - $" + item.price + " x " + item.quantity + " = $" + item.totalCost());
                    }
                }
            } else if (choice == 4) {
                double total = 0;
                for (int i = 0; i < itemCount; i++) {
                    total += cart[i].totalCost();
                }
                System.out.println("Total Cost: $" + total);
            } else if (choice == 5) {
                System.out.println("Thank you! Exiting...");
                break;
            } else {
                System.out.println("Invalid option. Try again.");
            }
        }

        scanner.close();
    }
}
