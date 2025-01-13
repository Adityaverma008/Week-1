import java.util.Scanner;

public class PositiveNegative {
    static void result(int number){ //Method to return -1 for negative number, 1 for positive number and 0 if number is zero

        if(number<0){
            System.out.println("The number "+number+" "+" is negative");
        } 
        else if(number>0){
            System.out.println("The number "+number+" "+" is positive");
        } 
        else{
            System.out.println("The number "+number+" "+"is zero");
        }
    } 
    public static void main(String[] args) {
        PositiveNegative Pn=new PositiveNegative(); 
        Scanner sc=new Scanner(System.in); //Get integer input from the user
        System.out.println("Enter the number to check if the number is positive negative or zero"); 
        int value=sc.nextInt(); 
        result(value);//reuslt;
    }
    
}
