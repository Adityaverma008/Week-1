import java.util.*;
class Circle {
    // function for displaying area of a circle
    public void area(int radius){
        Double area = 3.14 * radius * radius;
        System.out.println("The area of the circle is:- " + area);

    }
    //function for displaying circumference of a circle
    public void circumference(int radii){
        Double circum = 2 * 3.14 * radii;
        System.out.println("The circumference of the circle is:- " + circum);
    }
}

public class area_Circle{
    public static void main(String[] args){
        Circle obj = new Circle();
        Scanner sc = new Scanner(System.in);
        int radius = sc.nextInt();
        int radii = sc.nextInt();

        obj.area(radius);
        obj.circumference(radii);

    }
}