public class SnowMan extends CreateWords
{
   private int attempts; 
   private char[] empty;
   private String word;
   
   public SnowMan()
   {
      this.word = super.pullWord();
      this.empty = CreateWords.makeEmpty(this.word);
      this.attempts = 9;
      System.out.print(word);
      
   }
   
   public void playGame()
   {
      //calls on finds out if it is in the string
      //if in string it will be sent to correctArray()
      //if not in the array it will be sent to wrongGuess()
      char guessed = Player.getGuess();
      if(this.word.contains(guessed + ""))
         this.correctArray(guessed);
      else
         this.wrongGuess();
   }
   
   public void correctArray(char letter)
   {
      //this method runs the for-loop to replace the '-' in the empty[] with the letter at the correct spot
      //doesn't return anything
   }
   
   public void wrongGuess()
   {
      //counts down the attempts
      attempts--;
   }
   
   public boolean didWin()
   {
      //this will see if the empty[] still holds any '-' and print out the correct statements
      boolean didWin = true;
      for(int i = 0; i < empty.length; i++)
      {
         if(empty[i] == '-')
            didWin = false;
      }
      
      if(didWin == true){
         System.out.println("You have won the game!");
         System.out.println("The word was: " + word);
         System.out.print("Congratulations! Please play again!");
      }
         
      return didWin;
   }
   
   public boolean didLose()
   {
      //if attempts == 0, this will return true, otherwise false and print out the correct statements
      boolean didLose = attempts == 0;
      
      if(didLose == true){
         System.out.println("Oh no... you lost...");
         System.out.println("The word was: " + this.word);
         System.out.print("Please play again!");
      }
      return didLose;
   }
   
}//end SnowMan
