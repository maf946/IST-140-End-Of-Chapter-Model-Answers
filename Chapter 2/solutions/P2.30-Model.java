import java.util.Scanner;

public class Main
{
   public static void main(String[] args)
   {
      Scanner in = new Scanner(System.in);

      final double R0 = 1075;
      final double C_TO_K = 273;
      final double T0 = 85 + C_TO_K;
      final double beta = 3969;

      System.out.print("Thermistor resistance: ");
      double R = in.nextDouble();
      double liquidTemperature = (beta * T0) / (T0 * log(R / R0) + beta) - C_TO_K;

      System.out.print("Liquid temperature: " + liquidTemperature);
   }
}
