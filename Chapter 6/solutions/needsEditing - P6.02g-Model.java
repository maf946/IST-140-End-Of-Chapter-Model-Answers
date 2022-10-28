public class Main
{
   public static int getSecondLargest(int[] arr) {
      // One way to do it: Find maximum once.
      int max = arr[0];

      for (int i = 1; i < size; i++) {
         if (arr[i] > max) {
            max = arr[i];
         }
      }

      // 2. Find the max again, ignoring the real max.
      int oldMax = max;
      max = arr[0];

      for (int i = 1; i < size; i++) {
         if (arr[i] != oldMax) {
            if (arr[i] > max) {
               max = arr[i];
            }
         }
      }
      return max;

   }

   public static void main(String[] args) {
      int[] randoms = new int[10];

      // Create a test array containing random numbers.
      for (int i = 0; i < randoms.length; i++) {
         randoms[i] = (int) (Math.random() * 100) + 1;
         // Print the values as they are assigned.
         System.out.print(randoms[i] + " ");
      }
      System.out.println();

      // Find the second largest.
      System.out.println("The second largest number is " +
              +getSecondLargest(randoms));
   }
}