import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter S for strict ordering, L for lenient (S or L): ");
        String answer = in.nextLine();

        System.out.print("Enter three numbers: ");
        double a = in.nextDouble();
        double b = in.nextDouble();
        double c = in.nextDouble();

        if (answer.equals("S") || answer.equals("s")) // strict ordering
        {
            if (a < b && a < c && b < c)
            {
                System.out.println("increasing");
            }
            else if (a > b && a > c && b > c)
            {
                System.out.println("decreasing");
            }
            else
            {
                System.out.println("neither");
            }
        }
        else  // Lenient ordering
        {
            if (a == b && a == c && b == c)
            {
                System.out.println("increasing and decreasing");
            }
            else if (a <= b && a <= c && b <= c)
            {
                System.out.println("increasing");
            }
            else if (a >= b && a >= c && b >= c)
            {
                System.out.println("decreasing");
            }
            else
            {
                System.out.println("neither");
            }
        }
    }
}
