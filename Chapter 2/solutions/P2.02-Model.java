public class Main
{
   public static void main(String[] args) 
   {
      // Define constants for paper size in inches
      final double PAPER_WIDTH_IN = 8.5;
      final double PAPER_LENGTH_IN = 11.0;

      // Define a variable and calculate perimeter
      double perim = (2 * PAPER_WIDTH_IN) + (2 * PAPER_LENGTH_IN);

      // Define a variable and calculate the diagonal
      double diagonal = Math.sqrt((PAPER_WIDTH_IN * PAPER_WIDTH_IN) 
            + (PAPER_LENGTH_IN * PAPER_LENGTH_IN));

      // Display (print to screen) the perimeter and diagonal
      System.out.println("The perimeter of a letter-sized sheet of paper is "  
            + perim + " inches.");
      System.out.println("Its diagonal is " + diagonal + " inches.");

   }
}
