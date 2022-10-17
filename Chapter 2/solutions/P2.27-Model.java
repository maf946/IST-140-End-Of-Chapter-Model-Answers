import java.util.Scanner;

public class Main
{
   public static void main(String[] args)
   {
      Scanner in = new Scanner(System.in);

      // input from user
      System.out.print("Enter the number of movie rentals: ");
      double movie = in.nextDouble();
     
      System.out.print("Enter the number of members referred to the video club: ");
      double ref = in.nextDouble();

      double discount = Math.min((movie + ref), 75); // To be sure it is not more than 75

      // Formatted output
      System.out.printf("The discount is equal to: %.2f percent.\n", (discount));
   }
}
