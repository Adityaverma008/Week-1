
import java.util.Scanner;

public class TwoDArray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.err.println("Enter the number of rows"); 
        int row=sc.nextInt();
        System.out.println("Enter the number of colums");
        int column=sc.nextInt(); 
        int [][]Array=new int[row][column]; 
        for(int i=0;i<row;i++){
            for(int j=0;j<column;j++){
                Array[i][j]=sc.nextInt();// pushing value in the 2D array
            }
        } 
        int []OneDArray=new int[row*column];
        int index=0;
        for(int i=0;i<row;i++){
            for(int j=0;j<column;j++){
                OneDArray[index]=Array[i][j];// converting 2D Array to 1D array
                index++;

            }
        }
        for(int i=0;i<OneDArray.length;i++){
            System.out.println("The new OneDarray value is"+OneDArray[i]);
        }




        sc.close();
    }
}