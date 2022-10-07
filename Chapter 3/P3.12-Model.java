import java.util.Scanner;

public class Main
{
   public static void main(String[] args)
   {
      Scanner in = new Scanner(System.in);

      final double A_VALUE = 4.0;
      final double B_VALUE = 3.0;
      final double C_VALUE = 2.0;
      final double D_VALUE = 1.0;
      final double F_VALUE = 0.0;
      final double PLUS_OR_MINUS_ADJUSTMENT = 0.3;

      System.out.println("Enter letter grade: ");
      String grade = in.next();

      double numericValue = F_VALUE;

      if (grade.charAt(0) == 'A')
      {
         numericValue = A_VALUE;
      }
      if (grade.charAt(0) == 'B')
      {
         numericValue = B_VALUE;
      }
      if (grade.charAt(0) == 'C')
      {
         numericValue = C_VALUE;
      }
      if (grade.charAt(0) == 'D')
      {
         numericValue = D_VALUE;
      }
      if (grade.charAt(0) == 'F')
      {
         numericValue = F_VALUE;
      }

      if (grade.length() == 2)
      {
         // has a + or -
         if (grade.charAt(1) == '+')
         {
            if (grade.charAt(0) != 'A')
            {
               numericValue += PLUS_OR_MINUS_ADJUSTMENT;
            }
         }
         else
         {
            // It must be a '-'
            numericValue -= PLUS_OR_MINUS_ADJUSTMENT;
         }
      }
      System.out.printf("The numeric value is %.1f.", numericValue);
   }
}
