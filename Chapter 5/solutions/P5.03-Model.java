import java.util.Scanner;

public class Main
{
   /**
      Determines number of digits in a number.
      @param n  the input number
      @return the number of digits
   */
   public static int digits(int n)
   {
      // Loop dividing by 10 and counting 
      // number of loops until you get below 10
      int x = 1;
      while (n >= 10)
      {
         x++;
         n = n / 10;
      }
      return x;
   }

   /**
      Determines first digit in a number.
      @param n  the input number
      @return the first digit of the number
   */
   public static int firstDigit(int n)
   {
      // Loop based on number of digits in number,
      // dividing by 10 until you get to last digit
      int numDigs = digits(n);
      for (int x = 0; x < numDigs - 1; x++)
      {
         n = n / 10;
      }
      return n;
   }

   /**
      Determines last digit in a number.
      @param n  the input number
      @return the last digit of the number
   */
   public static int lastDigit(int n)
   {
      // The remainder when dividing by 10
      // is the last digit. Use modulo.
      return n % 10;
   }

   public static void main(String[] args)
   {
      Scanner in = new Scanner(System.in);
      System.out.println("Enter a number: ");
      int num = in.nextInt();

      System.out.println("The first digit is " + firstDigit(num));
      System.out.println("The last digit is " + lastDigit (num));
      System.out.println("The number of digits is " + digits(num));
  
   }
}
