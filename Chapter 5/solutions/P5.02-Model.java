import java.util.Scanner;

public class Main
{
   /**
      Determines if the three arguments are all equal.
      @param x the first number
      @param y the second number
      @param z the third number
      @return true if all the same, otherwise false
   */
   public static boolean allTheSame(double x, double y, double z)
   {
      if (x == y && y == z)
      {
         return true;
      }
      else
      {
         return false;
      }
   }

   /**
      Determines if the three arguments are all NOT equal.
      @param x the first number
      @param y the second number
      @param z the third number
      @return true if all different, otherwise false
   */
   public static boolean allDifferent(double x, double y, double z)
   {
      if (x != y && y != z && x != z)
      {
         return true;
      }
      else
      {
         return false;
      }
   }

   /**
      Determines if the three arguments are in order, smallest first.
      @param x the first number
      @param y the second number
      @param z the third number
      @return true if in order, otherwise false
   */
   public static boolean sorted(double x, double y, double z)
   {
      if (x <= y && y <= z)
      {
         return true;
      }
      else
      {
         return false;
      }
   }

   public static void main(String[] args)
   {
      Scanner in = new Scanner(System.in);
        
      System.out.println("Enter three numbers: ");
      double a = in.nextDouble();
      double b = in.nextDouble();
      double c = in.nextDouble();
   
      if (allTheSame(a, b, c))
      {
         System.out.println("All the same!");
      }
   
      if (allDifferent(a, b, c))
      {
         System.out.println("All different!");
      }
   
      if (sorted(a, b, c))
      {
         System.out.println("Those darned numbers are sorted!");
      }
   }
}
