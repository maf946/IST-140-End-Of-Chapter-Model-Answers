import java.util.Scanner;

public class Main
{

   /**
      Converts a single decimal digit to its Roman equivalent based on
      the Roman characters passed as arguments.
      @param n digit to convert
      @param one Roman equivalent of "one"
      @param five Roman equivalent of "five"
      @param ten Roman equivalent of "ten"
      @return Roman equivalent of n
   */
   public static String romanDigit(int n, String one, String five, String ten)
   {
      if (n == 1)
      {
         return one;
      }
      if (n == 2)
      {
         return one + one;
      }
      if (n == 3)
      {
         return one + one + one;
      }
      if (n == 4)
      {
         return one + five;
      }
      if (n == 5)
      {
         return five;
      }
      if (n == 6)
      {
         return five + one;
      }
      if (n == 7)
      {
         return five + one + one;
      }
      if (n == 8)
      {
         return five + one + one + one;
      }
      if (n == 9)
      {
         return one + ten;
      }
      return "";  // in case n is zero
   }

   public static void main(String[] args)
   {
      Scanner in = new Scanner(System.in);
      System.out.println("Please enter a decimal numeral < 4,000: ");
      int n = in.nextInt();

      String romanOnes = romanDigit(n % 10, "I", "V", "X");
      n = n / 10;
      String romanTens = romanDigit(n % 10, "X", "L", "C");
      n = n / 10;
      String romanHundreds = romanDigit(n % 10, "C", "D", "M");
      n = n / 10;
      //program is only correct for n < 4000
      String romanThousands = romanDigit(n % 10, "M", "M", "M");

      System.out.println("The Roman equivalent is: " + romanThousands
         + romanHundreds + romanTens + romanOnes);
   }
}
