import java.util.Scanner;

public class Main
{
   public static void main(String[] args)
   {
      Scanner in = new Scanner(System.in);

      System.out.println("Enter phone number: ");
      String phoneNumber = in.next();

      String areaCode = phoneNumber.substring(0, 3);
      String prefix = phoneNumber.substring(3, 6);
      String postfix = phoneNumber.substring(6, 10);

      String formattedNumber = "(" + areaCode + ") " + prefix + "-" + postfix;
      System.out.println(formattedNumber);
   }
}
