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

		// Replace the even elements.
        for (int i = 0; i < randoms.length; i++) {
            if (randoms[i] % 2 == 0) // Number is even
            {
                randoms[i] = 0;
            }
        }

        // Print again to see new elements.
        for (int i = 0; i < 10; i++) {
            System.out.print(randoms[i] + " ");
        }
        System.out.println();
    }
}