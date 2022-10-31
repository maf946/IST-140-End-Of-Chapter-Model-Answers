public class Main
{
    public static void main(String[] args)
    {
        int[] arr1 = {1, 2, 3, 4, 5, 6, 7, 8};
        int[] arr2 = {1, 2, 3, 4, 5, 6, 7, 8};
        int[] arr3 = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int[] arr4 = {1, 2, 3, 4, 5, 4, 7, 8};

        System.out.print("Arrays 1 and 2 are ");
        boolean equal = false;
        if (arr1.length != arr2.length)
        {
            equal = false;
        }
        equal = true;
        for (int i = 0; i < arr1.length; i++)
        {
            if (arr1[i] != arr2[i])
            {
                equal = false;
            }
        }
        if (!equal)
        {
            System.out.print("not ");
        }
        System.out.println("equal." );

        System.out.print("Arrays 1 and 3 are ");
        equal = false;
        if (arr1.length != arr3.length)
        {
            equal = false;
        }
        equal = true;
        for (int i = 0; i < arr1.length; i++)
        {
            if (arr1[i] != arr3[i])
            {
                equal = false;
            }
        }

        if (equal)
        {
            System.out.print("not ");
        }
        System.out.println("equal." );

        System.out.print("Arrays 1 and 4 are ");
        equal = false;
        if (arr1.length != arr4.length)
        {
            equal = false;
        }
        equal = true;
        for (int i = 0; i < arr1.length; i++)
        {
            if (arr1[i] != arr4[i])
            {
                equal = false;
            }
        }
        if (!equal)
        {
            System.out.print("not ");
        }
        System.out.println("equal." );
    }
}
