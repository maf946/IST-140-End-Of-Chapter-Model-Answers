/**
      Calculates the balance of an account after a certain number of years.
      @param initialBalance initial balance of account
      @param interestRate yearly interest rate expressed in floating point 
      notation
      @param nYears number of years the account has been accumulating interest
      @return balance of account after nYears 
   */
   public static double computeBankBalance(double initialBalance,
      double interestRate, int nYears)
   {
      return initialBalance * Math.pow((1 + interestRate), nYears);
   }
