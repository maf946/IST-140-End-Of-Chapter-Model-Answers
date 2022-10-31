import java.util.ArrayList;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        ArrayList<Integer> values = new ArrayList<Integer>();
        ArrayList<String> captions = new ArrayList<String>();

        //read the values
        values.clear();
        captions.clear();

        System.out.println("Enter a sequence of positive integers followed by name.  "
                + "Enter a negative value to quit: ");

        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        while (n >= 0)
        {
            values.add(n);
            String caption = in.next();
            captions.add(caption);
            n = in.nextInt();
        }
        //print bar chart
        //find the max
        int max = values.get(0);
        for (int x : values)
        {
            if (x > max)
            {
                max = x;
            }
        }
        //find the longest caption
        int longest = captions.get(0).length();
        for (String x : captions)
        {
            if (x.length() > longest)
            {
                longest = x.length();
            }
        }
        for (int i = 0; i < values.size(); i++)
        {
            int z = values.get(i);
            String caption = captions.get(i);
            int spaces = longest - caption.length();
            for (int j = 0; j < spaces; j++)
            {
                System.out.print(" ");
            }
            System.out.print(caption + " ");

            // the 40.0 below comes from the maximum number of stars to print
            int stars = (int) (40.0 * z / max);

            for (int j = 0; j < stars; j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
