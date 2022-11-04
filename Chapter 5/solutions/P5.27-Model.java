import java.util.Scanner;

public class Main
{
   /**
      Gives the value of the Roman numeral
      @param numeral a single Roman numeral
      @return the decimal value of numeral
   */
   public static int valueOf(char numeral)
   {
      if (numeral == 'I')
      {
         return 1;
      }
      if (numeral == 'V')
      {
         return 5;
      }
      if (numeral == 'X')
      {
         return 10;
      }
      if (numeral == 'L')
      {
         return 50;
      }
      if (numeral == 'C')
      {
         return 100;
      }
      if (numeral == 'D')
      {
         return 500;
      }
      // must be an M
      return 1000;
   }

   public static void main(String[] args)
   {
      Scanner in = new Scanner(System.in);
      System.out.println("Please enter a Roman numeral: ");
      String numeral = in.next();

      int value = 0;
      while (numeral.length() != 0)
      {
         if (numeral.length() == 1
            || valueOf(numeral.charAt(0)) >= valueOf(numeral.charAt(1)))
         {
            value += valueOf(numeral.charAt(0));
            numeral = numeral.substring(1);
         }
         else
         {
            value += valueOf(numeral.charAt(1)) - valueOf(numeral.charAt(0));
            numeral = numeral.substring(2);
         }
      }
      System.out.println("The value is " + value);
   }
}
