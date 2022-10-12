import java.util.Scanner;

public class Main
{
   public static void main(String[] args) 
   {
      Scanner in = new Scanner(System.in);
      System.out.print("Enter a word with no spaces: ");
      String word;
      word = in.next();

      System.out.print("Vowels in positions: ");
      for (int n = 0; n < word.length(); n++) 
      {
         // Check each letter to see if a vowel, 
         // and print its position
         char ch = word.charAt(n);
         if (ch == 'a' || ch == 'A'
            || ch == 'e' || ch == 'E'
            || ch == 'i' || ch == 'I'
            || ch == 'o' || ch == 'O'
            || ch == 'u' || ch == 'U') 
         {
            System.out.print(n + " ");
         }
      }
   }
}
