import java.util.Arrays;

public class Main
{
    /**
     Reverses an array.
     @return an array with the elements of data in reverse order
     */
    public static void main(String[] args)
    {
        double[] data = { 1, 4, 9, 16, 9, 7, 4, 9, 11 };
        double[] reversed = Arrays.copyOf(data, data.length);
        int j = 0;
        for (int i = data.length - 1; i >= 0; i--)
        {
            reversed[j] = data[i];
            j++;
        }
        for (int i = 0; i < reversed.length; i++)
        {
            System.out.print(reversed[i] + " ");
        }
        System.out.println();
    }
}
