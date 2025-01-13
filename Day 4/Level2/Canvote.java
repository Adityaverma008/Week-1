
import java.util.Scanner;

public class Canvote {
    public static boolean canVote(int age){
        if(age<0){// if a negative return is false cannot vote.
            return false;
        } 
        else{
                if(age>=18){//For valid age check for age is 18 or above return true; else return false;
                    return true;
                } 
                else{
                    return false;
                }
            }
        } 
        public static void main(String[] args) {
            Canvote c=new Canvote();
            Scanner sc=new Scanner(System.in); 
            System.out.println("Enter the age");
            int age=sc.nextInt();
            int numberofStudent[]=new int[10];
            int counter=0; 
            while(counter<10){//array of 10 integer elements, 
                numberofStudent[counter]=age; 
                counter++;
            } 
//he method firstly validate the age for a negative number, 
            for(int i=0;i<numberofStudent.length;i++){
                if(canVote(numberofStudent[i])){//define an loop through the array by take user input for the student's age, call canStudentVote() and display the result

                    System.out.println("Eligible for voting ");
                }
                else{
                    System.out.println("Not Elgible for the voting");
                }
            }

            }
        }
