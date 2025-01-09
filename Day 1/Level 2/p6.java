import java.util.*;
public class p6{
    public static void main(String[] args){
        Scanner sc  = new Scanner(System.in);
        int salery = sc.nextInt();
        int bonus = sc.nextInt() ;
        System.out.println("The salery is INR " + salery + "and the bonus is INR " +  bonus + ".Hence total income is INR " + (salery + bonus) );

        sc.close();

    }
}