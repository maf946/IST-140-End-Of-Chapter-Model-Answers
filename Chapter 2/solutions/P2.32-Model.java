import java.util.Scanner;

public class Main
{
   public static void main(String[] args)
   {
      Scanner in = new Scanner(System.in);

      double f; // try 1.67E6;
      System.out.print("Enter f (in Hz): ");
      f = in.nextDouble();
      double cMin; // try 14E-12;
      System.out.print("Enter cMin (in F): ");
      cMin = in.nextDouble();
      double cMax; // try 365E-12;
      System.out.print("Enter cMax (in F): ");
      cMax = in.nextDouble();

      final double c = Math.sqrt(cMin * cMax);
      final double PI = 3.14159265358979323846;
      double L = 4 * PI * PI / (f * f * c);
      double fMin = 2 * PI / Math.sqrt(L * cMax);
      double fMax = 2 * PI / Math.sqrt(L * cMin);

      System.out.println("L = " + L + " H.");
      System.out.println(fMin + " Hz < f < " + fMax + " Hz.");
   }
}
