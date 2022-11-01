public class Main
{
    // This method assumes that the two array arguments
    // are the same size.

    public static void main(String[] args)
    {
        int[] a = {1, 4, 9, 16, 9, 7, 4, 9, 11};
        int[] b = {11, 1, 4, 9, 16, 9, 7, 4, 9};

        System.out.print("The arrays a and b ");

        //checks if they have the same elements
        boolean sameElements = true;
        for (int i = 0; i < a.length; i++)
        {
            int count = 0;
            for (int z = 0; z < a.length; z++)
            {
                if (a[i] == a[z])
                {
                    count++;
                }
            }
            int count2 = 0;
            for (int z = 0; z < a.length; z++)
            {
                if (a[i] == b[z])
                {
                    count2++;
                }
            }
            if (count != count2)
            {
                sameElements = false;
            }
        }

        if (!sameElements)
        {
            System.out.print("do not ");
        }

        System.out.println("have the same elements." );
    }
}
