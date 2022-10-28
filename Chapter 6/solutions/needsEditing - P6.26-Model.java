import java.util.ArrayList;

public class Main
{
   public static ArrayList<Integer> append(ArrayList<Integer> a, 
      ArrayList<Integer> b)
   {
      ArrayList<Integer> r = new ArrayList<>();
      for (int i = 0; i < a.size(); i++)
      {
         r.add(a.get(i));
      }
      for (int i = 0; i < b.size(); i++)
      {
         r.add(b.get(i));
      }
      return r;
   }

   public static void main(String[] args)
   {
      ArrayList<Integer> a = new ArrayList<>(5);
      ArrayList<Integer> b = new ArrayList<>(3);
      int i;
   
      for (i = 0; i < 5; i++)
      {
         /* Initialize array list a to some values */
         a.add(i + 3);    
      }
   
      for (i = 0; i < 3; i++)
      {
         /* Initialize array list b to some values */
         b.add(i + 2);
      }
   
      ArrayList<Integer> c = append(a, b);  
      System.out.println("Result of append of " + a + " and " + b + " is " + c);

   }
}