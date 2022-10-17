import java.util.Scanner;

public class Main
{
   public static void main(String[] args)
   {
      final int MINUTES_IN_HOUR = 60;

      Scanner in = new Scanner(System.in);
      System.out.print("Please enter the first time: ");
      int firstTime = in.nextInt();
      int firstTimeInMinutes = firstTime / 100 * MINUTES_IN_HOUR + firstTime % 100;

      System.out.print("Please enter the second time: ");
      int secondTime = in.nextInt();
      int secondTimeInMinutes = secondTime / 100 * MINUTES_IN_HOUR + secondTime % 100;

      int minutes = secondTimeInMinutes - firstTimeInMinutes;
      int hours = minutes / 60;
      minutes = minutes % 60;

      System.out.printf("%d hours %d minutes", hours, minutes);
   }
}
