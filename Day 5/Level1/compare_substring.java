import java.util.*;
public class compare_substring{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		//input string
		String str = sc.nextLine();

		//starting and ending line of the substring
		int start = sc.nextInt();
		int end = sc.nextInt();
		
		//creating empty string to store substring
		String sub = "";
		for(int i = start; i<end; i++){
			sub += str.charAt(i);
}
		//create substring with inbuilt method
		String sub2 = str.substring(2 , 5);
		if (sub.equals(sub2)){
			System.out.println("Both the substring are equal");
}
		else{
		    System.out.println("Both the substring are not equal");
}
		
		






}
}