import java.util.Scanner;

public class Main
{
   public static void main(String[] args)
   {
      Scanner in = new Scanner(System.in);
      System.out.println("Enter n: ");
      int n = in.nextInt();

      int fold1 = 1;
      int fold2 = 1;

      // This prints out the first two numbers since the question suggests 
      // that f1 and f2 are precalculated

      if (n >= 1)
      {
         System.out.println(fold1);
      }
      if (n >= 2)
      {
         System.out.println(fold2);
      }

      for (int i = 3; i <= n; i++)
      {
         int fnew = fold1 + fold2;
         System.out.println(fnew);

         fold2 = fold1;
         fold1 = fnew;
      }
   }
}
