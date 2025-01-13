
import java.util.Scanner;

public class OddevenArray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);// scanner class for the user input;
        System.err.println("Enter the number:"); 
        int []arr=new int[10];
        int number=sc.nextInt(); 
        if(number<0){// checking the number if it is natural or not
            System.out.println(number+" "+"is not a natural number");
            System.exit(0);
        }
        int size=number/2+1; 
        int oddindex=0,evenindex=0; // Declaring the oddindex and evenindex
        int []Oddarray=new int[size];// Declaring the odd Array
        int []Evenarray=new int[size];// Declaring the Evenarray
        for(int i=1;i<=number;i++){// traverse through number to store the value
            int number2=sc.nextInt(); 
            if(number2%2!=0){// check if the number is odd or even
                Oddarray[oddindex++]=number2;
            }
            else{
                Evenarray[evenindex++]=number2;
            }
        }
        
        for(oddindex=0;oddindex<Oddarray.length;oddindex++){// print the odd element values
            System.out.println("Odd number of the array is"+Oddarray[oddindex]);
        } 
        for(evenindex=0;evenindex<Evenarray.length;evenindex++){// print the even element values
            System.out.println("Even number of the array is"+Evenarray[evenindex]);
        }
        sc.close();

        
    }

    
}
