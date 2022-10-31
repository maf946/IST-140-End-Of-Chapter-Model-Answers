public class Main
{
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
        // One way to do it: Find maximum once.
        int max = randoms[0];
        int size = randoms.length;

        for (int i = 1; i < size; i++) {
            if (randoms[i] > max) {
                max = randoms[i];
            }
        }

        // 2. Find the max again, ignoring the real max.
        int oldMax = max;
        max = randoms[0];

        for (int i = 1; i < size; i++) {
            if (randoms[i] != oldMax) {
                if (randoms[i] > max) {
                    max = randoms[i];
                }
            }
        }
        System.out.println("The second largest number is " + max);
    }
}