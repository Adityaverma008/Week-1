import java.util.Scanner;

class ticket{
    private String movieName;
    private int seatNumber;
    private int price;
    public ticket(String movieName , int seatNumber , int price){
        this.movieName = movieName;
        this.seatNumber = seatNumber;
        this.price = price;
    }
    public void BookTicket(){
        this.seatNumber = seatNumber;
        this.price = price;
    }
    public void display(){
        System.out.println("Your seatnumber for your movie " + movieName + " is " + seatNumber);
        System.out.println("And the overall price is:- " + price);
    }
    
}


public class movie_ticket {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String movieName = sc.nextLine();

        ticket obj = new ticket(movieName , 25 , 250);

        obj.BookTicket();
        obj.display();
    }
}
