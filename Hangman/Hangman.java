import java.util.Scanner;
import java.util.Random;
import java.util.*;

public class Hangman
{
public static void main(String[] args) 
{
    //clears screen and puts header
    
    System.out.print("\f"); 
    
    //list of words 
    String words = "abomination:programmer:idiosyncrasies:random:pineapple:kittens:cookie:mailbox";
    String replacewords = "_ _ _ _ _ _ _ _ _ _ _ :_ _ _ _ _ _ _ _ _ _ :_ _ _ _ _ _ _ _ _ _ _ _ _ _ :_ _ _ _ _ _ :_ _ _ _ _ _ _ _ _ :_ _ _ _ _ _ _ :_ _ _ _ _ _ _ :_ _ _ _ _ _ _ :_ _ _ _ _ ";
    String checkwords = "           :          :              :      :         :       :       :       :     ";
    String[] wordsAsArray_one = words.split(":");
    String[] wordsAsArray_two = replacewords.split(":");
    String[] wordsAsArray_three = checkwords.split(":");

    //Chooses a random word.
    int index = new Random().nextInt(wordsAsArray_one.length);   
    String random_word = wordsAsArray_one[index];
    String word_show = random_word;
    String random_word_replace = wordsAsArray_two[index];
    String random_word_check = wordsAsArray_three[index];
    
    StringBuilder random_word_replacee = new StringBuilder(random_word_replace);
    StringBuilder random_worde = new StringBuilder(random_word);

    //Variables for the number of tries and wrongs.
    int tries = 0;
    int wrongs = 0;
    //An array for wrong letters. This array will be printed out.
    List<String> wrongLetters = new ArrayList<String>();

    while (wrongs!=9)
    {
        //Checks if the user won(when the word is fully guessed)
        if(random_word.equals(random_word_check))
        {
            System.out.println("YOU WIN!!!!");
            System.out.println("CORRECT WORD:");
            System.out.println(word_show);  
            System.out.println("");
            System.out.println("Thank you for playing:");

            System.out.println("#     #    #    #     #  #####  #     #    #    #     # ");
            System.out.println("#     #   # #   ##    # #     # ##   ##   # #   ##    # ");
            System.out.println("#     #  #   #  # #   # #       # # # #  #   #  # #   # ");
            System.out.println("####### #     # #  #  # #  #### #  #  # #     # #  #  # ");
            System.out.println("#     # ####### #   # # #     # #     # ####### #   # # ");
            System.out.println("#     # #     # #    ## #     # #     # #     # #    ## ");
            System.out.println("#     # #     # #     #  #####  #     # #     # #     # ");
            break;
        }
        //Prints this header every time the user enters a guess.
        Scanner word = new Scanner(System.in);

            System.out.println("WELCOME TO:");
            System.out.println("#     #    #    #     #  #####  #     #    #    #     # ");
            System.out.println("#     #   # #   ##    # #     # ##   ##   # #   ##    # ");
            System.out.println("#     #  #   #  # #   # #       # # # #  #   #  # #   # ");
            System.out.println("####### #     # #  #  # #  #### #  #  # #     # #  #  # ");
            System.out.println("#     # ####### #   # # #     # #     # ####### #   # # ");
            System.out.println("#     # #     # #    ## #     # #     # #     # #    ## ");
            System.out.println("#     # #     # #     #  #####  #     # #     # #     # ");  

            
 
                System.out.println("YOUR WORD:");
                System.out.println(random_word_replacee);

                System.out.println("");
        System.out.println("Guess letter?");
        char letter = word.next().charAt(0);
    System.out.print("\f"); 
        int indexe = random_word.indexOf(letter);

        //If the guessed letter does not exist in the random word:
        if (indexe<0)
        {
            wrongs = wrongs+1;
            System.out.println("WRONG LETTERS:");
            String letterone = (letter+" ");
            wrongLetters.add(letterone);
            System.out.println(wrongLetters);
        }
        else //If the guessed letter does exist in the random word:
        {
            System.out.println("WRONG LETTERS:");
            System.out.println(wrongLetters);
  
        }
        //The below statements print out an image depending on the number of wrong guesses.
            if  (wrongs ==1)
            { 
                System.out.println("      _______");
                System.out.println("")  ;  
                System.out.println("")  ;
                System.out.println("") ;
                System.out.println("")   ;
                System.out.println("")  ;
                System.out.println("") ;     
           
            }
            else if(wrongs==2)
            {
                System.out.println("      _______");
                System.out.println("     |/  ")  ;  
                System.out.println("     |    ")  ;
                System.out.println("     |     ") ;
                System.out.println("     |    ")   ;
                System.out.println("     |    ")  ;
                System.out.println("    _|___    ") ;     
            }
            else if(wrongs==3)
            {
                System.out.println("      _______");
                System.out.println("     |/      |");
                System.out.println("     |      ");
                System.out.println("     |      ");
                System.out.println("     |      ");
                System.out.println("     |    ");
                System.out.println("    _|___    ");            
            }
            else if(wrongs==4)
            {
                System.out.println("      _______");
                System.out.println("     |/      |");
                System.out.println("     |      (_)");
                System.out.println("     |     ");
                System.out.println("     |       ");
                System.out.println("     |      ");
                System.out.println("    _|___       ");         
            }
            else if(wrongs==5)
            {
                System.out.println("      _______");
                System.out.println("     |/      |");
                System.out.println("     |      (_)");
                System.out.println("     |       |");
                System.out.println("     |       |");
                System.out.println("     |      ");
                System.out.println("    _|___       ");         
            }
            else if(wrongs==6)
            {
                System.out.println("      _______");
                System.out.println("     |/      |");
                System.out.println("     |      (_)");
                System.out.println("     |      /|");
                System.out.println("     |       |");
                System.out.println("     |      ");
                System.out.println("    _|___      ");          
            }
            else if(wrongs==7)
            {
                System.out.println("      _______");
                System.out.println("     |/      |");
                System.out.println("     |      (_)");
                System.out.println("     |      /|\\");
                System.out.println("     |       |");
                System.out.println("     |      ");
                System.out.println("    _|___     ");           
            }
            else if(wrongs==8)
            {
                System.out.println("      _______");
                System.out.println("     |/      |");
                System.out.println("     |      (_)");
                System.out.println("     |      /|\\");
                System.out.println("     |       |");
                System.out.println("     |      / ");
                System.out.println("    _|___       ");         
            }
            else if(wrongs==9)
            {
                System.out.println("      _______");
                System.out.println("     |/      |");
                System.out.println("     |      (_)");
                System.out.println("     |      /|\\");
                System.out.println("     |       |");
                System.out.println("     |      / \\");
                System.out.println("    _|___    "); 
                System.out.println("");
                System.out.println("GAME OVER");       
                System.out.println("");
  
                System.out.println("CORRECT WORD:");
                System.out.println(word_show);    
            }
        
            //This loop replaces all the blanks where the guessed word exists.
        while(indexe>=0)
        {
            random_word_replacee.setCharAt((indexe*2), letter);
            random_worde.setCharAt(indexe,' ');
            random_word = random_worde.toString();
            indexe = random_word.indexOf(letter);
            
        }
    }
    
    
}
}



