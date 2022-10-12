import java.util.Scanner;

public class Main
{
   public static void main(String[] args) 
   {
      Scanner in = new Scanner(System.in);
      System.out.print("Enter a word with no spaces: ");
      String word;
      word = in.next();
      for (int n = 0; n < word.length(); n++) 
      {
         // Print only if n is odd (which is every second letter)
         char ch = word.charAt(n);
         if (n % 2 == 1) // odd
         {
            System.out.print(ch);
         }
      }
   }
}
