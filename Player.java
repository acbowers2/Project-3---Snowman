import java.util.Scanner;

public class Player implements Playable
{
   private String alreadyGuessed;
   private char guessedLetter;
   SnowMan snowyDay;
   
   public Player()
   {
      this.snowyDay = new SnowMan();
      this.alreadyGuessed = "";
   }
   
   public void playGame()
   {
      //where the while loop for the game will live, while loop runs while gameOn is true
      while(snowyDay.getGameOn() == true)
      {
         snowyDay.printArray();
         System.out.println("The letters you have guessed are: " + this.alreadyGuessed);
         guessChar();
         snowyDay.playGame();
         this.alreadyGuessed += guessedLetter + " ";
         System.out.println("\n~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n");
      }
   }
   
   public void guessChar()
   {
      //the while loop in playGame will call get the user inputting char
      //will put it into lowercase
      
      Scanner kb = new Scanner(System.in);
      char guess;
      boolean goodLetter = false;
      
      while(goodLetter == false){
         System.out.println("Please guess a letter: ");
         String s = kb.nextLine();
         s = s.toLowerCase();
         
         if(s.matches("[^a-z ]"))
            System.out.println("Sorry! Needs to be a letter!");
         else if(s.matches(""))
            System.out.println("You hit enter too fast.");
         else if(this.alreadyGuessed.contains(s)){
               System.out.println("You already tried that one, please input another.");
         }
         else{
            this.guessedLetter = s.charAt(0);
            snowyDay.setGuessedLetter(this.guessedLetter);
            goodLetter = true;
         }
      }
   }
   
   public char getGuessedLetter()
   {
      return this.guessedLetter;
   }
   
}//end Player
