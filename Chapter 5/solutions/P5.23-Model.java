import java.util.Scanner;

public class Main
{
   /**
      Prints instructions on how to grind coffee.
   */
   public static void grindCoffee()
   {
      System.out.println("Add coffee beans to the coffee grinder.");
      System.out.println("Push the button for 60 seconds.");
   }

   /**
      Prints instructions on how to brew coffee.
   */
   public static void brewCoffee()
   {
      System.out.println("Add water to the coffee maker.");
      System.out.println("Put a filter in coffee maker.");
      grindCoffee();
      System.out.println("Add coffee beans to filter.");
      System.out.println("Turn coffee maker on.");
   }

   /**
      Prints instructions on how to boil water.
   */
   public static void boilWater()
   {
      System.out.println("Is there a microwave available? (yes/no) ");
      Scanner in = new Scanner(System.in);
      String result = in.next();
      if (result.equals("yes"))
      {
         System.out.println("Fill cup with water.");
         System.out.println("Place cup in microwave.");
         System.out.println("Heat for three minutes.");
      }
      else
      {
         System.out.println("Fill a kettle with water.");
         System.out.println("Heat kettle on stove until water comes "
            + "to a boil.");
      }
   }

   /**
      Prints instructions on how to make coffee.
   */
   public static void makeCoffee()
   {
      System.out.println("Is there instant coffee available? (yes/no) ");
      Scanner in = new Scanner(System.in);
      String result = in.next();
      if (result.equals("yes"))
      {
         boilWater();
         System.out.println("Mix boiling water with instant coffee.");
      }
      else
      {
         brewCoffee();
      }
   }

   /**
      Prints instructions on how to get coffee.
   */
   public static void getCoffee()
   {
      System.out.println("Can you ask someone? (yes/no) ");
      Scanner in = new Scanner(System.in);
      String result = in.next();
      if (result.equals("no"))
      {
         System.out.println("You must make coffee.");
         makeCoffee();
      }
      else
      {
         System.out.println("Ask for some.");
      }
   }

   public static void main(String[] args)
   {
      getCoffee();
   }
}
