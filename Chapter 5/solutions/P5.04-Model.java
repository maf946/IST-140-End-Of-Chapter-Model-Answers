import java.util.Scanner;

public class Main
{
   /**
      Finds the middle substring of a string.
      @param str  the input string
      @return a string containing the middle substring 
   */
   public static String middle(String str)
   {
      // No matter what, start of substring is
      // always calculated the same way.
      int start = (str.length() - 1) / 2;
   
      // Determine if string length is odd or even
      if (str.length() % 2 == 0) // It is even
      {
         // Return two characters
         return str.substring(start, start + 2);
      }
      else // it is odd
      {
         // Return one character
         return str.substring(start, start + 1); 
      }
   }

   public static void main(String[] args)
   {
      Scanner in = new Scanner(System.in);
      System.out.println("Enter a word: ");
      String s = in.next();

      System.out.println("The middle of that word is " + middle(s));
   }
}
