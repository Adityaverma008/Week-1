
import java.util.Scanner;

class MaxElement{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Number:"); 
        int number=sc.nextInt();
        int maxDigit=10; 
        int []array=new int[maxDigit];  
        int index=0;
        while(number!=0){
            array[index]=number%10; 
            number/=10; 
            index++; 
            if(index==maxDigit)
            break;



        }
        int largest=0;
        int secondLargest=0;
        for(int i:array){ 
            if(i>largest){
                largest=Math.max(largest,i);
            } 
            else if(i>secondLargest&&i<largest){
                secondLargest=i;
            }

        } 
        System.out.println("The largest element in the array "+largest);
        System.out.println("The Second largest element in the array is"+secondLargest);




        
    }
}