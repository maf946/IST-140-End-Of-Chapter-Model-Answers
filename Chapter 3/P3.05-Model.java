import java.util.Scanner;

public class Main
{
   public static void main(String[] args)
   {
      Scanner in = new Scanner(System.in);
      System.out.print("Enter three numbers: ");
      double a = in.nextDouble();
      double b = in.nextDouble();
      double c = in.nextDouble();
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
}
