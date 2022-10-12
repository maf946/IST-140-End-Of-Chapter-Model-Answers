import java.util.Scanner;

public class Main
{
   public static void main(String[] args) 
   {
      Scanner in = new Scanner(System.in);
      // Get the inputs
      System.out.print("Enter a: ");
      int a;
      a = in.nextInt();

      System.out.print("Enter b: ");
      int b;
      b = in.nextInt();

      int sum = 0;
      // The sum of odd numbers between a and b
      for (int x = a; x <= b; x++) 
      {
         // Only add number if it is odd
         if (x % 2 == 1) {
            sum = sum + x;
         }
      }
      // Output the result
      System.out.println("The sum is " + sum + ".");
   }
}
