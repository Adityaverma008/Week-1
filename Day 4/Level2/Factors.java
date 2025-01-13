
import java.util.Scanner;



public class Factors{
    public static int[]getTotalFcators(int number){//static Method to find the factors of the number and save them in an array and return the array. 
        int counter=0; 
        for(int i=1;i<=number;i++){
            if(number%i==0){
                counter++;
            }
        } 
        int []totalFactors=new int[counter]; 
        int index=0; 
        for(int i=1;i<=number;i++){
            if(number%i==0){
                totalFactors[index]=i; 
                index++;
            }
        }
        return totalFactors;

    } 
    public static int summationofFactors(int []totalFactors){// a method to find the sum of the factors using factors array
        int sum=0;
        for(int factors:totalFactors){
            sum+=factors;

        }
        return sum;
    }
    public static int productofFactors(int []totalFactors){//method to find the product of the factors using factors array
        int prodcut=1; 
        for(int factors:totalFactors){
            prodcut*=factors;
        }
        return prodcut;
    }
    public static int sumOfSquaresOfFactors(int []totalFactors){// method to find the sum of square of the factors using Math.pow() method
        
        int sumOfSquare=0; 
        for(int factor:totalFactors){
            sumOfSquare+=Math.pow(factor, 2);
        }
        return sumOfSquare;

    }
    public static void main(String[] args) {
        Factors f=new Factors();
        Scanner sc=new Scanner(System.in); 
        System.out.println("Enter the number ");//Take the input for a number
        int number=sc.nextInt(); 
        int []totalNoOfFactors=getTotalFcators(number);  
        for(int x:totalNoOfFactors){
            System.out.println("The total no of the factor of the "+number+" is "+x);
        }
        int totalSumOfFactors=summationofFactors(totalNoOfFactors); 
        int totalProductOfFactors=productofFactors(totalNoOfFactors); 
        
        System.out.println("The total summation of factor of the "+number+" is "+totalSumOfFactors);
        System.out.println("The total prodcut of the factor of the number "+number+" is "+totalProductOfFactors);
    }
}
