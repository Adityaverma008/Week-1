import java.util.*;
public class compare_string{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String str1 = sc.nextLine();
		String str2 = sc.nextLine();
		Boolean b1 = false;
		if ( str1.length() != str2.length()){
			b1 = false;
		}
		else{
		     for(int i = 0; i<str1.length(); i++){
				if (str1.charAt(i) != str2.charAt(i)){
					b1 = false;

}
}

                b1 = true;
}
               //another method of comparing string using java inbuilt method
		Boolean b2 = false;
		if ( str1.length() != str2.length()){
			b2 = false;
		}
		else{
		     if (str1.equals(str2)){
			b2 = true;
}
}

              if (b1 == b2){
		System.out.println("both the String are equal");
}
else{
		System.out.println("Both string are not equal");
}

}
}