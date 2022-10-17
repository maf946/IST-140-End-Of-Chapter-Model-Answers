import java.util.Scanner;

public class Main
{
   public static void main(String[] args)
   {
      Scanner in = new Scanner(System.in);

      final double PI = 3.14159265358979323846;
      final double EPSILON = 8.854E-12;

      System.out.print("First charge [Coulomb]: "); 
      double charge1 = 0;
      charge1 = in.nextDouble();

      System.out.print("Second charge [Coulomb]: "); 
      double charge2 = 0;
      charge2 = in.nextDouble();

      System.out.print ("Distance [meters]: ");
      double distance = 0;
      distance = in.nextDouble();
    
      double force = (charge1 * charge2) / (4 * PI * EPSILON * distance * distance);
    
      System.out.println("Force: " + force);
   }
}
