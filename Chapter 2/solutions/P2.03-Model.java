import java.util.Scanner;

public class Main
{
   public static void main(String[] args) 
   {
      Scanner in = new Scanner(System.in);
      System.out.print("Please enter a number: ");
      double number = in.nextDouble();

      double square = number * number;
      System.out.printf("Square: %f\n", square);

      double cube = number * number * number;
      System.out.printf("Cube: %f\n", cube);

      double fourthPower = Math.pow(number, 4);
      System.out.printf("Fourth Power: %f\n", fourthPower);
   }
}
