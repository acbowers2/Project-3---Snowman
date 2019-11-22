public class snowMan{
   private int attempts;
   
   public static void snowMan(String word, char[] empty)
   {
      this.attempts = 9;
      String tried = "";
      Scanner kb = new Scanner(System.in);
      boolean gameOn = true;
      boolean won = false;
      
      while(gameOn == true)
      {
         String winCondition = "";
         System.out.print("Your current array looks like this :");
         for(int i = 0; i < empty.length; i++)
            System.out.print(empty[i]);
         System.out.println();
         System.out.println("Please guess a letter: ");
         String s = kb.nextLine();
         s = s.toLowerCase();
         char guess = s.charAt(0);
         
         if(s.matches("[0-9.]"))
            System.out.println("Sorry! Needs to be a letter!");
         else if(tried.contains(guess + "")){
               System.out.println("You already tried that one, please input another.");
            }

         else{
            if(word.contains(guess + ""))
            {                 
               System.out.println("The guessed letter is in the word!");
               tried += guess + " ";
               for(int i = 0; i < word.length(); i++){
                  char hold = word.charAt(i);
                  if(hold == guess)
                  {
                     empty[i] = guess;
                  } 
               }
            }//end contained guess if
            
            else
            {
               System.out.println("Oh No! That was a bad guess. You now have " + attempts + " attempts remaining.");
               
               this.attempts--;
               tried += guess + " ";
               System.out.println();
               System.out.println("You have tried the followed letters: " + tried);
               if(this.attempts == 0)
                  gameOn = false;
            }//end bad guess
            for(int i = 0; i < empty.length; i++)
            {
               winCondition += empty[i];
            }
            if(!winCondition.contains("-")){
               gameOn = false;
               won = true;
            }
         }//end guess was letter else
         System.out.println();
         System.out.println("~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~\n");

      }//end while
      
      public static int getAttempts(){
        return this.attmepts;
         
      }
        
     if(won == true){
        System.out.println("You have won the game!");
        System.out.println("The word was: " + word);
        System.out.print("Congratulations! Please play again!");
     }
     else
         System.out.println("Oh no... you lost...");
         System.out.println("The word was: " + word);
         System.out.print("Please play again!");
      
      }
      
      public static int getAttempts(){
        return this.attmepts;
         
   }
}
