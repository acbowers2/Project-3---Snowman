import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class CreateWords{
   
   private CreateWords()
   {
      //private constructor to keep it from creating the objects
   }

   public static String pullWord()
   {
      //create the file and the random number to get the word out of the document
      //create the variables for the chosen word
      File words = new File("words.txt");
      int choice = (int)(Math.random() * 10);
      String chosen = "";
      
      //Open Scanner with try-with-resources and find the word
      try(Scanner in = new Scanner(words))
      {
         for(int i = 0; i < 10; i++){
            String s = in.nextLine();
            char[] empty = new char[s.length()];
            if(i == choice){
               chosen = s;
               i = 10;
            }
            
         }
         
      }catch(FileNotFoundException e){
         System.out.println("Whoopsie! No file there!");
      }
      
      return chosen;
   }//end pullWord
   
   public static char[] makeEmpty(String chosen)
   {
      //takes a word and makes an array of dashes that is the same size of the word
      char[] empty = new char[chosen.length()];
         for(int j = 0; j < chosen.length(); j++){
            empty[j] = '-';
         }
      return empty;
   }//end makeEmpty
}
