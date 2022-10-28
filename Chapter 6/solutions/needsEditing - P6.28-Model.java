import java.util.ArrayList;

public class Main
{
   public static ArrayList<Integer> 
      mergeSorted(ArrayList<Integer> a, ArrayList <Integer> b)
   {
      int i = 0;
      int j = 0;
   
      ArrayList<Integer> c = new ArrayList<Integer>();
   
      while ((i < a.size()) && (j < b.size()))
      {
         if (a.get(i) < b.get(j))
         {
            c.add(a.get(i));
            i++;
         }
         else
         {
            c.add(b.get(j));
            j++;        
         }
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
   
   // Initialize array lists a and b to some values
      for (int i = 0; i < 5; i++)      
      {
         a.add((i + 1) * (i + 1));
         b.add(i * 3);
      }
      ArrayList <Integer> c = mergeSorted(a, b);
   
      System.out.println("Result of merge of " + a + " and " + b + " is " + c);
   }
}
