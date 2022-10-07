import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter three numbers: ");
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();

        if (a <= b && a <= c && b <= c)
        {
            System.out.println("In order");
        }
        else if (a >= b && a >= c && b >= c)
        {
            System.out.println("In order");
        }
        else
        {
            System.out.println("Not in order");
        }
    }
}
