public class Main
{
    public static void main(String[] args)
    {
        int[] randoms = new int[10];

        // Create a test array containing random numbers.
        for (int i = 0; i < randoms.length; i++)
        {
            randoms[i] = (int) (Math.random() * 100) + 1;
            // Print the values as they are assigned.
            System.out.print(randoms[i] + " ");
        }
        System.out.println();

        // Move the evens to the front.
        int endOfEvens = 0;
        int temp;
        boolean allEqual = true;

        int value = randoms[0];
        for (int i = 0; i < randoms.length; i++)
        {
            if (randoms[i] != value)
            {
                allEqual = false;
            }
            if (randoms[i] % 2 == 0) // Even
            {
                temp = randoms[i];  // Save the even number

                // Move array element from end of
                // evens to current location
                for (int j = i; j > endOfEvens; j--)
                {
                    randoms[j] = randoms[j - 1];
                }
                randoms[endOfEvens] = temp;
                endOfEvens++;
            }
        }
        if (allEqual)
        {
            System.out.print("All elements are identical");
        }

        // Print again to see new order.
        for (int i = 0; i < randoms.length; i++)
        {
            System.out.print(randoms[i] + " ");
        }
        System.out.println();
    }
}