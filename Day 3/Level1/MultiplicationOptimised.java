
import java.util.Scanner;

public class MultiplicationOptimised {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);  
        int []Multiplication=new int[10];
        		//Using a for loop, find the multiplication table of numbers from 6 to 9 and save the result in the array

        System.out.println("Enter a Number between 6 and 9");
        int number=sc.nextInt(); 
        if(number>=6&&number<=9){// check for the range of number
            for(int i=0;i<=9;i++){
                Multiplication[i]=(i+1)*number; // storing the multiplication value in the array;
            } 
            for(int i=0;i<=9;i++){
                System.out.println(Multiplication[i]+" ");// print the multiplication value
            }

        } 
        else{
            System.out.println("Entered Number is not in the range");
        } 
        sc.close();// close the scanner class;
    }
}