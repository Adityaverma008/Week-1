import java.util.Scanner; 
public class Maximumsum{
	public static void main(String[]args){
		//Create a variable to store an array of 10 elements of type double as well as a variable to store the total of type double initializes to 0.0. 
		//Also, the index variable is initialized to 0 for the array	
		 double []Array=new double[10];
		double sum=0.0; 
		int index=0;
		Scanner sc=new Scanner(System.in); 

	       while(true){//Use infinite while loop as in while (true)
			//Take the user entry and check if the user entered 0 or a negative number to break the loop 
			System.out.println("Enter the Element Value");
	       double  number=sc.nextDouble();
	      if(number<=10||index==10){ 				//Also, break from the loop if the index has a value of 10 as the array size is limited to 10.

		      break;
	      }
	      else{ 
		      Array[index]=number; 				//If the user entered a number other than 0 or a negative number inside the while loop then assign the number to the array element and increment the index value

		      index++;
	       }
	       }
	       for(int j=0;j<10;j++){
						//Take another for loop to get the values of each element and add it to the total 		

		       sum+=Array[j];
	       }
	       System.out.println(sum);// result;
	}
}
	       
	    


