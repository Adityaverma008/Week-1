import java.util.*;
class mobile{
    private String brand;
    private String model;
    private int price;

    public mobile(String brand , String model , int price){
        this.brand = brand;
        this.model = model;
        this.price = price;
    }

    public void display(){
        System.out.println("The brand name of the mobile phone is:- " + brand);
        System.out.println("The model name of the mobile phone is:- " + model);
        System.out.println("The price of the mobile phone is:- " + price);
    }
}


public class mobile_phones {
    public static void main(String[] args) {
        //create scanner class
        Scanner sc = new Scanner(System.in);
        //take input of the detail
        String brand = sc.nextLine();
        String model = sc.nextLine();
        int price = sc.nextInt();
        //create object of that class
        mobile obj = new mobile(brand , model , price);

        obj.display();


    }
}
