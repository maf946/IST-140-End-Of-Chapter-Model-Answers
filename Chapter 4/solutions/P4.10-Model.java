import java.util.Scanner;

public class Main
{
   public static void main(String[] args)
   {
      Scanner in = new Scanner(System.in);
      System.out.println("Enter a set of floating-point values.  Enter "
         + "anything other than a number to indicate the end of the "
         + "series:  ");

      boolean first = true;
      double min = 0;
      double max = 0;
      double sum = 0.0;

      // We'll use this number for the average later
      int numberOfValuesSeen = 0;

      while (in.hasNextDouble())
      {
         double value = in.nextDouble();
         numberOfValuesSeen++;
         if (first)
         {
            min = value;
            max = value;
            sum = value;
            first = false;
         }
         else
         {
            if (value < min)
            {
               min = value;
            }
            if (value > max)
            {
               max = value;
            }
            sum = sum + value;
         }
      }

      System.out.printf("The average of the values is: %f%n", sum
         / numberOfValuesSeen);
      System.out.printf("The smallest value is %f%n", min);
      System.out.printf("The largest value is %f%n", max);
      System.out.printf("The range is %f%n", max - min);
   }
}
