import java.util.Scanner; 
class Multiplicationtable{
	public static void main(String[]args){ 
		Scanner sc=new Scanner(System.in); // Scanner object for user input
		int []Multiplication=new int[11];// array for storing the value
	       System.out.println("Enter the number for table");// 
		int number=sc.nextInt();// user giving input
		for(int i=1;i<=10;i++){ // Loop for calculating the table
			Multiplication[i]=number*i;// Logic applied
		}
			

	 
	for(int k=1;k<Multiplication.length;k++){
		System.out.println("The table value of"+number*[k]+" "+"is"+Multiplication[k]);
}

}
}
