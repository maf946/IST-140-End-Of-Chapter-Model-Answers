import java.util.Scanner;

public class Main
{
   public static void main(String[] args)
   {
      Scanner in = new Scanner(System.in);
      System.out.println("Enter three strings: ");
      String a = in.next();
      String b = in.next();
      String c = in.next();
      
      String first = "";
      String second = "";
      String third = "";
      
      if (a.compareTo(b) < 0) 
      {
         // a < b
         if (a.compareTo(c) < 0) 
         {
            // a < c
            first = a;
            if (b.compareTo(c) < 0)
            {
               // b < c
               second = b;
               third = c;
            } 
            else 
            {
               second = c;
               third = b;
            }
         } 
         else 
         {
            // c < a < b
            first = c;
            second = a;
            third = b;
         }
      } 
      else 
      {
         // b < a
         if (b.compareTo(c) < 0) 
         {
            // b < c
            first = b;
            if (a.compareTo(c) < 0) 
            {
               // a < c
               second = a;
               third = c;
            } 
            else 
            {
               // c < a
               second = c;
               third = a;
            }
         } 
         else 
         {
            // c < b < a
            first = c;
            second = b;
            third = a;
         }
      }
      System.out.printf("%s\n%s\n%s\n", first, second, third);
   }
}
