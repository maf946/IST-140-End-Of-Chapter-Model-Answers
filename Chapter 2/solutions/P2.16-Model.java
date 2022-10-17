import java.util.Scanner;

public class Main
{
   public static void main(String[] args)
   {
      Scanner in = new Scanner(System.in);
      System.out.print("Please enter a positive integer no longer than five digits: ");
      int number = in.nextInt();

      int digit5 = number % 10;
      number /= 10;  // number = number / 10
      int digit4 = number % 10;
      number /= 10;
      int digit3 = number % 10;
      number /= 10;
      int digit2 = number % 10;
      number /= 10;
      int digit1 = number % 10;
      number /= 10;

      System.out.printf("%d %d %d %d %d\n", digit1, digit2, digit3, digit4,
         digit5);
   }
}
