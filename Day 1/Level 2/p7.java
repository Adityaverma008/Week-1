import java.util.*;
public class p7{
    public static void main(String[] args){
        Scanner sc  = new Scanner(System.in);
        int first = sc.nextInt();
        int second = sc.nextInt() ;
        int temp = first;
        first = second;
        second = temp;
        // int swp = Swap(first , second);
        System.out.println("The swapped Number are  first and second " + first + " " + second );

        sc.close();

    }
}


