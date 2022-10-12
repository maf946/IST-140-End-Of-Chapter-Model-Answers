import java.util.Scanner;

public class Main
{
   public static void main(String[] args)
   {
      Scanner in = new Scanner(System.in);
      System.out.println("Enter side length: ");
      int sideLength = in.nextInt();

      // Print out top of diamond
      for (int row = 1; row <= sideLength; row++)
      {
         // print out body of diamond
         for (int column = 1; column <= sideLength * 2 - 1; column++)
         {
            // This line determines whether the column is within "row" 
            // distance of the middle. As row increases the widths increase
            if (Math.abs(column - sideLength) < (row))
            {
               System.out.print("*");
            }
            else
            {
               System.out.print(" ");
            }
         }
         System.out.println();
      }

      // Print out bottom of diamond
      for (int row = sideLength - 1; row > 0; row--)
      {
         // Print out body of diamond
         for (int column = 1; column <= sideLength * 2 - 1; column++)
         {
            if (Math.abs(column - sideLength) < (row))
            {
               System.out.print("*");
            }
            else
            {
               System.out.print(" ");
            }
         }
         System.out.println();
      }
   }
}
