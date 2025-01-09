import java.util.*;
public class p9{
    public static void main(String[] args){
        Scanner sc  = new Scanner(System.in);
        int first = sc.nextInt();
        int second = sc.nextInt() ;
        int third = sc.nextInt();
        int perimeter = first + second + third;
        System.out.println("The total number of rounds the athlete will run is " + (5000 / perimeter) );

        sc.close();

    }
}