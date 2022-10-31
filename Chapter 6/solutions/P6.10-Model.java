public class Main
{
    public static void main(String[] args)
    {
        int[] a = {1, 4, 9, 16, 9, 7, 4, 9, 11};
        int[] b = {11, 11, 7, 9, 16, 4, 1};

        System.out.print("The elements of the arrays a and b ");

        boolean sameSet = true;
        for (int i = 0; i < a.length; i++)
        {
            boolean isIn = false;
            int e = a[i];
            for (int z = 0; z < b.length; z++)
            {
                if (e == b[z])
                {
                    isIn = true;
                }
            }
            if (!isIn)
            {
                sameSet = false;
            }
        }
        for (int i = 0; i < b.length; i++)
        {
            boolean isIn = false;
            int e = b[i];
            for (int z = 0; z < b.length; z++)
            {
                if (e == b[z])
                {
                    isIn = true;
                }
            }
            if (!isIn)
            {
                sameSet = false;
            }
        }

        if (!sameSet)
        {
            System.out.print("do not ");
        }
        System.out.println("form the same set." );
    }
}
