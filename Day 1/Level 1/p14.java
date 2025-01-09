import java.util.*;

public class p14 {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         
         int feets = sc.nextInt();
	 
	 int yards = (feets / 3) ;
		
         int miles  = (feets / 5280);



         System.out.println("The feets in yards " + yards +  " and in  miles " + miles);

        sc.close();
    }
}
