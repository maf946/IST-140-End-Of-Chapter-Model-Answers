/**
      Tests if a string is a palindrome.
      @param str the string to test
      @return true if str is a palindrome, false otherwise
   */
   public static boolean isPalindrome(String str)
   {
      if (str.length() <= 1)
      {
         return true;
      }
      else if (str.charAt(0) == str.charAt(str.length() - 1))
      {
         return isPalindrome(str.substring(1, str.length() - 1));
      }
      else
      {
         return false;
      }
   }
