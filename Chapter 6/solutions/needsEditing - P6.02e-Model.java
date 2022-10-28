public class Main
{
    public static void removeMiddle(int[] arr) {
        int size = arr.length;
        if (size % 2 == 0)  // Size is even
        {
            // Figure out starting point for removal
            int firstToRemove = size / 2 - 1;

            // Remove middle two elements
            for (int i = firstToRemove; i < size - 2; i++) {
                arr[i] = arr[i + 2];
            }
        } else  // Size is odd
        {
            // Figure out starting point for removal
            int firstToRemove = size / 2;

            // Remove middle element
            for (int i = firstToRemove; i < size - 1; i++) {
                arr[i] = arr[i + 1];
            }
        }
    }

    public static void main(String[] args) {
        int[] randoms = new int[11];
        // Create a test array containing random numbers
        for (int i = 0; i < randoms.length; i++) {
            randoms[i] = (int) (Math.random() * 100) + 1;
            // Print the values as they are assigned.
            System.out.print(randoms[i] + " ");
        }
        System.out.println();

        // Remove the middle element(s)
        removeMiddle(randoms);

        // Print again to see new order.
        for (int i = 0; i < randoms.length; i++) {
            System.out.print(randoms[i] + " ");
        }
        System.out.println();

        randoms = new int[10];
        // Create a test array with an even number of elements
        for (int i = 0; i < randoms.length; i++) {
            randoms[i] = (int) (Math.random() * 100) + 1;
            // Print the values as they are assigned.
            System.out.print(randoms[i] + " ");
        }
        System.out.println();

        // Remove the middle element(s)
        removeMiddle(randoms);

        // Print again to see new order.
        for (int i = 0; i < randoms.length; i++) {
            System.out.print(randoms[i] + " ");
        }
        System.out.println();
    }
}