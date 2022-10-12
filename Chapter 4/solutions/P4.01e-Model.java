import java.util.Scanner;

public class Main
{
   public static void main(String[] args) 
   {
      Scanner in = new Scanner(System.in);

      // Get the input
      System.out.print("Enter an integer number: ");
      int num;
      num = in.nextInt();

      int sum = 0;
      int digit;

      // The sum of odd digits of the input
      while (num > 0) 
      {
         digit = num % 10;
         // Only add digit if it is odd
         if (digit % 2 == 1) 
         {
            sum = sum + digit;
         }
         num = num / 10;
      }

      // Output the result
      System.out.print("The sum is " + sum + ".");
   }
}
