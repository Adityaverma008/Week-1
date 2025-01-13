import  java.util.Scanner;;
public class YoungestandTallest {
    int youngest(int younger){
        int youngestAge[]=new int[3];
        int result; 
        int age=Integer.MAX_VALUE;
        for(int i=0;i<3;i++){
            if(youngestAge[i]<age){
                age=youngestAge[i];
            }
            
        }
        return age;
    }
    int tallest(int taller){
        int tallestBoy[]=new int[3]; 
        int tallestBoyAmongthree=0;
        int tallest=Integer.MIN_VALUE; 
        for(int i=0;i<3;i++){
            if(tallestBoy[i]>tallest){
                tallestBoyAmongthree=tallestBoy[i];
            }
        }
        return tallestBoyAmongthree;
    }
    public static void main(String[]args){
        YoungestandTallest yt=new YoungestandTallest(); 
        Scanner sc=new Scanner(System.in); 
        System.out.println("Enter the Age of the Amar Akbar and Anthony"); 
        int Agevalue[]=new int[3]; 
        for(int i=0;i<2;i++){
            int age=sc.nextInt(); 
            Agevalue[i]=age;
        }
        int heightValue[]=new int[3];
        System.out.println("Enter the Height of Amar Akbar and Anthony"); 
        for(int i=0;i<2;i++){
            int Height=sc.nextInt();  
            heightValue[i]=Height;

        } 
        

    }
    
}
