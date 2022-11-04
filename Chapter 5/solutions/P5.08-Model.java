import java.util.Scanner;

public class Main
{
   /**
      Finds the position of the next blank character in a String.
      If none exists, the length of the string is returned.
      @param str string containing characters to search
      @param from character position where the search starts
      @return character position of the next blank character
   */
   public static int nextSpacePosition(String str, int from)
   {
      int position = from;
      boolean foundSpace = false;
      
      while (!foundSpace && position < str.length())
      {
         char ch = str.charAt(position);
         if (ch == ' ')
         {
            foundSpace = true;
         }
         position++;
      }
      if (foundSpace)
      {
         position--;
      }
      return position;
   }

   /**
      Finds the position of the next non-blank character in a String
      If none exists, the length of the string is returned.
      @param str string containing characters to search
      @param from character position where the search starts
      @return character position of the next non-blank character
   */
   public static int nextNonSpacePosition(String str, int from)
   {
      int position = from;
      boolean foundNonSpace = false;
      
      while (!foundNonSpace && position < str.length())
      {
         char ch = str.charAt(position);
         if (ch != ' ')
         {
            foundNonSpace = true;
         }
         position++;
      }
      if (foundNonSpace)
      {
         position--;
      }
      return position;
   }

   /**
      Finds the average length of words in a given string
      A word is a sequence of characters separated by any # of spaces
      @param str string to count words in
      @return number of words in str
   */
   public static double findAverageLength(String str)
   {
      int count = 0;
      int nextSpace = 0;
      double totalLength = 0;
      int wordLength = str.length();
      int charPos = nextNonSpacePosition(str, 0);
       
      while (charPos < str.length() && wordLength > 0)
      {
         nextSpace  = nextSpacePosition(str, charPos + 1);
         wordLength = nextSpace - charPos;
         if (wordLength > 0)
         {
            totalLength = totalLength + wordLength;
            charPos = nextNonSpacePosition(str, nextSpace + 1);
            count++;
         }
      }
      return totalLength/count;
   }
   
   public static void main(String[] args)
   {
      Scanner in = new Scanner(System.in);
      System.out.println("Enter a string: ");
      String s = in.nextLine();
   
      System.out.println("The average word length is " + 
         			 findAverageLength(s) + " characters(s)");
   }
}
