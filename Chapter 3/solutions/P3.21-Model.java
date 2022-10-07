import java.util.Scanner;

public class Main
{
   public static void main(String[] args)
   {
      Scanner in = new Scanner(System.in);

      System.out.print("Enter your income: ");
      double income = in.nextDouble();

      final double PERCENT_PER_STEP = 0.01;
      double tax = income * PERCENT_PER_STEP;
      if (income > 50000) 
      {
         tax += (income-50000) * PERCENT_PER_STEP;
      }
      if (income > 75000) 
      {
         tax += (income - 75000) * PERCENT_PER_STEP;
      }
      if (income > 100000) 
      {
         tax += (income - 100000) * PERCENT_PER_STEP;
      }
      if (income > 250000) 
      {
         tax += (income - 250000) * PERCENT_PER_STEP;
      }
      if (income > 500000) 
      {
         tax += (income - 500000) * PERCENT_PER_STEP;
      }

      System.out.printf("You owe $%.2f in tax.\n", tax);
   }
}
