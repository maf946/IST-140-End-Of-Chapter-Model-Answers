import java.util.Scanner;

public class Main
{
   /**
      Calculates volume of a sphere.
      @param r radius of sphere
      @return volume of sphere given radius r
   */
   public static double sphereVolume(double r)
   {
      return 4.0 / 3.0 * Math.PI * Math.pow(r, 3);
   }

   /**
      Calculates surface area of a sphere.
      @param r radius of sphere
      @return surface area of sphere given radius r
   */
   public static double sphereSurface(double r)
   {
      return 4.0 * Math.PI * Math.pow(r, 2);
   }

   /**
      Calculates volume of a cylinder.
      @param r radius of cylinder
      @param h height of cylinder
      @return volume of cylinder given radius r and height h
   */
   public static double cylinderVolume(double r, double h)
   {
      return Math.PI * Math.pow(r, 2) * h;
   }

   /**
      Calculates surface area of a cylinder.
      @param r radius of cylinder
      @param h height of cylinder
      @return surface area of cylinder given radius r and height h
   */
   public static double cylinderSurface(double r, double h)
   {
      return 2 * Math.PI * r * (r + h);
   }

   
   /**
      Calculates volume of a cone.
      @param r radius of base of cone
      @param h height cone
      @return volume of cone radius r and height h
   */
   public static double coneVolume(double r, double h)
   {
      return 1.0 / 3.0 * Math.PI * Math.pow(r, 2) * h;
   }

   /**
      Calculates surface area of a cone.
      @param r radius of base of cone
      @param h height cone
      @return surface area of cone radius r and height h
   */
   public static double coneSurface(double r, double h)
   {
      return Math.PI * r * (r + Math.sqrt(Math.pow(r, 2) + Math.pow(h, 2)));
   }

   public static void main(String[] args)
   {
      Scanner in = new Scanner(System.in);
      System.out.println("Enter radius r: ");
      double r = in.nextDouble();
      System.out.println("Enter height h: ");
      double h = in.nextDouble();
      
      System.out.println("Volume of sphere: " + sphereVolume(r));
      System.out.println("Surface area of sphere: " + sphereSurface(r));
      System.out.println("Volume of cylinder: " + cylinderVolume(r, h));
      System.out.println("Surface area of cylinder: " + cylinderSurface(r, h));
      System.out.println("Volume of cone: " + coneVolume(r, h));
      System.out.println("Surface area of cone: " + coneSurface(r, h));
   }
}
