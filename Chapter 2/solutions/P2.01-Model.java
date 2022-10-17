public class Main
{
   public static void main(String[] args) 
   {

      // Define a constant for the conversion to metric
      final double INCHES_TO_MILLIMETERS = 25.4;

      // Define constants for paper size in inches
      final double PAPER_WIDTH_IN = 8.5;
      final double PAPER_LENGTH_IN = 11.0;

      // Define variables for millimeters and convert
      double paperWidthmm = PAPER_WIDTH_IN * INCHES_TO_MILLIMETERS;
      double paperLengthmm = PAPER_LENGTH_IN * INCHES_TO_MILLIMETERS;

      // Display (print to screen) the dimensions in mm
      System.out.println("The metric dimensions of a letter-sized sheet of paper are 
            " + paperWidthmm+ " mm by " + paperLengthmm + " mm.");
   }
}
