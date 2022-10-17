import java.util.Scanner;

public class Main
{
   public static void main(String[] args) 
   {
      Scanner in = new Scanner(System.in);
      System.out.print("Please enter the first integer: ");
      int firstInt = in.nextInt();
      System.out.print("Please enter the second integer: ");
      int secondInt = in.nextInt();

      int sum = firstInt + secondInt;
      System.out.printf("Sum: %d\n", sum);

      int difference = firstInt - secondInt;
      System.out.printf("Difference: %d\n", difference);

      int product = firstInt * secondInt;
      System.out.printf("Product: %d\n", product);

      double average = (firstInt + secondInt) / 2.0;
      System.out.printf("Average: %f\n", average);

      int distance = Math.abs(difference);
      System.out.printf("Distance: %d\n", distance);

      int max = Math.max(firstInt, secondInt);
      System.out.printf("Maximum: %d\n", max);

      int min = Math.min(firstInt, secondInt);
      System.out.printf("Minimum: %d\n", min);
   }
}
