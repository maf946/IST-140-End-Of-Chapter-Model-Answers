import java.util.Scanner;

public class Main
{
   /**
      Counts the number of digits in an integer.
      @param n the number
      @return the number of digits in n
   */
   public static int numberOfDigits(int n)
   {
      // in case n is negative, make it positive and count that
      if (n < 0)
      {
         return numberOfDigits(-n);
      }
      if (n < 10)
      {
         return 1;
      }
      else
      {
         return 1 + numberOfDigits(n / 10);
      }
   }

   public static void main(String[] args)
   {
      Scanner in = new Scanner(System.in);
      System.out.println("Enter an integer n: ");
      int n = in.nextInt();
      System.out.println("Number of digits: " + numberOfDigits(n));
   }
}
