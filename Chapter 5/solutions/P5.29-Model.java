import java.util.Scanner;

public class Main
{
   /**
      Calculates the number of reachable people.
      @param degree the degree of separation 
      @param averageFriends average friends per user
      @return number of reachable people 
   */
   public static double reachablePeople(int degree, 
      double averageFriends)
   {
      if (degree > 0)
      {
         return 1 + averageFriends * reachablePeople(degree - 1, averageFriends);
      }
      else 
      {
         return 1;
      }
   }

   public static void main(String[] args)
   {
      Scanner in = new Scanner(System.in);
      System.out.print("Degree of separation: ");
      int degree = in.nextInt();
      System.out.print("Average number of friends: ");
      double avg = in.nextDouble();      
      System.out.println("Reachable people: " + reachablePeople(degree, avg));
   }
}
