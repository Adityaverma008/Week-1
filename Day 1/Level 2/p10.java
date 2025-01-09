import java.util.*;
public class p10{
    public static void main(String[] args){
        Scanner sc  = new Scanner(System.in);
        int numberOfchoczolates = sc.nextInt();
        int numberOfChildren = sc.nextInt() ;
        
        int ChoclatePerChild = numberOfchoczolates / numberOfChildren;
        int remaining_choclate = numberOfchoczolates % numberOfChildren;
        
        System.out.println("The number of chocolates each child gets is " + ChoclatePerChild + "and the number of remainig choclate " + remaining_choclate );

        sc.close();

    }
}

