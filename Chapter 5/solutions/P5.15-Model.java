/**
      Reverses a string.
      @param str input string
      @return reverse of str
   */
   public static String reverse(String str)
   {
      if (str.length() > 1)
      {
         return reverse(str.substring(1)) + str.charAt(0);
      }
      return str;
   }
