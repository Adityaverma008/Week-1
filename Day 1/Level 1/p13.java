import java.util.*;

public class p13 {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         
         Double parameter = sc.nextDouble();
	 
	 Double side = (parameter / 4);



         System.out.println("The length of the side is " + side +  " whose perimeter is " + parameter);

        sc.close();
    }
}
