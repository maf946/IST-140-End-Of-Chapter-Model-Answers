public class Main
{
   public static void main(String[] args) 
   {
      // The powers of 2 from 2^0 to 2^20
      for (int x = 0; x <= 20; x++) 
      {
         System.out.println( "2 to the " + x + " equals " 
            + Math.pow(2.0, x));
      }
   }
}
