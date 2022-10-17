import java.util.Scanner;

public class Main
{
   public static void main(String[] args)
   {
      Scanner in = new Scanner(System.in);

      final double P = 260.;
      final double R = 10;
      final double Vt = 120.; 
   
      System.out.print("Enter the power factor, pf: ");
      double pf = in.nextDouble();
 
      double term1 = Vt + 2 * R * P / Vt;
      double term2 = (2 * R * P) / (Vt * pf);
      double Vs = Math.sqrt(term1 * term1 + term2 * term2 * (1 - pf * pf));
   
      System.out.print("P = " + P + " W, R = " + R + " Ohms, and Vt = " + Vt + " Vrms");
      System.out.print("Vs = " + Vs + " Vrms");
   }
}
