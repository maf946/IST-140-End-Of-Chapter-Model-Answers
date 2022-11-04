import java.util.Scanner;

public class Main
{
   /**
      Turns a digit into its English name.
      @param digit an integer between 1 and 9
      @return the name of digit ("one" ... "nine")
   */
   public static String digitName(int digit)
   {
      if (digit == 1)
      {
         return "one";
      }      
      if (digit == 2)
      {
         return "two";
      }      
      if (digit == 3)
      {
         return "three";
      }      
      if (digit == 4)
      {
         return "four";
      }      
      if (digit == 5)
      {
         return "five";
      }      
      if (digit == 6)
      {
         return "six";
      }      
      if (digit == 7)
      {
         return "seven";
      }      
      if (digit == 8)
      {
         return "eight";
      }      
      if (digit == 9)
      {
         return "nine";
      }      
      return "";
   }

   /**
      Turns a number between 10 and 19 into its English name.
      @param number an integer between 10 and 19
      @return the name of the given number ("ten" ... "nineteen")
   */
   public static String teenName(int number)
   {
      if (number == 10)
      {
         return "ten";
      }      
      if (number == 11)
      {
         return "eleven";
      }      
      if (number == 12)
      {
         return "twelve";
      }      
      if (number == 13)
      {
         return "thirteen";
      }      
      if (number == 14)
      {
         return "fourteen";
      }      
      if (number == 15)
      {
         return "fifteen";
      }      
      if (number == 16)
      {
         return "sixteen";
      }      
      if (number == 17)
      {
         return "seventeen";
      }      
      if (number == 18)
      {
         return "eighteen";
      }      
      if (number == 19)
      {
         return "nineteen";
      }      
      return "";
   }

   /**
      Gives the name of the tens part of a number between 20 and 99.
      @param number an integer between 20 and 99
      @return the name of the tens part of the number ("twenty" ... "ninety")
   */
   public static String tensName(int number)
   {
      if (number >= 90)
      { 
         return "ninety";
      }      
      if (number >= 80)
      {
         return "eighty";
      }           
      if (number >= 70)
      {
         return "seventy";
      }           
      if (number >= 60)
      {
         return "sixty";
      }            
      if (number >= 50)
      {
         return "fifty";
      }      
      if (number >= 40)
      {
         return "forty";
      }      
      if (number >= 30)
      {
         return "thirty";
      }      
      if (number >= 20)
      {
         return "twenty";
      }      
      return "";
   }

   /**
      Turns a number into its English name.
      @param number a positive integer < 1,000
      @return the name of the number (e.g. "two hundred seventy four")
   */
   public static String intName(int number)
   {
      int part = number; // The part that still needs to be converted 
      String name = ""; // The return value
   
      if (part >= 100)
      {
         name = digitName(part / 100) + " hundred";
         part = part % 100;
      }
   
      if (part >= 20)
      {
         name = name + " " + tensName(part);
         part = part % 10;
      }
      else if (part >= 10)
      {
         name = name + " " + teenName(part);
         part = 0;
      }
   
      if (part > 0)
      {
         name = name + " " + digitName(part);
      }
   
      return name;
   }

   /**
      Prints the fake payer, bank, check number, and date at the top of the 
      check.
   */
   public static void printCheckHeader()
   {
      System.out.printf("Acme Corp \t\t\t\t\tBig Bank\t\t\t\tCheck Number: "
         + "1234\n");
      System.out.printf("123 St. \t\t\t\t\t321 Small St.\t\t\t\t\n");
      System.out.printf("Big City, NY 012345 \t\t\t\tSmall City, AK 543210"
         + "\t\t\t\t\n");
      System.out.printf("\t\t\t\t\t\t\t\t\t\tDate:\t\tAmount:\n");
      System.out.printf("\t\t\t\t\t\t\t\t\t\t04/29/09\t$");
   }

   /**
      Prints the pay amount so that it is right aligned and filled with *’s.
      @param amount a pay amount < 1,000
   */
   public static void printPayAmount(double amount)
   {
      // This aligns the amount with some asterisks
      System.out.printf("***");
      if (amount < 100)
      {
         System.out.printf("*");
      }
      if (amount < 10)
      {
         System.out.printf("*");
      }
      System.out.printf("%.2f", amount);
   }

   /**
      Prints the footer of the check including the English equivalent of the 
      amount.
      @param payee name of the payee
      @param dollarAmountAsString dollar amount to pay in English
      @param centsAmount value of the cents to be paid
   */
   public static void printCheckFooter(String payee,
      String dollarAmountAsString, int centsAmount)
   {
      System.out.print("\nPAY\n");
      dollarAmountAsString = dollarAmountAsString + " " + centsAmount
         + " / 100 ";
      System.out.printf("%s", dollarAmountAsString);
   
      // This part adds asterisks after the English number amount
      for (int i = 0; i < 106 - dollarAmountAsString.length(); i++)
      {
         System.out.print("*");
      }
      System.out.printf("\n");
      System.out.printf("TO THE ORDER OF:\n");
      System.out.printf("\t\t\t\t\t\t%s\n", payee);
      System.out.printf("\t\t\t\t\t\t124 Fake Rd\n");
      System.out.printf("\t\t\t\t\t\tSmall Town, NK 43251\n");
      System.out.printf("\t\t\t\t\t\t\t\t\t\t\t\t___________________\n");
      System.out.printf("\t\t\t\t\t\t\t\t\t\t\t\t___________________\n");
      System.out.printf("\t\t\t\t\t|:478108240|:  200620375\"* 1301\n");
   }

   /**
      Calculates the total pay using the 40 hour 1.5 x time overtime 
      calculation.
      @param hourlyRate
      @param hoursWorked
      @return the total pay with an adjustment for 1.5x pay if worked over 
      40 hours
   */
   public static double totalPay(double hourlyRate, double hoursWorked)
   {
      double basePay = hourlyRate * hoursWorked;
      if (hoursWorked > 40)
      {
         basePay += .5 * hourlyRate * (hoursWorked - 40);
      }
      return basePay;
   }

   public static void main(String[] args)
   {
      Scanner in = new Scanner(System.in);
      System.out.println("Enter the first name of the employee: ");
      String fname = in.next();
      System.out.println("Enter the last name of the employee: ");
      String lname = in.next();
      System.out.println("Enter the hourly rate: ");
      double hourlyRate = in.nextDouble();
      System.out.println("Enter the hours worked: ");
      double hoursWorked = in.nextDouble();
   
      printCheckHeader();
      double pay = totalPay(hourlyRate, hoursWorked);
      printPayAmount(pay);
      int dollars = (int) pay;
      int cents = (int) ((pay * 100) % 100);
      printCheckFooter((fname + " " + lname), intName(dollars).toUpperCase(), cents);
   }
}
