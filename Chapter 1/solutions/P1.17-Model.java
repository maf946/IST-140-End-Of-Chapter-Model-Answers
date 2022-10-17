import javax.swing.JOptionPane;

public class Main
{
   public static void main(String[] args)
   {
      String name = JOptionPane.showInputDialog("What is your name?");
      System.out.print("Hello, ");
      System.out.print(name);
      System.out.println("!");

      String halsGreeting = "My name is Hal! What would you like me to do";
      String task = JOptionPane.showInputDialog(halsGreeting);
      System.out.print("I'm sorry, ");
      System.out.print(name);
      System.out.println(". I'm afraid I can't do that.");
   }
}
