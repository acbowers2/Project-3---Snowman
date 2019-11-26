import java.util.Scanner;

public class SnowMan extends CreateWords
{
   private int attempts; 
   private char[] empty;
   
   public SnowMan()
   {
      this.empty = CreateWords.makeEmpty(super.word);
      this.attempts = 9;
      System.out.print(word);
      
   }
   
   public void playGame(char guess)
   {
      //this recieves the guessed char, finds out if it is in the string
      //if in string it will be sent to correctArray()
      //if not in the array it will be sent to wrongGuess()
   }
   
   public void correctArray(char letter)
   {
      //this method runs the for-loop to replace the '-' in the empty[] with the letter at the correct spot
      //doesn't return anything
   }
   
   public void wrongGuess()
   {
      //counts down the attempts
   }
   
   public boolean didWin()
   {
      boolean didWin = false;
      //this will see if the empty[] still holds any '-' and print out the correct statemtns
      return didWin;
   }
   
   public boolean didLose()
   {
      //if attempts == 0, this will return true, otherwise false and print out the correct statements
   }
}//end SnowMan
