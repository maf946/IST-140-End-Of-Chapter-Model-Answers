public class Main
{
   /**
      Computes the alternating sum of the values in an array list
      @param data an array list of values
      @return the alternating sum of the values in data
   */
   public static double alternatingSum(double[] data)
   {
      double total = 0;
      for (int i = 0; i < data.length ; i++)
      {
         if (i % 2 == 0)
         {
            total += data[i];
         }
         else
         {
            total -= data[i];
         }
      }
      return total;
   }

   public static void main(String[] args)
   {
      double[] data = { 1, 4, 9, 16, 9, 7, 4, 9, 11 };
      double total = alternatingSum(data);
      System.out.println("Alternating sum: " + total);
   }
}
