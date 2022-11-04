import java.util.Scanner;

public class Main
{

   /**
      Converts a single bar code digit to the decimal number
      @barCode barCode the bar code to convert
      @return the decimal representation of barCode
   */
   public static int barCodeToDigit(String barCode)
   {
      if (barCode.equals("||:::"))
      {
         return 0;
      }
   
      int digit = 0;
      if (barCode.charAt(0) == '|')
      {
         digit += 7;
      }
      if (barCode.charAt(1) == '|')
      {
         digit += 4;
      }
      if (barCode.charAt(2) == '|')
      {
         digit += 2;
      }
      if (barCode.charAt(3) == '|')
      {
         digit += 1;
      }
   
      // Make sure that special digits have the "0"
      if ((digit == 1 || digit == 2 || digit == 4 || digit == 7)
         && barCode.charAt(4) != '|')
      {
         return -1;
      }
      else if (digit < 1 || digit > 9)
      {
         // Might get an invalid digit if the barcode is wrong
         return -1;
      }
      else
      {
         return digit;
      }
   }

   public static void main(String[] args)
   {
      Scanner in = new Scanner(System.in);
      System.out.println("Please enter a bar code: ");
      String barCode = in.next();
      if (barCode.length() != 32)
      {
         System.out.println("Error, barcode is incorrect length.");
      }
      else
      {
         int sum = 0;
         int zip = 0;
         for (int i = 0; i < 5; i++)
         {
            int digit = barCodeToDigit(barCode.substring(1 + i * 5, 6 + i * 5));
            if (digit == -1)
            {
               System.out.println("Encountered an invalid barcode digit.");
               return;
            }
            zip = digit + 10 * zip;
            sum += digit;
         }
         int checkDigit = barCodeToDigit(
             barCode.substring(1 + 5 * 5, 7 + 5 * 5));
         if ((checkDigit + sum) % 10 != 0)
         {
            System.out.println("Error checkdigit mismatch.");
         }
         else
         {
            System.out.println(zip);
         }
      }
   }
}
