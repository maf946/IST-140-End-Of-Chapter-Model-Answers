import java.util.Scanner;

public class Main
{
   public static void main(String[] args)
   {
      final double SHIPPING_CHARGE_PER_BOOK = 2.0;
      final double TAX_RATE = 0.075;

      Scanner in = new Scanner(System.in);
      System.out.println("Enter total book price: ");
      double totalBookPrice = in.nextDouble();
      double tax = totalBookPrice * TAX_RATE;
      System.out.println("Enter the number of books: ");
      int numberOfBooks = in.nextInt();

      double shippingCharge = SHIPPING_CHARGE_PER_BOOK * numberOfBooks;
      double totalOrderPrice = totalBookPrice + tax + shippingCharge;
      System.out.printf("Total price of order: $%.2f", totalOrderPrice);
   }
}
