import java.util.Scanner;

public class Main
{
   /**
      Calculates the check digit from zip.
      @param zip zip code
      @return the check digit for zip
   */
   public static int checkDigit(int zip)
   {
      int remaining = zip;
      int sum = 0;
      while (remaining > 0)
      {
         sum += remaining % 10;
         remaining = remaining / 10;
      }
      return 10 - (sum % 10);
   }

   /**
      Converts a single digit to the postal bar code.
      @param digit the digit to convert
      @return the bar code equivalent of digit
   */
   public static String printDigit(int digit)
   {
      if (digit == 1)
      {
         return ":::||";
      }
      if (digit == 2)
      {
         return "::|:|";
      }
      if (digit == 3)
      {
         return "::||:";
      }
      if (digit == 4)
      {
         return ":|::|";
      }
      if (digit == 5)
      {
         return ":|:|:";
      }
      if (digit == 6)
      {
         return ":||::";
      }
      if (digit == 7)
      {
         return "|:::|";
      }
      if (digit == 8)
      {
         return "|::|:";
      }
      if (digit == 9)
      {
         return "|:|::";
      }
      return "||:::";
   }

   /**
      Converts a zip to the postal bar code.
      @param zipCode the code to convert
      @return the bar code equivalent to the zip
   */
   public static String printBarCode(int zipCode)
   {
      int zip = zipCode;
      String barCode = "";
      for (int i = 0; i < 5; i++)
      {
         barCode = printDigit(zip % 10) + barCode;
         zip = zip / 10;
      }
      return barCode;
   }

   public static void main(String[] args)
   {
      Scanner in = new Scanner(System.in);
      System.out.println("Please enter a zip code: ");
      int zip = in.nextInt();
      int checkDigit = checkDigit(zip);

      // Initialize to the right frame bar 
      String barCode = "|";

      // Add zip code bar codes
      barCode = printDigit(checkDigit) + barCode;
      barCode = printBarCode(zip) + barCode;

      // Add left frame bar
      barCode = "|" + barCode;
      System.out.println(barCode);
   }
}
