package game;

import java.util.Scanner;

public class Hangman
{
    //Instance variable
    String word = "australia";

    public void showMenu()
    {
        int option;
        Scanner sc = new Scanner(System.in);
        
        System.out.println("---------Menu---------");
        System.out.println("1. Play");
        System.out.println("2. Instructions");
        System.out.println("3. Exit");
        System.out.print("\nChoose the option: ");
       
        option = sc.nextInt();
        
	// Switch Case

        switch(option)
        {
            case 1: playGame();
                    break;
            case 2: instructGame();
                    break;
            case 3: exitGame();
                    break;
            default: System.out.println("Incorrect menu option");
                     showMenu();
                    break;
       }
    }
    
    // Method definition

    public void playGame() 
    {
	//playGame functionality
	int i, flag =0;
        String input, guess;
        Scanner sc = new Scanner(System.in);
        do
        {  
            System.out.print("\nEnter Your Guess: ");
            input = sc.nextLine();
                              
            for(i=0;i<word.length();i++)
            {
                if(word.charAt(i) == input.charAt(0))
                {
                    flag=1;
                }                 
            }
            if(flag==1)
            {
                System.out.println("This letter is present in the word");
            }
            else
            {
                System.out.println("This letter is not present in the word");
            }
            
            System.out.println("Do want to guess again(y/n):");
            guess=sc.nextLine();
			flag=0;
            
        }while(guess.equals("y")||guess.equals("Y"));

    }

    public void instructGame() 
    {
        System.out.println("instructGame method is invoked");
    }

    public void exitGame() 
    {
        System.out.println("exitGame method is invoked");
        System.exit(0);
    }    

    public static void main(String[] args) 
    {
        Hangman hg = new Hangman();
	hg.showMenu();
    }	
}
