public class Main
{
    public static void main(String[] args)
    {
        //Generate the array
        int[] values = new int[10];
        for (int i = 0; i < values.length; i++)
        {
            values[i] = (i + 1);
        }
        System.out.println("The original list: ");
        for (int i = 0; i < values.length; i++)
        {
            System.out.print(values[i] + " ");
        }
        System.out.println();
        for (int i = 1; i <= 10; i++)
        {
            System.out.print("Permutation " + i + ": ");
            //permutate the array
            int[] permutation = new int[values.length];;
            int currentSize = values.length;
            for (int x = 0; x < values.length; x++)
            {
                int randomIndex = (int) (Math.random() * currentSize - 1);
                permutation[x] = values[randomIndex];
                values[randomIndex] = values[currentSize - 1];
                currentSize--;
            }
            values = permutation;

            for (int z = 0; z < values.length; z++)
            {
                System.out.print(values[z] + " ");
            }
            System.out.println();
        }
    }
}
