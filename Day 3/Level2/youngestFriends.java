
import java.util.Scanner;

public class youngestFriends {
    public static void main(String[] args) {
        int []age=new int[10];
        int []height=new int[10];  
        Scanner sc=new Scanner(System.in);
        for(int i=0;i<3;i++){
            age[i]=sc.nextInt();
            height[i]=sc.nextInt();
        } 
        int youngerAge=Integer.MAX_VALUE;
        int tallestHeight=Integer.MIN_VALUE; 
        for(int i=0;i<3;i++){
            if(age[i]<youngerAge){
                youngerAge=age[i];
            } 
            else if(height[i]>tallestHeight){
                tallestHeight=height[i];
            }
        } 
        System.out.println("Youngest of among them is "+youngerAge+" "+"tallest of them is "+tallestHeight);

        
    }
    
}
