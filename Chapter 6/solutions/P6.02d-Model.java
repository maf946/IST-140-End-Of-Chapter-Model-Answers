public class Main
{
    public static void main(String[] args) {
        int[] randoms = new int[10];
        // Create a test array containing random numbers.
        for (int i = 0; i < 10; i++) {
            randoms[i] = (int) (Math.random() * 100) + 1;
            // Print the values as they are assigned.
            System.out.print(randoms[i] + " ");
        }
        System.out.println();

        // Replace with larger neighbor
        // Start loop at one, and stop before the end
        for (int i = 1; i < randoms.length - 1; i++) {
            if (randoms[i - 1] > randoms[i + 1]) {
                randoms[i] = randoms[i - 1];
            } else {
                randoms[i] = randoms[i + 1];
            }
        }

        // Print again to see new elements.
        for (int i = 0; i < 10; i++) {
            System.out.print(randoms[i] + " ");
        }
        System.out.println();
    }
}