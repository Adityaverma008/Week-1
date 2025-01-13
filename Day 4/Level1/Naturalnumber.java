
import java.util.Scanner;

public class Naturalnumber {
    static  int summation(int number){//Method to find the sum of n natural numbers using loop 
            int sum=0; 
            for(int i=1;i<=number;i++){
                sum+=i;
            }
            return sum;
    } 
    public static void main(String[] args) {
        Naturalnumber no=new Naturalnumber(); 
        System.out.println("Enter the number for calculating the sum of natural number");// 
        Scanner sc=new Scanner(System.in); 
        int value=sc.nextInt(); //Get integer input from the user. 
        int result=summation(value); 
        System.out.println("The sum of the natural no "+value+" "+" is "+ result);
    }
    
}
