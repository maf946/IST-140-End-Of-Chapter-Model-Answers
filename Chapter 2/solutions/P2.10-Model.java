import java.util.Scanner;

public class Main
{
   public static void main(String[] args)
   {
      final int YEARS_TO_OWN_CAR = 5;

      Scanner in = new Scanner(System.in);
      System.out.print("Enter the price of a new car: ");
      double carPrice = in.nextDouble();
      System.out.print("Enter estimated miles driven per year: ");
      int milesPerYear = in.nextInt();
      System.out.print("Enter estimated gas price: ");
      double gasPrice = in.nextDouble();
      System.out.print("Enter miles per gallon: ");
      double milesPerGallon = in.nextDouble();
      System.out.print("Enter estimated resale value: ");
      double resaleValue = in.nextDouble();

      double totalCostOfCar = carPrice + milesPerYear / milesPerGallon * 
		gasPrice * YEARS_TO_OWN_CAR - resaleValue;

      System.out.printf("Total cost of owning car for %d years: $%.2f.",
         YEARS_TO_OWN_CAR, totalCostOfCar);
   }
}
