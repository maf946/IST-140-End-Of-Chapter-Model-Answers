public class Main
{
    public static void main(String[] args)
    {
        int[] myArray = new int[10];
        int mySize = 0;
        for (int i = 0; i < 6; i++)
        {
            myArray[i] = (int) (Math.random() * 100) +1;
            mySize++;
        }

        for (int i = 0; i < mySize; i++)
        {
            System.out.print(myArray[i] + " ");
        }
        System.out.println();

        // Find the minimum value first
        double min = myArray[0];
        int minPos = 0;

        for (int i = 1; i < mySize; i++)
        {
            if (myArray[i] < min)
            {
                min = myArray[i];
                minPos = i;
            }
        }

        // Now "eliminate" the minimum value
        for (int j = minPos; j < mySize - 1; j++)
        {
            myArray[j] = myArray[j + 1];
        }

        // Decrement  mySize
        mySize--;

        for (int i = 0; i < mySize; i++)
        {
            System.out.print(myArray[i] + " ");
        }
        System.out.println();
    }
}
