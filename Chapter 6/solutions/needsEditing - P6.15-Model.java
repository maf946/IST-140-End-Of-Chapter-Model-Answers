public class Main
{
   /**
      Generates an array n elements long with numbers from 1 to n
      @param n the length of the resulting array
      @return an array with numbers 1 to n
   */
   public static int[] generateArray(int n)
   {
      int[] list = new int[n];
      for (int i = 0; i < n; i++)
      {
         list[i] = (i + 1);
      }
      return list;
   }

   /**
      Makes an array of permuted values of the input.
      @param values input values, this array is empty after the call
      @return a permutation of values
   */
   public static int[] permuteArray(int[] values)
   {
      int[] permutation = new int[values.length];;
      int currentSize = values.length;
      for (int i = 0; i < values.length; i++)
      {
         int randomIndex = (int) (Math.random() * currentSize - 1);
         permutation[i] = values[randomIndex];
         values[randomIndex] = values[currentSize - 1];
         currentSize--;
      }
      return permutation;
   }

   /**
      Prints the values of an array.
      @param values values to print
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
      int[] values = generateArray(10);
      System.out.println("The original list: ");
      printArray(values);
      for (int i = 1; i <= 10; i++)
      {
         System.out.print("Permutation " + i + ": ");
         values = permuteArray(values);
         printArray(values);
      }
   }
}
