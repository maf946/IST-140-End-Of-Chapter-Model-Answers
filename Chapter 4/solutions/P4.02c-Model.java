import java.util.Scanner;

public class Main
{
   public static void main(String[] args) 
   {
      double sum = 0.0;
      Scanner in = new Scanner(System.in);

      System.out.print("Enter a series of numbers, then type Q to process: ");
      double input;
      // Calculate and print cumulative totals
      while (in.hasNextDouble()) 
      {
         input = in.nextDouble();
         sum = sum + input;
         System.out.print(sum + " ");
      }
   }
}
