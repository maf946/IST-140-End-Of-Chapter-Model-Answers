import java.util.Scanner;

public class Main
{
   public static void main(String[] args)
   {
      Scanner in = new Scanner(System.in);

      final double A = 17.27;
      final double B = 237.7;

      System.out.print("Relative humidity (between 0 and 1): ");
      double relativeHumidity = in.nextDouble();

      System.out.print("Temperature (in degrees C): ");
      double temperature = in.nextDouble();
 
      double f = (A * temperature)/(B + temperature) + Math.log(relativeHumidity);

      double dewPoint = (B * f) / (A - f);

      System.out.print("Dew point: " + dewPoint);
   }
}
