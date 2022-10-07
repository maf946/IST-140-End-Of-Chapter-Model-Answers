import java.util.Scanner;

public class Main
{
   public static void main(String[] args)
   {
      Scanner in = new Scanner(System.in);
      System.out.println("Please enter your birthday (month and day):  ");
      int month = in.nextInt();
      int day = in.nextInt();

      if ((month == 1 && day >= 20) || (month == 2 && day <= 19))
      {
         System.out.println("Aquarius horoscope");
      }
      else if ((month == 2 && day >= 20) || (month == 3 && day <= 20))
      {
         System.out.println("Pisces horoscope");
      }
      else if ((month == 3 && day >= 21) || (month == 4 && day <= 19))
      {
         System.out.println("Aries horoscope");
      }
      else if ((month == 4 && day >= 20) || (month == 5 && day <= 20))
      {
         System.out.println("Taurus horoscope");
      }
      else if ((month == 5 && day >= 21) || (month == 6 && day <= 20))
      {
         System.out.println("Gemini horoscope");
      }
      else if ((month == 6 && day >= 21) || (month == 7 && day <= 22))
      {
         System.out.println("Cancer horoscope");
      }
      else if ((month == 7 && day >= 23) || (month == 8 && day <= 22))
      {
         System.out.println("Leo horoscope");
      }
      else if ((month == 8 && day >= 23) || (month == 9 && day <= 22))
      {
         System.out.println("Virgo horoscope");
      }
      else if ((month == 9 && day >= 23) || (month == 10 && day <= 23))
      {
         System.out.println("Libra horoscope");
      }
      else if ((month == 10 && day >= 24) || (month == 11 && day <= 22))
      {
         System.out.println("Scorpio horoscope");
      }
      else if ((month == 11 && day >= 23) || (month == 12 && day <= 21))
      {
         System.out.println("Sagittarius horoscope");
      }
      else
      {
         System.out.println("Capricorn horoscope");
      }
   }
}
