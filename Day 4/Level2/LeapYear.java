
import java.util.Scanner;

public class LeapYear {
    public static boolean isLeapYearorNot(int year){
        if(year%4==0&&(year%100!=0||year%400==0)){// Logic of the Leap Year
            return true;
        }
        else{
            return false;
        }
    } 
    public static void main(String[] args) {
        LeapYear ly=new LeapYear(); 
        Scanner sc=new Scanner(System.in); 
        System.out.println("Enter the Year"); 
        int year=sc.nextInt();
        if(year<=1582){//Only work for the year >= 1582
            System.out.println("Not a Valid Year");
        } 
        boolean LeapYearyear=isLeapYearorNot(year); 
        if(LeapYearyear){
            System.out.println(year+" "+" is a Leap Year");
        }
        else{
            System.out.println(year+" "+" is not a Leap Year");
        }
        
    }
    
}
