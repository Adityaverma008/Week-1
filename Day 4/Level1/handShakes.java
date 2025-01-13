
import java.util.Scanner;

public class handShakes {
   static  int maximumHandshake(int number){// creating a static function that will calculate the totalnoofhandshakes
        return(number*(number-1))/2;
    } 
    public static void main(String[] args) { 
        handShakes hs=new handShakes(); 
        Scanner sc=new Scanner(System.in); 
        System.out.println("Enter the Number of hands required");
        int noofHands=sc.nextInt(); // taking the total no of hands required
       int totalnoofHandshakes=maximumHandshake(noofHands); // calling the maximumHandshakes
       System.out.println("The total of of handshakes is "+totalnoofHandshakes);// result

        
    }
    
}
