import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
   Prints the number of characters, words, and lines in a given file.
*/
public class Main
{
   /**
      Counts the characters in a file.
      @param filename the name of the file
      @return the number of characters in a file
    */
   public static int countCharacters(String filename)
      throws FileNotFoundException
   {
      Scanner inFile = new Scanner(new File(filename));
      int characterCount = 0;
      while (inFile.hasNextLine())
      {
         String line = inFile.nextLine();
         characterCount += line.length();
      }
      return characterCount;
   }

   /**
      Counts the words in a file.
      @param filename the name of the file
      @return the number of words in a file
    */
   public static int countWords(String filename) throws FileNotFoundException
   {
      Scanner inFile = new Scanner(new File(filename));
      int wordCount = 0;
      while (inFile.hasNext())
      {
         String word = inFile.next();
         wordCount++;
      }
      return wordCount;
   }

   /**
      Counts the lines in a file.
      @param filename the name of the file
      @return the number of lines in a file
    */
   public static int countLines(String filename) throws FileNotFoundException
   {
      Scanner inFile = new Scanner(new File(filename));
      int lineCount = 0;
      while (inFile.hasNextLine())
      {
         String line = inFile.nextLine();
         lineCount++;
      }
      return lineCount;
   }

   public static void main(String[] args)
   {
      Scanner in = new Scanner(System.in);
      System.out.print("Please enter the file name: ");
      String filename = in.next();
      try
      {
         int characterCount = countCharacters(filename);
         int wordCount = countWords(filename);
         int lineCount = countLines(filename);
         System.out.printf("Characters: %d\nLines: %d\nWords: %d",
            characterCount, lineCount, wordCount); // See Section 7.2.9
      } 
      catch (FileNotFoundException e)
      {
         System.out.println("File not found!");
      }
   }
}
