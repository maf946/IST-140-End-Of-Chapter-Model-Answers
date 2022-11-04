import java.util.Scanner;

public class Main
{
   /**
      Calculates the refund amount based on income and no. of children.
      @param income 
      @param ch number of children
      @return refund amount 
   */
   public static double refund(double income, int ch)
   {
      if (ch != -1)
      {
         if (income > 30000 && income <= 40000 && ch >=3)
         {
            return 1000 * ch;
         }
         else if (income > 20000 && income <= 30000 && ch >=2)
         { 
            return 1500 * ch;
         }
         else if (income <= 20000)
         {
            return 2000 * ch;
         }    
      }
      return 0.0; 
   }
   
   public static void main(String[] args)
   {
      Scanner in = new Scanner(System.in);
      System.out.println("Please enter household income: ");
      double income = in.nextDouble();
   
      System.out.println("Number of children, enter -1 to exit: ");
      int ch = in.nextInt();
   
      System.out.printf("The refund amount is $%7.2f", refund(income, ch));
   }
}
