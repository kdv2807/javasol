package game;

import java.util.Scanner;

public class Hangman 
{
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

    // Methods definition
    public void playGame() 
    {
	System.out.println("playGame method is invoked");
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



