public class Main {
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
        int size = randoms.length;
        if (size % 2 == 0)  // Size is even
        {
            // Figure out starting point for removal
            int firstToRemove = size / 2 - 1;

            // Remove middle two elements
            for (int i = firstToRemove; i < size - 2; i++) {
                randoms[i] = randoms[i + 2];
            }
        } else  // Size is odd
        {
            // Figure out starting point for removal
            int firstToRemove = size / 2;

            // Remove middle element
            for (int i = firstToRemove; i < size - 1; i++) {
                randoms[i] = randoms[i + 1];
            }
        }

        // Print again to see new order.
        int printSize = randoms.length - 2;
        if(size % 2 == 1){
            printSize = randoms.length - 1;
        }
        for (int i = 0; i < printSize; i++) {
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
        size = randoms.length;
        if (size % 2 == 0)  // Size is even
        {
            // Figure out starting point for removal
            int firstToRemove = size / 2 - 1;

            // Remove middle two elements
            for (int i = firstToRemove; i < size - 2; i++) {
                randoms[i] = randoms[i + 2];
            }
        } else  // Size is odd
        {
            // Figure out starting point for removal
            int firstToRemove = size / 2;

            // Remove middle element
            for (int i = firstToRemove; i < size - 1; i++) {
                randoms[i] = randoms[i + 1];
            }
        }

        // Print again to see new order.
        printSize = randoms.length - 2;
        if(size % 2 == 1){
            printSize = randoms.length - 1;
        }

        for (int i = 0; i < printSize; i++) {
            System.out.print(randoms[i] + " ");
        }
        System.out.println();
    }
}
