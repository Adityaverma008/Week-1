
import java.util.Scanner;

public class FizzNumber {
    public static void main(String[] args) {
        
    
    Scanner sc=new Scanner(System.in);
    int number=sc.nextInt();
    String[]Result=new String[number];


    if(number>0){ 
        for(int i=0;i<number;i++){
            if(i%3==0){
                Result[i]="Fizz";
                
            } 
            else if(i%5==0){
                Result[i]="Buzz";
            } 
            else if(i%3==0&&i%5==0){
                Result[i]="FizzBuzz";
            } 
            else{
                Result[i]=Integer.toString(i);
            }

        }
    }
    for(int i=0;i<Result.length;i++){
        System.out.println(i+" "+Result[i]);
    }
    sc.close();
}
}

    

