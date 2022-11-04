import java.util.Scanner;

public class Main
{
   /**
      Returns the smallest of the three arguments.
      @param x the first number
      @param y the second number
      @param z the third number
      @return a double which is the smallest of the three params
   */
   public static double smallest(double x, double y, double z)
   {
      if (x <= y && x <= z)
      {
         return x;
      }
      else if (y <= x && y <= z)
      {
         return y;
      }
      else
      {
         return z;
      }
   }

   public static void main(String[] args)
   { 
      Scanner in = new Scanner(System.in);
       
      System.out.println("Enter three numbers: ");
      double a = in.nextDouble();
      double b = in.nextDouble();
      double c = in.nextDouble();
 
      System.out.println("The smallest number is: " + smallest(a, b, c)); 
   }
}
