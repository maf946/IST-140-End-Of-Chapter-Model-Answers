import java.util.Scanner;

public class Main
{
   public static void main(String[] args) 
   {
      int numOdd = 0;
      int numEven = 0;

      Scanner in = new Scanner(System.in);

      System.out.print("Enter a series of numbers, then type Q to process: ");
      int input;

      // Loop on input and check oddness or evenness
      while (in.hasNextInt()) 
      {
         input = in.nextInt();
         if (input % 2 == 0) // even
         {
            numEven++;
         } 
         else // odd
         {
            numOdd++;
         }
      }
      // Print the results
      System.out.println("Number of even: " + numEven + "\n" 
         + "Number of odd: " + numOdd);
   }
}
