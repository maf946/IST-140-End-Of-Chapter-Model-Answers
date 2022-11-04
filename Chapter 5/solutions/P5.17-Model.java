   /**
      Searches a string to see if another string is contained in it.
      @param str string to search
      @param match pattern to search for
      @return true if match is in str, otherwise false
   */
   public static boolean find(String str, String match)
   {
      if (str.length() < match.length())
      {
         return false;
      }
      if (str.charAt(0) == match.charAt(0))
      {
         boolean equal = true;
         for (int i = 1; i < match.length(); i++)
         {
            if (str.charAt(i) != match.charAt(i))
            {
               equal = false;
            }
         }
         if (equal)
         {
            return true;
         }
      }
      return find(str.substring(1), match);
   }
