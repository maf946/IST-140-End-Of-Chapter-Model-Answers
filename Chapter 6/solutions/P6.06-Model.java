public class Main
{
    /**
     Computes the alternating sum of the values in an array list
     @return the alternating sum of the values in data
     */

    public static void main(String[] args)
    {
        double[] data = { 1, 4, 9, 16, 9, 7, 4, 9, 11 };
        double total = 0;
        for (int i = 0; i < data.length ; i++)
        {
            if (i % 2 == 0)
            {
                total += data[i];
            }
            else
            {
                total -= data[i];
            }
        }
        System.out.println("Alternating sum: " + total);
    }
}
