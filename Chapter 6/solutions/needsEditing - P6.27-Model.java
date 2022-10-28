import java.util.ArrayList;

public class Main
{
   public static ArrayList<Integer> 
      merge(ArrayList<Integer> a, ArrayList <Integer> b)
   {
      int i = 0;
      int j = 0;
   
      ArrayList<Integer> c = new ArrayList<Integer>();
   
      while ((i < a.size()) && (j < b.size()))
      {
         c.add(a.get(i));
         c.add(b.get(j));
         i++;
         j++; 
      }    
      while (i < a.size())  // Have we more a elements to add?
      {
         c.add(a.get(i));
         i++;
      }      
      while (j < b.size())  // Have we more b elements to add?     
      {
         c.add(b.get(j));
         j++;
      }
      return c;
   }

   public static void main(String[] args)
   {
      ArrayList <Integer>  a = new ArrayList<>();
      ArrayList <Integer>  b = new ArrayList<>();
      final int MAX = 7;
   
   // Initialize array lists a and b to some values
      for (int i = 0; i < MAX; i++)      
      {
         a.add((int) (Math.random() * MAX));
         if (i % 2 == 0)
         {
            b.add((int) (Math.random() * MAX));
         }
      }
      ArrayList <Integer> c = merge(a, b); 
      System.out.println("Result of merge of " + a + " and " + b + " is " + c);
   }
}
