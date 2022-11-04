   /**
      Determines if input is a leap year.
      @param year current year
      @return true if year is a leap year
   */
   public static boolean isLeapYear(int year)
   {
      if (year % 400 == 0)
      {
         return true;
      }
      if (year % 4 == 0 && year % 100 != 0)
      {
         return true;
      }
      return false;
   }
