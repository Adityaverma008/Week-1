import java.util.*;
public class p4{
    public static void main(String[] args){
        Scanner sc  = new Scanner(System.in);
        int celcius = sc.nextInt();
        double farenhite = (celcius * 9/5 ) + 32 ;
        System.out.println("The " + celcius + "celcius is " +  farenhite );

        sc.close();

    }
}