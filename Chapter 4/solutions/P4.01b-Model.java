public class Main
{
   public static void main(String[] args) 
   {
      int sum = 0;
      // The sum of all squares between 1 and 100
      for (int x = 1; x <= 100; x++) 
      {
         sum = sum + x * x;
      }
      // Output the result
      System.out.println("The sum is " + sum);
   }
}
