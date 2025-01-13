
import java.util.Scanner;

public class Atheleterun { 
    static int rounds(int totaldistance){// round function calculating the total no of rounds in the triangular area;
        return totaldistance/3;
    }
    public static void main(String[] args) { 
        Atheleterun runner=new Atheleterun(); // create a object of main class that is Atheleterun
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the distance in meters"); 
        int distance=sc.nextInt(); 
        int result=rounds(distance);// call the round function
        System.out.println("The no of rounds in the triangular area is "+result);
        
    
}

    
}
