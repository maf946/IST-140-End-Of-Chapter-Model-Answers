import java.util.Scanner;

public class Main
{
   public static void main(String[] args)
   {
      Scanner in = new Scanner(System.in);
      System.out.println("Enter two floating point numbers: ");
      double x = in.nextDouble();
      double y = in.nextDouble();

      if (Math.abs(x - y) < 0.01)
      {
         System.out.println("They are the same up to two decimal places.");
      }
      else
      {
         System.out.println("They are different.");
      }
   }
}
