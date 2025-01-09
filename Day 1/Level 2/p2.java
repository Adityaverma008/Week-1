import java.util.Scanner;

public class p2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the value of a: ");
        int a = sc.nextInt();

        System.out.print("Enter the value of b: ");
        int b = sc.nextInt();

        System.out.print("Enter the value of c: ");
        int c = sc.nextInt();

        int result1 = a + b * c;       // Multiplication (*) has higher precedence than addition (+)
        int result2 = a * b + c;       // Multiplication (*) is done before addition (+)
        int result3 = c + a / b;       // Division (/) is done before addition (+)
        int result4 = a % b + c;       // Modulus (%) is done before addition (+)

        System.out.println("The results of Int Operations are:");
        System.out.println("a + b * c = " + result1);
        System.out.println("a * b + c = " + result2);
        System.out.println("c + a / b = " + result3);
        System.out.println("a % b + c = " + result4);

        sc.close();
    }
}
