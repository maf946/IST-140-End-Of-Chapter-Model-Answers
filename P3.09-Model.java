import java.util.Scanner;

public class Main
{
   public static void main(String[] args)
   {
      final double GAS_STATE_CELSIUS = 100;
      final double LIQUID_STATE_CELSIUS = 0;

      final double GAS_STATE_FAHRENHEIT = 212;
      final double LIQUID_STATE_FAHRENHEIT = 32;

      Scanner in = new Scanner(System.in);

      System.out.print("Enter temperature: ");
      double temp = in.nextDouble();

      System.out.print("Enter C for Celsius or F for Fahrenheit:");
      String type = in.next();

      if (type.compareTo("C") == 0)
      {
         // Celsius
         if (temp > GAS_STATE_CELSIUS)
         {
            System.out.println("It's a gas.");
         }
         else if (temp > LIQUID_STATE_CELSIUS)
         {
            System.out.println("It's a liquid.");
         }
         else
         {
            System.out.println("It's a solid.");
         }
      }
      else
      {
         // Fahrenheit
         if (temp > GAS_STATE_FAHRENHEIT)
         {
            System.out.println("It's a gas.");
         }
         else if (temp > LIQUID_STATE_FAHRENHEIT)
         {
            System.out.println("It's a liquid.");
         }
         else
         {
            System.out.println("It's a solid.");
         }
      }
   }
}
