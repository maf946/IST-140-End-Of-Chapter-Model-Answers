   /**
      Reads a floating-point value from input and returns its value
      @param prompt the prompt string
      @return the floating point number the user enters after the prompt
   */
   public static double readDouble(String prompt)
   {
      System.out.println(prompt + " ");
      Scanner in = new Scanner(System.in);
      return in.nextDouble();
   }
