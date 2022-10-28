public class Main
{
   public class MoveEvenToFront {
      public static boolean moveEvenToFront(int[] arr) {
         int endOfEvens = 0;
         int temp;
         boolean allEqual = true;

         int value = arr[0];
         for (int i = 0; i < arr.length; i++) {
            if (arr[i] != value) {
               allEqual = false;
            }
            if (arr[i] % 2 == 0) // Even
            {
               temp = arr[i];  // Save the even number

               // Move array element from end of
               // evens to current location
               for (int j = i; j > endOfEvens; j--) {
                  arr[j] = arr[j - 1];
               }
               arr[endOfEvens] = temp;
               endOfEvens++;
            }
         }
         return allEqual;
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

         // Move the evens to the front.
         if (moveEvenToFront(randoms)) {
            System.out.print("All elements are identical");
         }

         // Print again to see new order.
         for (int i = 0; i < randoms.length; i++) {
            System.out.print(randoms[i] + " ");
         }
         System.out.println();
      }
   }
}