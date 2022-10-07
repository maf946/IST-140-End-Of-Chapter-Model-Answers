import java.util.Scanner;

public class Main
{
   public static void main(String[] args)
   {
      final double GAS_STATE_CELSIUS = 100;
      final double LIQUID_STATE_CELSIUS = 0;

      final double GAS_STATE_FAHRENHEIT = 212;
      final double LIQUID_STATE_FAHRENHEIT = 32;

      final double BOILING_POINT_DROP_CELSIUS_FEET = 1000;
      final double BOILING_POINT_DROP_CELSIUS_METERS = 300;

      final double BOILING_POINT_DROP_FAHRENHEIT_FEET = 5.0 / 9.0 * BOILING_POINT_DROP_CELSIUS_FEET;
      final double BOILING_POINT_DROP_FAHRENHEIT_METERS = 5.0 / 9.0 * BOILING_POINT_DROP_CELSIUS_METERS;

      Scanner in = new Scanner(System.in);

      System.out.print("Enter temperature: ");
      double temp = in.nextDouble();

      System.out.print("Enter C for Celsius or F for Fahrenheit: ");
      String type = in.next();

      System.out.print("Enter elevation: ");
      double elevation = in.nextDouble();

      System.out.print("Enter M for meters or F for feet: ");
      String elevationUnits = in.next();

      if (type.compareTo("C") == 0)
      {
         double boilingPoint = GAS_STATE_CELSIUS;
         if (elevationUnits.compareTo("F") == 0)
         {
            boilingPoint -= BOILING_POINT_DROP_CELSIUS_FEET * elevation;
         }
         else
         {
            boilingPoint -= BOILING_POINT_DROP_CELSIUS_METERS * elevation;
         }
         // Celsius
         if (temp > boilingPoint)
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
         double boilingPoint = GAS_STATE_FAHRENHEIT;
         if (elevationUnits.compareTo("F") == 0)
         {
            boilingPoint -= BOILING_POINT_DROP_FAHRENHEIT_FEET * elevation;
         }
         else
         {
            boilingPoint -= BOILING_POINT_DROP_FAHRENHEIT_METERS * elevation;
         }

         // Fahrenheit
         if (temp > boilingPoint)
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
