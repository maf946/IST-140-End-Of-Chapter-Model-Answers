import java.util.Scanner;

public class Main
{
   public static void main(String[] args)
   {
      final double METERS_PER_MILE = 1609.344;
      final double METERS_PER_FEET = 0.3048;
      final double METERS_PER_INCH = 0.0254;

      Scanner in = new Scanner(System.in);
      System.out.print("Please enter a measurement in meters: ");
      double meters = in.nextDouble();

      System.out.println("Coverted to miles: " + meters / METERS_PER_MILE);
      System.out.println("Coverted to feet: " + meters / METERS_PER_FEET);
      System.out.println("Coverted to inches: " + meters / METERS_PER_INCH);
   }
}
