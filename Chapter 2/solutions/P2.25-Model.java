import java.util.Scanner;

public class Main
{
   public static void main(String[] args)
   {
      Scanner in = new Scanner(System.in);

      // Note input is in pennies to avoid roundoff errors in using doubles
      System.out.print("Enter amount due in pennies: ");
      int amountDue = in.nextInt();
      System.out.print("Enter amount received in pennies: ");
      int amountReceived = in.nextInt();

      int changeLeftInPennies = amountReceived - amountDue;

      int dollars = changeLeftInPennies / 100;
      changeLeftInPennies = changeLeftInPennies % 100;
      int quarters = changeLeftInPennies / 25;
      changeLeftInPennies = changeLeftInPennies % 25;
      int dimes = changeLeftInPennies / 10;
      changeLeftInPennies = changeLeftInPennies % 10;
      int nickels = changeLeftInPennies / 5;
      changeLeftInPennies = changeLeftInPennies % 5;
      int pennies = changeLeftInPennies;

      System.out.println("Give the following change: ");
      System.out.printf("Dollars %d\n", dollars);
      System.out.printf("Quarters %d\n", quarters);
      System.out.printf("Dimes %d\n", dimes);
      System.out.printf("Nickels %d\n", nickels);
      System.out.printf("Pennies %d\n", pennies);

   }
}
