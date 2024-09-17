public class Main {
    public static void main(String[] args) {
        double SALES_TAX = .05;
        double myItemPrice = 7.80;
        double myItemSalesTax = myItemPrice * SALES_TAX;
        System.out.println("my item is $"+myItemPrice);
        System.out.println("my item's sales tax is: "+ myItemSalesTax);
    }
}