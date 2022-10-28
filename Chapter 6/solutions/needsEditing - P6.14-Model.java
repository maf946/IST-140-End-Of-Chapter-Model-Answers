import java.util.Arrays;

public class Main
{
   /**
      Makes an array with n random values between 0-99.
      @param n the number of tosses to simulate
      @return an array with n random die tosses in it
   */
   public static int[] generateRandom(int n)
   {
      int[] tosses = new int[n];
      for (int i = 0; i < n; i++)
      {
         tosses[i] = (int) (Math.random() * 100);
      }
      return tosses;
   }

   /**
      Prints an array.
      @param values the array to print
   */
   public static void printArray(int[] values)
   {
      for (int i = 0; i < values.length; i++)
      {
         System.out.print(values[i] + " ");
      }
      System.out.println();
   }
   public static void main(String[] args)
   {
      int[] values = generateRandom(20);
      printArray(values);
      Arrays.sort(values);
      printArray(values);
   }

}
