import java.util.ArrayList;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        //read values
        ArrayList<Integer> values = new ArrayList<Integer>();
        System.out.println("Enter a sequence of integers.  "
                + "Enter a 'q' to quit: ");

        Scanner in = new Scanner(System.in);
        while (in.hasNextInt())
        {
            values.add(in.nextInt());
        }

        //find max and min
        int max = values.get(0);
        for (int x : values)
        {
            if (x > max)
            {
                max = x;
            }
        }
        int min = values.get(0);
        for (int x : values)
        {
            if (x < min)
            {
                min = x;
            }
        }

        //print chart
        int posStars = 40;
        int negStars = 0;
        if (Math.abs(min) > max)
        {
            negStars = 40;
            posStars = (int) (40.0 * max / Math.abs(min));
        }
        else if (min < 0)
        {
            negStars = (int) (40.0 * Math.abs(min) / max);
        }

        for (int i = 0; i < values.size(); i++)
        {
            int n = values.get(i);
            if (n >= 0)
            {
                int stars = (int) ((double) posStars * n / max);
                for (int j = 0; j < negStars; j++)
                {
                    System.out.print(" ");
                }
                for (int j = 0; j < stars; j++)
                {
                    System.out.print("*");
                }
                System.out.println();
            }
            else
            {
                int stars = (int) ((double) negStars * n / min);
                for (int j = 0; j < negStars - stars; j++)
                {
                    System.out.print(" ");
                }
                for (int j = 0; j < stars; j++)
                {
                    System.out.print("*");
                }
                System.out.println();
            }
        }
    }
}
