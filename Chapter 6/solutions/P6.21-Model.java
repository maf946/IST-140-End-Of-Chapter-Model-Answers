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

        for(int i = 0; i < list.size(); i++)
        {
            for(int x = 0; x < list.get(i); x++)
            {
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}
