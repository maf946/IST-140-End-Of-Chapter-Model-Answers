   /**
      Turns a number into its English name.
      @param number a positive integer < 1,000,000,000
      @return the name of the number (e.g. "two hundred seventy four")
   */
   public static String intName(int number)
   {
      int part = number; // The part that still needs to be converted 
      String name = ""; // The return value

      if (part >= 1000000)
      {
         // this is a recursive call
         name = name + intName(part / 1000000) + " million ";
         part = part % 1000000;
      }
      
      if (part >= 1000)
      {
         //this is a recursive call
         name = name + intName(part / 1000) + " thousand ";
         part = part % 1000;
      }
      
      if (part >= 100)
      {
         name = name + digitName(part / 100) + " hundred";
         part = part % 100;
      }

      if (part >= 20)
      {
         name = name + " " + tensName(part);
         part = part % 10;
      }
      else if (part >= 10)
      {
         name = name + " " + teenName(part);
         part = 0;
      }

      if (part > 0)
      {
         name = name + " " + digitName(part);
      }

      return name;
   }
