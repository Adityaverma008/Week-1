import java.util.*;
class Bank{
    //taking attributes
    String AccountHolder;
    int AccountNumber;
    int AccountBalance;
//initialize constructor
    public Bank(String AccountHolder, int AccountNumber , int AccountBalance){
        this.AccountHolder = AccountHolder;
        this.AccountNumber = AccountNumber;
        this.AccountBalance = AccountBalance;
    }
//creating method for depositing money
    public void deposit(int deposit_amount){
        
        AccountBalance += deposit_amount;
    }
//creating method for withdrawl money
    public void Withdrawl(int withdraw){
    
        if (AccountBalance >= withdraw){
            AccountBalance -= withdraw;
            System.out.println("successful transactioin of amount:- " + withdraw);
        }
        else{
            System.out.println("you have not sufficient balance for this transaction");
        }
    }
    //creating method to display money
    public void current_balance(){
        System.out.println("Your current accountbalance is:- " + AccountBalance);
    }

}



public class Bank_account {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String AccountHolder = sc.nextLine();
        int AccountNumber = sc.nextInt();
        int accountbalance = sc.nextInt();
        
        Bank obj = new Bank(AccountHolder ,AccountNumber , accountbalance);
        System.out.println("Enter the amount you want to deposit:- ");
        int deposit_amount = sc.nextInt();
        obj.deposit(deposit_amount);

        System.out.println("Enter the amount you want to withdrawl:- ");
        int withdrawl = sc.nextInt();
        obj.Withdrawl(withdrawl);

        obj.current_balance();

    }
}
