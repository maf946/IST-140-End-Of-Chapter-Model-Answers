import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        final int LENGTH = 100;
        double[] scores = new double[LENGTH];
        int size = 0;

        // Read inputs
        System.out.println("Please enter scores, Q to quit:");
        Scanner in = new Scanner(System.in);
        while (in.hasNextDouble() && size < scores.length)
        {
            scores[size] = in.nextDouble();
            size++;
        }
        if (scores.length == 0)
        {
            System.out.println("At least one score is required.");
            return;
        }
        double total = 0;
        double smallest = scores[0];
        for (int i = 0; i < size; i++)
        {
            if (scores[i] < smallest)
            {
                smallest = scores[i];
            }
            total = total + scores[i];
        }
        total = total - smallest;
        System.out.println("Final score without smallest one: " + total);
    }
}
