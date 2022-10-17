import java.util.Scanner;

public class Main
{
   public static void main(String[] args)
   {
      Scanner in = new Scanner(System.in);

      // input of balance and rate
      System.out.print("Initial balance :  ");
      double initAmt = in.nextDouble();
      System.out.print("Annual interest rate in percent: ");
      double rate = in.nextDouble();

      // formatted output
      initAmt = initAmt + initAmt * (rate /(100.0*12));     
      System.out.printf("After first month: %.2f\n ",  initAmt);
	
      initAmt = initAmt + initAmt * (rate /(100.0*12));     
      System.out.printf("After second month: %.2f\n" ,  initAmt);

      initAmt = initAmt + initAmt * (rate /(100.0*12));     
      System.out.printf("After third month: %.2f\n" ,  initAmt);
   }
}
