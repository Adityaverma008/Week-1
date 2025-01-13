  
import java.util.Scanner;// Scanner pkg for input value
class VotingEligibility{ 
public static void main(String[]args){
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the age  to Check Voting Eligibility");
	int []VotingList=new int[10];// array size of the Student
	int i=0;  // 
        while(i<VotingList.length){// Looping through array till last element
		int age=sc.nextInt(); 
		if(age<0){// if age is zero then Logic
			System.out.println("Invalid age");
		}
		else if(age>=18){// if the person is eligible for voting 
			System.out.println("The Student With the age"+age+" "+"can vote");
		}
		else if(age<18){// if the person is not eligible for voting
			System.out.println("The Student With the age"+age+" "+"cannot vote");
		} 
		VotingList[i]=age; // inserting the value in the array
		i++;// increamenting after each iteration
	}
}
}

