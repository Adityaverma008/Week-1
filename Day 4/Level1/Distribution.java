import java.util.Scanner;

public class Distribution{
  public static int[] findDistributionAndRemainder(int number, int divisor) {
    int ans[] = new int[2]; // initializing array for storing ans.
    
    ans[0] = number / divisor; // calculating distributed chocolates
    ans[1] = number % divisor; // calculating remaining chocolates
    
    return ans;
  }
  
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    // taking input.
    System.out.print("Enter the amount of chocolates and childrens: ");
    int numberOfchocolates = sc.nextInt();
    int numberOfChildren = sc.nextInt();
    
    // calling the method and storing it in the variable.
    int ans[] = findDistributionAndRemainder(numberOfchocolates, numberOfChildren);
    System.out.println("Each child will get: " + ans[0] + " and remaining chocolates are: " + ans[1]);
  }
}