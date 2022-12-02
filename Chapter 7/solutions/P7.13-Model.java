import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main
{
   /**
Reads a set of floating-point values from the console and returns the sum. When the user enters a value that is not a number, it gives the user a second chance to enter the value.  After that it returns the sum.
    */
   public static double readGetPoint()
   {
      Scanner console = new Scanner(System.in);

      System.out.println("Enter a list of floating point values: ");
      int failures = 0;
      double sum = 0;
      while (failures < 2)
      {
         try
         {
            sum += console.nextDouble();
            failures = 0;
         } 
         catch (InputMismatchException e)
         {
            System.out.println("That was not a floating point value.");
            String garbage = console.next();
            failures++;
         }
      }
      System.out.println("Two consecutive non-floating point values were "
         + "entered.");
      return sum;
   }

   public static void main(String[] args)
   {
      double sum = readGetPoint();
      System.out.println("The sum is: " + sum);
   }
}
