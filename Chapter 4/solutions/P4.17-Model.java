import java.util.Scanner;

public class Main
{
   public static void main(String[] args)
   {
      Scanner in = new Scanner(System.in);
      System.out.println("Enter n: ");
      int n = in.nextInt();

      int currentFactor = 2;

      while (n > 1)
      {
         // If currentFactor divides n evenly, report it and divide it out
         if (n % currentFactor == 0)
         {
            System.out.println(currentFactor);
            n = n / currentFactor;
         }
         else
         {
            // Try the next factor
            currentFactor++;
         }
      }
   }
}
