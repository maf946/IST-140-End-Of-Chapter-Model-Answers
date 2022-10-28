import java.util.ArrayList;
import java.util.Scanner;

public class Main
{
   /**
      Read a sequence of positive integers from input and construct an
      array list out of them.
      @return an array list of values from user input
   */
   public static ArrayList<Integer> readValues()
   {
      ArrayList<Integer> list = new ArrayList<Integer>();
      System.out.println("Enter a sequence of integers.  "
         + "Enter a 'q' to quit: ");

      Scanner in = new Scanner(System.in);
      while (in.hasNextInt())
      {
         list.add(in.nextInt());
      }
      return list;
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
      Return the smallest element in the array list.
      @param list the input list
      @return the smallest element in list
   */
   public static int findMin(ArrayList<Integer> list)
   {
      int min = list.get(0);
      for (int x : list)
      {
         if (x < min)
         {
            min = x;
         }
      }
      return min;
   }

   /**
      Prints a chart of asterisks based on the input list and largest
      and smallest elements in the list.
      @param values the input list
   */
   public static void printBarChart(ArrayList<Integer> values)
   {
      int max = findMax(values);
      int min = findMin(values);

      int posStars = 40;
      int negStars = 0;
      if (Math.abs(min) > max)
      {
         negStars = 40;
         posStars = (int) (40.0 * max / Math.abs(min));
      }
      else if (min < 0)
      {
         negStars = (int) (40.0 * Math.abs(min) / max);
      }

      for (int i = 0; i < values.size(); i++)
      {
         int n = values.get(i);
         if (n >= 0)
         {
            int stars = (int) ((double) posStars * n / max);
            for (int j = 0; j < negStars; j++)
            {
               System.out.print(" ");
            }
            for (int j = 0; j < stars; j++)
            {
               System.out.print("*");
            }
            System.out.println();
         }
         else
         {
            int stars = (int) ((double) negStars * n / min);
            for (int j = 0; j < negStars - stars; j++)
            {
               System.out.print(" ");
            }
            for (int j = 0; j < stars; j++)
            {
               System.out.print("*");
            }
            System.out.println();
         }
      }
   }

   public static void main(String[] args)
   {
      ArrayList<Integer> list = readValues();
      printBarChart(list);
   }
}
