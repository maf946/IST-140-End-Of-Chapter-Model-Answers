import java.util.Scanner;

public class Main
{
   public static void main(String[] args)
   {
      Scanner in = new Scanner(System.in);
      System.out.println("To compare two times in military format, first enter " 
         + "the hour of the first time: ");
      int hour1 = in.nextInt();
      System.out.println("Enter the minutes of the first time: ");
      int minute1 = in.nextInt();

      String time1 = hour1 + ":" + minute1;

      System.out.println("Now enter the hour of the second time: ");
      int hour2 = in.nextInt();
      System.out.println("Enter the minutes of the second time: ");
      int minute2 = in.nextInt();

      String time2 = hour2 + ":" + minute2;

      if (hour1 < hour2)
      {
         System.out.printf("%s comes first.", time1);
      }
      else if (hour1 == hour2)
      {
         if (minute1 < minute2)
         {
            System.out.printf("%s comes first.", time1);
         }
         else if (minute1 == minute2)
         {
            System.out.printf("%s and %s are the same.", time1, time2);
         }
         else
         {
            System.out.printf("%s comes first.", time2);
         }
      }
      else
      {
         System.out.printf("%s comes first.", time2);
      }
   }
}
