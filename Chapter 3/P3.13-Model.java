import java.util.Scanner;

public class Main
{
   public static void main(String[] args)
   {
      Scanner in = new Scanner(System.in);

      final double A_VALUE = 4.0;
      final double A_M_VALUE = 3.7;
      final double B_P_VALUE = 3.3;
      final double B_VALUE = 3.0;
      final double B_M_VALUE = 2.7;
      final double C_P_VALUE = 2.3;
      final double C_VALUE = 2.0;
      final double C_M_VALUE = 2.7;
      final double D_P_VALUE = 1.3;
      final double D_VALUE = 1.0;
      final double D_M_VALUE = 0.7;
      final double F_VALUE = 0.0;

      System.out.println("Enter numeric grade: ");
      double numericGrade = in.nextDouble();

      String grade = "";
      
      if (numericGrade >= (A_VALUE + A_M_VALUE) / 2.0)
      {
         grade = "A";
      }
      else if (numericGrade >= (A_M_VALUE + B_P_VALUE) / 2.0)
      {
         grade = "A-";
      }
      else if (numericGrade >= (B_P_VALUE + B_VALUE) / 2.0)
      {
         grade = "B+";
      }
      else if (numericGrade >= (B_VALUE + B_M_VALUE) / 2.0)
      {
         grade = "B";
      }
      else if (numericGrade >= (B_M_VALUE + C_P_VALUE) / 2.0)
      {
         grade = "B-";
      }
      else if (numericGrade >= (C_P_VALUE + C_VALUE) / 2.0)
      {
         grade = "C+";
      }
      else if (numericGrade >= (C_VALUE + C_M_VALUE) / 2.0)
      {
         grade = "C";
      }
      else if (numericGrade >= (C_M_VALUE + D_P_VALUE) / 2.0)
      {
         grade = "C-";
      }
      else if (numericGrade >= (D_P_VALUE + D_VALUE) / 2.0)
      {
         grade = "D+";
      }
      else if (numericGrade >= (D_VALUE + D_M_VALUE) / 2.0)
      {
         grade = "D";
      }
      else if (numericGrade >= (D_M_VALUE + F_VALUE) / 2.0)
      {
         grade = "D-";
      }
      else
      {
         grade = "F";
      }
      System.out.printf("The letter grade is %s.", grade);
   }
}
