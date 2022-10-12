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
         // Find out if letter is uppercase or not.
         char ch = word.charAt(n);
         if (ch == 'A' || ch == 'B' || ch == 'C'
            || ch == 'D' || ch == 'E' || ch == 'F'
            || ch == 'G' || ch == 'H' || ch == 'I'
            || ch == 'J' || ch == 'K' || ch == 'L'
            || ch == 'M' || ch == 'N' || ch == 'O'
            || ch == 'P' || ch == 'Q' || ch == 'R'
            || ch == 'S' || ch == 'T' || ch == 'U'
            || ch == 'V' || ch == 'W' || ch == 'X'
            || ch == 'Y' || ch == 'Z') 
         {
            System.out.print(ch);
         }
      }
   }
}
