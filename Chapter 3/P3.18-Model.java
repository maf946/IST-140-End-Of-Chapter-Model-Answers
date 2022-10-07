import java.util.Scanner;

public class Season
{
   public static void main(String[] args)
   {
      Scanner in = new Scanner(System.in);
      System.out.println("Enter a month and day: ");
      int month = in.nextInt();
      int day = in.nextInt();

      String season = "";
      if (month <= 3)
      {
         season = "Winter";
      }
      else if (month <= 6)
      {
         season = "Spring";
      }
      else if (month <= 9)
      {
         season = "Summer";
      }
      else
      {
         season = "Fall";
      }
      if (month % 3 == 0 && day >= 21)
      {
         if (season.compareTo("Winter") == 0)
         {
            season = "Spring";
         }
         else if (season.compareTo("Spring") == 0)
         {
            season = "Summer";
         }
         else if (season.compareTo("Summer") == 0)
         {
            season = "Fall";
         }
         else
         {
            season = "Winter";
         }
      }
      System.out.println(season);
   }
}
