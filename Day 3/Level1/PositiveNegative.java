import java.util.Scanner; 
class PositiveNegative{ 
	public static void main(String[]args){ 
		Scanner sc=new Scanner(System.in);// Scanner class for the Input 
		System.out.println("Enter the Number to check the Value of Number"); 
		int []Number=new int[5]; // Array that will store the Numbers
		int i=0; 
		while(i<5){
			int number=sc. nextInt(); // User taking the Input
			if(number>0){// if the number is greater than zero
				if(number%2==0){// cheking the odd
					System.out.println("The number"+number+" "+"is positive and odd");
				}
			} 
			else if(number<0){// if the number is less than zero
				System.out.println("The number"+number+" "+ "is negative");
			}
			else{
				System.out.println("The number is zero");
			}
			Number[i]=number; 
			i++;
		}
		if(Number[0]==Number[4]){// cheking the value in the array
			System.out.println("The numbers are equal");
		}
		else if(Number[0]>Number[4]){// comparsion for greater element
			System.out.println("The number"+Number[0]+" "+"are greater than"+" " +Number[4]);
		}
		else{ 
			System.out.println("The number"+Number[0]+" "+"are greater than"+" "+Number[4]);
		}
	}
}

