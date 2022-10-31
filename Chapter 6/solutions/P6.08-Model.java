public class Main
{
    public static void main(String[] args)
    {
        int[] myArray= {1, 4, 9, 16, 9, 7, 4, 11};

        int i = 0;
        int j = myArray.length / 2;
        int temp;

        while (i < myArray.length / 2)
        {
            temp = myArray[i];
            myArray[i] = myArray[j];
            myArray[j] = temp;
            i++;
            j++;
        }

        System.out.println("Printing the new array..." );

        for (int z = 0; z < myArray.length; z++)
        {
            System.out.print(myArray[z] + " ");
        }
        System.out.println();
    }
}
