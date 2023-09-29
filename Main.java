public class Main {
    public static void main(String[] args)
    {
        double priceOfitem = 5.76;
        double itemTax = priceOfitem * 0.05;
        double totalPrice = itemTax + priceOfitem;
        System.out.println("The total price of " + priceOfitem + " with tax is " + totalPrice);
    }
}