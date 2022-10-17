import java.util.Scanner;

public class Main
{
   public static void main(String[] args)
   {
      Scanner in = new Scanner(System.in);
      System.out.print("Please enter a month number (1 through 12): ");
      int month = in.nextInt();

      String monthNames = "January  February March    April    May      June"
         + "     July     August   September October  November December ";

      String monthAsText = monthNames.substring((month - 1) * 9, (month) * 9);

      System.out.println(monthAsText);
   }
}
