public class SnowMan extends CreateWords implements Playable
{
   private int attempts; 
   private char[] empty;
   private String word;
   private char guessedLetter;
   private boolean gameOn = true;
   
   public SnowMan()
   {
      this.word = super.pullWord();
      this.empty = CreateWords.makeEmpty(this.word);
      this.attempts = 9;
      System.out.println("You have 9 attempts to guess the word or the SnowMan will be complete!");
   }
   
   public void playGame()
   {
      if(this.word.contains(this.guessedLetter + ""))
         this.correctArray();
      else
         this.wrongGuess();
         
      didWin();
      didLose();
   }
   
   public void correctArray()
   {
      System.out.println("The guessed letter was in the word!");
      for(int i = 0; i < empty.length; i++)
      {
         if(this.word.charAt(i) == guessedLetter)
            empty[i] = guessedLetter;
      }
   }
   
   public void wrongGuess()
   {
      //counts down the attempts
      this.attempts--;
      System.out.println("Oh No! That was a bad guess. You now have " + attempts + " attempts remaining.");
   }
   
   public boolean didWin()
   {
      //this will see if the empty[] still holds any '-' and print out the correct statements
      boolean didWin = true;
      for(int i = 0; i < this.empty.length; i++)
      {
         if(empty[i] == '-')
            didWin = false;
      }
      
      if(didWin == true){
         System.out.println("You have won the game!");
         System.out.println("The word was: " + word);
         System.out.println("Congratulations! Please play again!");
         this.gameOn = false;
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
         System.out.println("Please play again!");
         System.out.println("      _\n    _| |_\n    ('>')\n >-(     )-< \n  (_______)");
         this.gameOn = false;
      }
      return didLose;
   }
   
   public boolean getGameOn()
   {
      return this.gameOn;
   }
   
   public void setGuessedLetter(char c)
   {
      this.guessedLetter = c;
   }
   
   public void printArray()
   {
      System.out.println("Your current word looks like: ");
      for(int i = 0; i < empty.length; i++){
         System.out.print(empty[i]);
      }
      System.out.println();
   }
   
}//end SnowMan
