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

        int last = randoms.length - 1;
        int temp = randoms[0];
        randoms[0] = randoms[last];
        randoms[last] = temp;

        // Print again to see new order.
        for (int i = 0; i < 10; i++) {
            System.out.print(randoms[i] + " ");
        }
        System.out.println();
    }
}