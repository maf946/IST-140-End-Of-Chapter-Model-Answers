import java.util.Scanner;

public class Main
{
   public static void main(String[] args)
   {
      final int MINUTES_IN_HOUR = 60;
      final int MINUTES_IN_DAY = 24 * 60;

      Scanner in = new Scanner(System.in);
      System.out.print("Please enter the first time: ");
      int firstTime = in.nextInt();
      int firstTimeInMinutes = firstTime / 100 * MINUTES_IN_HOUR + firstTime % 100;

      System.out.print("Please enter the second time: ");
      int secondTime = in.nextInt();
      int secondTimeInMinutes = secondTime / 100 * MINUTES_IN_HOUR + secondTime % 100;

      int minutes = secondTimeInMinutes - firstTimeInMinutes;

      // This takes care of negative minutes by adding an entire day to the
      // minutes
      // The % operator makes sure that the total minutes is less than a day
      minutes = (MINUTES_IN_DAY + minutes) % MINUTES_IN_DAY;

      int hours = minutes / 60;
      minutes %= 60;

      System.out.printf("%d hours %d minutes", hours, minutes);
   }
}
