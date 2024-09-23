public class Main
{
    public static void main(String[] args)
    {
        double taxRate = 0.05;
        double itemPrice = 45.00;
        double salesTax = taxRate * itemPrice;
        double totalCost = itemPrice + salesTax;
        System.out.println("The price of your item is " + itemPrice + " dollars, the sales tax is " + salesTax + " dollars, the total cost is: " + totalCost + " dollars" );

    }
}