import java.util.*;
class p_checker{
    String text;
    Boolean res;
    public p_checker(String text){
        this.text = text;
    }

    public void check(){
        String str = "";
        for(int i = text.length() - 1; i >= 0; i--){
            str += text.charAt(i);
        }
        res = text.equals(str);
    }

    public void display(){
        if (res){
            System.out.println("The string text is palindrome");
        }
        else{
            System.out.println("The string text is not palindrome");
        }
    }
}


public class palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String text = sc.nextLine();

        p_checker obj = new p_checker(text);

        obj.check();
        obj.display();
    }
}
