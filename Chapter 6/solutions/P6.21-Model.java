import java.util.ArrayList;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);

        ArrayList<Integer> list = new ArrayList<Integer>();
        System.out.println("Enter a sequence of positive integers.  "
                + "Enter a negative value to quit: ");

        int userInput = scnr.nextInt();
        while (userInput >= 0)
        {
            list.add(userInput);
            userInput = scnr.nextInt();
        }

        // This solution truncates instead of rounding bar heights
        final int MAX_HEIGHT = 20;                // 20 is the maximum height
        //find the maximum value
        int max = list.get(0);
        for (int x : list)
        {
            if (x > max)
            {
                max = x;
            }
        }
        double scale = (double) MAX_HEIGHT / max; // scale value for each number

        for (int row = 0; row < MAX_HEIGHT; row++)   // print all rows every time
        {
            for (int col = 0; col < list.size(); col++)  // print 1 column for each item
            {
                int n = list.get(col);        // get the number
                n = (int) (n * scale);        // scale the number
                if (row >= MAX_HEIGHT - n)    // spaces at top (upward growing)
                {
                    System.out.print("*");
                }
                else
                {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
