import java.util.Scanner;
//creating employee class
class Employee {

   //class method to display data
    public void display(String name, int id, int salary) {
        System.out.println(name);
        System.out.println(id);
        System.out.println(salary);
    }
}

//main class to create object in it
public class emp {
    public static void main(String[] args) {
        // Create an Employee object and display details
        Employee obj1 = new Employee();
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();
        obj1.display(str, 7,9000);  // Calling display method to print details
    }
}
