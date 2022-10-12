import java.util.Scanner;

public class Main
{
   public static void main(String[] args)
   {
      Scanner in = new Scanner(System.in);
      System.out.println("Enter a series of floating point data values.  " +
         "Enter anything other than a number to quit: ");

      int count = 0;
      double sum = 0.0;
      double sumOfSquares = 0.0;

      while (in.hasNextDouble())
      {
         double number = in.nextDouble();
         sum = sum + number;
         sumOfSquares = sumOfSquares + Math.pow(number, 2);
         count++;
      }

      System.out.println("Total count: " + count);
      System.out.println("Average: " + sum / count);

      double standardDeviation = Math.sqrt((sumOfSquares - Math.pow(sum, 2)
         / count) / (count - 1));

      System.out.println("Standard deviation: " + standardDeviation);
   }
}
