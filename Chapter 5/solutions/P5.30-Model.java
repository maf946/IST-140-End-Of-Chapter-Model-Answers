import java.util.Scanner;

public class Main
{
   public static boolean validate(String password)
   {
      if (password.length() < 8)
      {
         return false;
      }
      boolean foundUpper = false;
      boolean foundLower = false;
      boolean foundDigit = false;
   
      for (int i = 0; i < password.length(); i++)
      {
         char ch = password.charAt(i);
         if (isLowerCase(ch)) 
         { 
            foundLower = true; 
         }
         if (isUpperCase(ch)) 
         { 
            foundUpper = true; 
         }
         if (isDigit(ch)) 
         { 
            foundDigit = true; 
         }
      }
      return foundUpper && foundLower && foundDigit;
   }

   public static boolean isDigit(char ch)
   {
      return '0' <= ch && ch <= '9';
   }
   
   public static boolean isLowerCase(char ch)
   {
      return 'a' <= ch && ch <= 'z';
   }
   
   public static boolean isUpperCase(char ch)
   {
      return 'A' <= ch && ch <= 'Z';
   }

   public static void main(String[] args)
   {
      Scanner in = new Scanner(System.in);
      boolean correct = false;
      
      while (!correct)
      {
         System.out.println("\nEnter a password: ");
         String str1 = in.next();
         System.out.println("Confirm password: ");
         String str2 = in.next();
         if (str1.equals(str2))
         {
            if (validate(str1))
            {
               System.out.println("The password is valid");
               correct = true;
            }
            else
            {
               System.out.println("The password is not valid.");
            }
         }
         else
         {
            System.out.println("The passwords do not match.");
         }
      }
   }
}
