import java.util.Scanner;

public class Main
{
   /**
      Returns the average of the three arguments.
      @param x the first number
      @param y the second number
      @param z the third number
      @return a double which is the average of the three 
   */
 
   public static double average(double x, double y, double z)
   {
      return (x + y + z) / 3.0;
   }

   public static void main(String[] args)
   {
      Scanner in = new Scanner(System.in);
       
      System.out.println("Enter three numbers: ");
      double a = in.nextDouble();
      double b = in.nextDouble();
      double c = in.nextDouble();
 
      System.out.println("The average of the numbers is: " + average(a, b, c));
   }
}
