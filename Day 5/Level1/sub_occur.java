import java.util.*;

public class sub_occur{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		String str = sc.nextLine();
		String sub = sc.nextLine();
		
		int count = 0;
		for(int i = 0; i <= str.length() - sub.length(); i++){
			if (str.substring(i, i + sub.length()).equals(sub)){
				count++;
}		
	
}

System.out.println("The number of times substring occure in main string is:- " + count);























}
}