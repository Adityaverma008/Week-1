
import java.util.*;
class report{

    //initialize attributes
    String name;
    int roll;
    int marks;
    //creating constructor to hold values
    public report(String name, int roll, int marks){
        this.name = name;
        this.roll = roll;
        this.marks = marks;
    }
    //create grade method to display marks
    public void grade(){
        if (marks <= 35){
            System.out.println("Candidate is failed");
        }
        else if(marks > 35 && marks <= 70){
            System.out.println("Candidate acciqure average marks");
        }
        else{
            System.out.println("Candidate get First rank");
        }
    }
//create function to display marks and grades
    public void display(){
        System.out.println("Student name is:- " + name);
        System.out.println("Student roll is:- " + roll);
        System.out.println("Student marks is:- "+ marks);
//call grade function inside display funtion
        this.grade();
    }

}


public class student_report {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        String name = sc.nextLine();
        int roll = sc.nextInt();
        int marks = sc.nextInt();

        report obj = new report(name, roll, marks);

        obj.display();
        // obj.grade();

    }   
}