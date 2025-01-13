
import java.util.Scanner;

public class quotient { 
     public static int[]quotientandreminder(int number1,int number2){
        int arr[]=new int[2]; 
        arr[0]=number1/number2; // quotient
        arr[1]=number2%number1;// reminder
        return arr;
    } 
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in); 
        System.out.println("Enter the number for calculating the quotient and reminder");
        int number1=sc.nextInt(); 
        int number2=sc.nextInt(); 
        int array[]=quotientandreminder(number1, number2); // call the function and print the result;
        System.out.println("The  reminder of the"+number1+" "+number2+" is"+array[1]+" "+"The quotient of the "+number1+" "+number2+" "+"is"+array[0]);



        
    }
    
}
