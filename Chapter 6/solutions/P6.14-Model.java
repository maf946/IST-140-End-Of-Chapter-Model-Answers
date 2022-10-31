import java.util.Arrays;

public class Main
{
    public static void main(String[] args)
    {
        int[] values = new int[20];
        for (int i = 0; i < values.length; i++)
        {
            values[i] = (int) (Math.random() * 100);
        }
        for (int i = 0; i < values.length; i++)
        {
            System.out.print(values[i] + " ");
        }
        System.out.println();
        Arrays.sort(values);
        for (int i = 0; i < values.length; i++)
        {
            System.out.print(values[i] + " ");
        }
        System.out.println();
    }
}
