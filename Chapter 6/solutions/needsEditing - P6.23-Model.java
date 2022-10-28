import java.util.ArrayList;
import java.util.Scanner;

public class Main
{
   /**
      Read a sequence of positive integers and names from input and construct 
      an array list out of them.
      @param values an initially empty list that gets the positive values 
      from input
      @param captions an initially empty list that gets the captions 
      associated with the values
   */
   public static void readValues(ArrayList<Integer> values,
      ArrayList<String> captions)
   {
      values.clear();
      captions.clear();
      
      System.out.println("Enter a sequence of positive integers followed by name.  "
            + "Enter a negative value to quit: ");

      Scanner in = new Scanner(System.in);

      int n = in.nextInt();
      while (n >= 0)
      {
         values.add(n);
         String caption = in.next();
         captions.add(caption);
         n = in.nextInt();
      }
   }

   /**
      Return the largest element in the array list.
      @param list the input list
      @return the largest element in list
   */
   public static int findMax(ArrayList<Integer> list)
   {
      int max = list.get(0);
      for (int x : list)
      {
         if (x > max)
         {
            max = x;
         }
      }
      return max;
   }

   /**
      Return the length of the longest element in the array list.
      @param list the input list
      @return the length of the longest element in list
   */
   public static int findLongestCaption(ArrayList<String> captions)
   {
      int max = captions.get(0).length();
      for (String x : captions)
      {
         if (x.length() > max)
         {
            max = x.length();
         }
      }
      return max;
   }

   /**
      Prints a chart of asterisks based on the input list and largest
      element in the list.
      @param values the input list
   */
   public static void printBarChart(ArrayList<Integer> values,
      ArrayList<String> captions)
   {
      int max = findMax(values);
      int longest = findLongestCaption(captions);
      for (int i = 0; i < values.size(); i++)
      {
         int n = values.get(i);
         String caption = captions.get(i);
         int spaces = longest - caption.length();
         for (int j = 0; j < spaces; j++)
         {
            System.out.print(" ");
         }
         System.out.print(caption + " ");

         // the 40.0 below comes from the maximum number of stars to print
         int stars = (int) (40.0 * n / max);

         for (int j = 0; j < stars; j++)
         {
            System.out.print("*");
         }
         System.out.println();
      }
   }

   public static void main(String[] args)
   {
      ArrayList<Integer> list = new ArrayList<Integer>();
      ArrayList<String> captions = new ArrayList<String>();

      readValues(list, captions);
      printBarChart(list, captions);
   }
}
