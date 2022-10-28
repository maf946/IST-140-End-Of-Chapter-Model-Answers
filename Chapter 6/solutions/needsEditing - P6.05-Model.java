public class Main
{
   public static int removeMin(double[] input, int currentSize)
   {
      // Find the minimum value first
      double min = input[0];
      int minPos = 0;
   
      for (int i = 1; i < currentSize; i++)
      {
         if (input[i] < min)
         {
            min = input[i];
            minPos = i;
         }
      }
   
      // Now "eliminate" the minimum value
      for (int j = minPos; j < currentSize - 1; j++)
      {
         input[j] = input[j + 1];
      }
   
      // Decrement the currentSize
      currentSize--;
      return currentSize;
   }

   public static void main(String[] args)
   {
      int[] myArray = new int[10];
      int mySize = 0;
      for (int i = 0; i < 6; i++)
      {
         myArray[i] = (int) (Math.random() * 100) +1;
         mySize++;
      }

      for (int i = 0; i < mySize; i++)
      {
         System.out.print(myArray[i] + " ");
      }
      System.out.println();

      removeMin(myArray, mySize);
   
      for (int i = 0; i < mySize; i++)
      {
         System.out.print("myArray[i] + " ");
      }
      System.out.println();
   }
}
