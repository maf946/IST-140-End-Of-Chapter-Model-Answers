import java.util.Scanner;

public class Main
{

/**
   Count the number of vowels in a given string.
   @param str string to count vowels in
   @return number of vowels in str
*/
   public static int countVowels(String str)
   {
      int count = 0;
      for (int i = 0; i < str.length(); i++)
      {
         char ch = str.charAt(i);
         if (isVowel(ch))
         {
            count++;
         }
      }
      return count;
   }

/**
   Determines if a character is a vowel
   @param ch the character to be tested
   @return whether ch is a vowel, regardless of case
*/
   public static boolean isVowel(char ch)
   {
      boolean result = false;
      if (ch == 'a' || ch == 'A' || ch == 'e' || ch == 'E' || ch == 'i'
         || ch == 'I' || ch == 'o' || ch == 'O' || ch == 'u' || ch == 'U')
      {
         result = true;
      }
      return result;
   }
   
   public static void main(String[] args)
   {
      Scanner in = new Scanner(System.in);
      System.out.println("Enter a word: ");
      String s = in.next();

      System.out.println("The word has " + countVowels(s) + " vowels");
   }
}