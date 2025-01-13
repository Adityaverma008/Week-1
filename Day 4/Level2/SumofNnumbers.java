import java.util.Scanner;

public class SumofNnumbers {
    public static int sumusingRecursion(int number){//Method to find the sum of n natural numbers using recursion
        if(number<=1){
            return number;
        } 
        return number+sumusingRecursion(number-1);
    }
    public static int sumusingFormula(int number){//Method to find the sum of n natural numbers using the formulae n*(n+1)/2 
        int result=number*(number+1)/2;
        return result;

    } 
    public static void main(String[] args) { 
        SumofNnumbers s=new SumofNnumbers();
        Scanner sc=new Scanner(System.in); 
        System.out.println("Enter the number"); //Take the user input number and check whether it's a Natural number, if not exit
        int num=sc.nextInt(); 
        if(num<0){
            System.exit(0);
        }
        int resultusingRecursion=sumusingRecursion(num); 
        System.out.println("The result of the number using recursion is "+resultusingRecursion);
        int resultusingFormula=sumusingFormula(num);   
        System.out.println("The sum of the number using formula is "+resultusingFormula);

        if(resultusingRecursion==resultusingFormula){//Compare the two results and print the result
            System.out.println("Equal");
        }
        else{
            System.out.println("Not equal");
        }
        
    }
    
}

