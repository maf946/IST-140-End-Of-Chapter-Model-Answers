import java.util.Scanner;

public class Main
{
   public static void main(String[] args)
   {
      Scanner in = new Scanner(System.in);
         
      System.out.print("Enter four numbers: ");
      int a = in.nextInt();
      int b = in.nextInt ();
      int c = in.nextInt();
      int d = in.nextInt();
      
      if ((a == b) || (a == c) || (a == d))
      {
         if ((b == c) || (b == d))
         {
            System.out.println("Two pairs.");
         }
         else
         { 
            System.out.println("Not two pairs.");
         }
      }
      else 
      {
         System.out.println("Not two pairs.");
      }
   }
}
