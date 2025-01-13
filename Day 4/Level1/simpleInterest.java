import java.util.Scanner;

public class simpleInterest{ 
    static void Sicalculator(int principle,int rate,int time){// Creating a static SIcalculator havin void return time
        int calculator=principle*rate*time/100;
        System.out.println("The Simple Intrest for "+principle+" "+"Rate of Intrest"+" "+rate+" "+"and time"+" "+time+" is "+calculator);
    } 
    public static void main(String[] args) { 
        simpleInterest si=new simpleInterest(); 
        Scanner sc=new Scanner(System.in); 
        System.out.println("Enter the Principle value");// taking princlipe
        int principleAmount=sc.nextInt(); 
        System.out.println("Enter the rate of Intrest");// taking amount
        int rateofIntrest=sc.nextInt();  
        System.out.println("Enter the time frame");//taking time
        int givenTime=sc.nextInt(); 
        Sicalculator(principleAmount,rateofIntrest,givenTime);// calling the Sicalculator function

        
    }


}