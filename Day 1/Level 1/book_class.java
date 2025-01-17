import java.util.*;
class book {
    public void book_details(String title , String auther , int price){
        System.out.println("The title of the book is:- " + title);
        System.out.println("The auther of the book is:- " + auther);
        System.out.println("The price of the book is:- " + price);
    }
}

public class book_class{
    public static void main(String[] args){
        book obj = new book();
        Scanner sc = new Scanner(System.in);
        String title = sc.nextLine();
        String auther = sc.nextLine();
        int price = sc.nextInt();

        obj.book_details(title, auther, price);
    }
}
