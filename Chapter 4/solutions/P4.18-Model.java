import java.util.Scanner;

public class Main
{
   public static void main(String[] args)
   {
      Scanner in = new Scanner(System.in);
      System.out.println("Enter n: ");
      int n = in.nextInt();

      // This loop test all numbers up to and including n

      for (int currentNumber = 2; currentNumber <= n; currentNumber++)
      {
         boolean primeSoFar = true;
         int testNumber = 2;
         while (primeSoFar && testNumber < currentNumber)
         {
            if (currentNumber % testNumber == 0)
            {
               // we found a factor, so it's not prime
               primeSoFar = false;
            }
            testNumber++;
         }
         if (primeSoFar)
         {
            System.out.println(currentNumber);
         }
      }
   }
}
