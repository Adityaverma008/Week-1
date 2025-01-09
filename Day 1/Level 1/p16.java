import java.util.*;

public class p16 {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         
         int N = sc.nextInt();
	 
	
		
         int NumberOfHandshakes  = (N * (N- 1)) / 2;



         System.out.println("The number of handshakes among " + N + "peoples is " + NumberOfHandshakes );

        sc.close();
    }
}
