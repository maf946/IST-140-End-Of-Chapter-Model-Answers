import java.util.Scanner;

public class Main
{
   /**
      Calculates a^n.
      @param a base
      @param n power
      @return the value of a raised to the nth power
   */
   public static double power(double a, int n)
   {
      if (n == 0)
      {
         return 1;
      }
      if (n % 2 == 1)
      {
         return a * power(a, n - 1);
      }
      return Math.pow(power(a, n / 2), 2);
   }

   public static void main(String[] args)
   {
      Scanner in = new Scanner(System.in);
      System.out.println("Enter a base a: ");
      double a = in.nextInt();
      System.out.println("Enter a power n: ");
      int n = in.nextInt();
      System.out.println("a^n = " + power(a, n));
   }
}
