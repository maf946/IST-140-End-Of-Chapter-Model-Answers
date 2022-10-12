import java.util.Scanner;

public class Main
{
   public static void main(String[] args)
   {
      Scanner in = new Scanner(System.in);
      System.out.println("Enter a word: ");
      String word = in.next();
      int syllableCount = 0;

      // This variable will help us keep track of strings of vowels
      boolean inSyllable = false;
      for (int i = 0; i < word.length(); i++)
      {
         char currentCharacter = word.charAt(i);
         if ( currentCharacter == 'a' || currentCharacter == 'A'
            || currentCharacter == 'i' || currentCharacter == 'I' 
            || currentCharacter == 'o' || currentCharacter == 'O'
            || currentCharacter == 'u' || currentCharacter == 'U'
            || currentCharacter == 'y' || currentCharacter == 'Y'
            || ((currentCharacter == 'e' || currentCharacter == 'E')
                 && i != word.length() - 1) )
         {
            if (!inSyllable)
            {
               syllableCount++;
               inSyllable = true;
            }
         }
         else
         {
            inSyllable = false;
         }
      }
      if (syllableCount == 0)
      {
         syllableCount = 1;
      }
      System.out.println(syllableCount + " syllable(s).");
   }
}
