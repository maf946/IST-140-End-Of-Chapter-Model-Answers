import java.util.Scanner;

public class Main
{
   public static void main(String[] args)
   {
      Scanner in = new Scanner(System.in);

      System.out.println("Input the price: ");
      double price = in.nextDouble();

      int dollars = (int) price;
      int cents = (int) ((price - dollars) * 100 + 0.5);

      System.out.printf("dollars: %d\n", dollars);
      System.out.printf("cents: %d\n", cents);
   }
}
