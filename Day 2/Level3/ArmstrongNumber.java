import java.util.Scanner;  

class ArmstrongNumber{
    public static void main(String[]args){
        
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the Number");// take the input from user
        int number=sc.nextInt();
        int originalNumber=number;//copy the original number into other variable
        int sum=0;  // initialise value with zero
        int digit=finddigit(number);
        while(originalNumber!=0){// Logic
            int reminder=originalNumber%10; // reminder of each number
            sum+=Math.pow(reminder,digit);
            originalNumber/=10;


        } 
        if(sum==number){
            System.out.println(number+" "+" "+"is a armstrong number");
        }
        else{
            System.out.println(number+" "+"is not a armstrong number");
        } 
        sc.close();

    } 
    static   int finddigit(int number){
        int count=0; 
        while(number!=0){
            count++;
            number/=10;
        }
    
    return count;
}
}