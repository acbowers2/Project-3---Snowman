import java.util.Scanner;

public class Player
{
   private String alreadyGuessed;
   
   public Player()
   {
      this.alreadyGuessed = "";
   }
   
   public void playGame()
   {
      //where the while loop for the game steps will live, while loop runs while gameOn is true
      //it will call on guessChar for input from the player
      //it will compare it to the existing string alreadyGuessed
      //will check for if it is a letter and not an empty space or anything NOT a letter
      //if not in the string but it is a letter, it will pass it onto playGame in SnowMan
      //either way it will get put into alreadyGuessed
      //in an if/else if/else blick it will request the status of the  boolean for if it won, then request the boolean for if it lost, 
      //and if both return false it will run again
      //Snowman will print out the correct statements, and if either is true it will switch gameOn boolean to false to end the loop
   }
   
   public char guessChar()
   {
      
      //the while loop in playGame will call get the user inputting char
      //will put it into lowercase
      // guessChar will return charGuessed

   }
}//end Player
