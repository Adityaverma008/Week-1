public class p4{
    public static void main(String[] args){
        

        int cost_price = 129 , selling_price = 191;
        int profit = selling_price - cost_price;
        int profit_percentage = ((profit / cost_price) * 100);
        

        System.out.println("The cost price  is INR  " + cost_price + "and selling price is  INR " + selling_price );
        System.out.println("The profit is INR " + profit + "and the profit percentage is " + profit_percentage);
        
    }
}