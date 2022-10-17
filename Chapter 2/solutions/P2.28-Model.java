import java.util.Scanner;

public class Main
{
   public static void main(String[] args)
   {
      Scanner in = new Scanner(System.in);

      // input from user
      System.out.print("R1: ");
      double r1 = in.nextDouble();

      System.out.print("R2: ");
      double r2 = in.nextDouble();

      System.out.print("R3: ");
      double r3 = in.nextDouble();

      // Formatted output
      double totalResistance = r1 + 1 / (1 / r2 + 1 / r3);
      System.out.printf("Total resistance: %.2f\n ", totalResistance);
   }
}
