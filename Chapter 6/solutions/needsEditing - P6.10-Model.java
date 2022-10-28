public class Main
{
   public static boolean isIn(int e, int[] b)
   {
      for (int i = 0; i < b.length; i++)
      {
         if (e == b[i])
         {
            return true;
         }
      }
      return false;
   }
   
   public static boolean sameSet(int[] a, int[] b)
   {
      for (int i = 0; i < a.length; i++)
      {
         if (!isIn(a[i], b))
         {
            return false;
         }
      }
      for (int i = 0; i < b.length; i++)
      {
         if (!isIn(b[i], a))
         {
            return false;
         }
      }
      return true;
   }   

   public static void main(String[] args)
   {
      int[] a = {1, 4, 9, 16, 9, 7, 4, 9, 11};
      int[] b = {11, 11, 7, 9, 16, 4, 1};

      System.out.print("The elements of the arrays a and b ");

      if (!sameSet(a, b))
      {
         System.out.print("do not ");
      }
      System.out.println("form the same set." );
   }
}
