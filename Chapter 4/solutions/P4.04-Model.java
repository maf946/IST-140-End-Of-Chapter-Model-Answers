import java.util.Scanner;

public class Main
{
   public static void main(String[] args)
   {
      Scanner in = new Scanner(System.in);
      double highestValue;
      highestValue = in.nextDouble();
      int highestMonth = 1;
      for (int currentMonth = 2; currentMonth <= 12; currentMonth++)
      {
         double nextValue = in.nextDouble();
         if (nextValue > highestValue)
         {
            highestValue = nextValue;
            highestMonth = currentMonth;
         }
      }
      System.out.println(highestMonth);
   }
}
