/**
   Repeats a given input string.
   @param str input string
   @param n how many times to repeat
   @return str repeated n times
*/
public static String repeat(String str, int n)
{
   String result = "";
   for (int i = 0; i < n; i++)
   {
      result = result + str;
   }
   return result;
}
