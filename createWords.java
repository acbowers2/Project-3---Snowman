public class createWords{
    public static void main(String[] args) {
      //create the file and the random number to get the word out of the document
      //create the variables for the chosen word and the empty string
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
               
               for(int j = 0; j < chosen.length(); j++){
                  empty[j] = '-';
               }
               i = 10;
               snowMan(chosen, empty);
            }
            
         }
         
      }catch(FileNotFoundException e){
         System.out.println("Whoopsie! No file there!");
      }
   }
}
