
import java.util.Scanner;

public class MaxFactors {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int maxFactor=10;
        int []Factors=new int[maxFactor];
        int index=0;

        System.out.println("Enter a number"); 
        int number=sc.nextInt();
        

        for(int i=1;i<=number;i++){
            if(number%i==0){
                if(index==maxFactor)
                maxFactor*=2;
                int []temp=new int[maxFactor]; 
                for(int j=0;j<Factors.length;j++){
                    temp[j]=Factors[j];
                }
                Factors=temp;
                
            } 
            Factors[index++]=i;
        } 
        System.out.println("Factors of the "+" "+number+" "+are+" "); 
        for(int i=0;i<index;i++){
                System.out.println(Factors[i]);
        }
        sc.close();

        
    }
}   
