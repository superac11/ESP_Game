import java.util.InputMismatchException;
import java.util.Scanner;
/**
 * Code: Sagar Acharya
 * Date: Oct-25-2018
 * 
 */
/*
 * Write a program that tests your ESP (extrasensory perception). 
 * The program should randomly select the name of a color from the following list of words: 
 * Red, Green, Blue, Orange, Yellow To select a word, the program can generate a random number. 
 * For example, if the number is 0, the selected word is Red; if the number is 1, the selected word is Green;
 * and so forth. Next, the program should ask the user to enter the color that the computer has selected.
 * After the user has entered his or her guess, the program should display the name of the randomly selected color. 
 * The program should repeat this 10 times and then display the number of times the user correctly guessed the selected color. 
 * Be sure to modularize the program into methods that perform each major task.
 */

public interface ESPGame_Class {
	static Scanner Key_Input=new Scanner(System.in );
	
	/*
	 * The main method call the method User_Pick and Computer_Pick method and calculate the score using the loop and print it. 
	 */
	public static void main(String Args[])
	{
		try {
		System.out.print("\nGame Started");
		int score=0;
		for(int iterator=0; iterator<10;iterator++)
		{
			int UPick=User_Pick();
			System.out.print("\nYou ");
			print_ColorName(UPick);
			int CPick=Computer_pick();
			System.out.print("\nComputer ");
			print_ColorName(CPick);
			if(UPick==CPick)
			{
				score++;
			}
			
		}
		System.out.print("\n\n\t\t\t\tYour score is:" +score);
		
		
		}
		catch(InputMismatchException e)
		{
			System.out.print("Only number from 1  to 5 input is supported\n-----------------------------------------------------------------------\n\t\t\t\t Restarting Program\n-----------------------------------------------------------------------");
			Key_Input.nextLine();
			main(Args);
		}
	}
		
/*
 * This method will  ask the user for the user choice and return it. 
 */

public static int User_Pick()
{
	
	int user_guess=-1;
	int statCheck=0;
	while(!(statCheck==1))				
		{
		System.out.print("\n\t\t\tPick the color corresponding to number \n\t\t\t1)Red\n\t\t\t2)Green\n\t\t\t3)Blue\n\t\t\t4)Orange\n\t\t\t5)Yellow\n");
		System.out.print("\nEnter your choice:\nThe range is from 1 to 5: ");
		user_guess=Key_Input.nextInt();	
			
		if(user_guess>0 && user_guess<6) statCheck=1;
		
		else System.out.print("\t\t\tInput not in range, Input again\n");
			
		}
	
	return user_guess;

	
}
/*
 * This method takes user and computer pick number and print the associated color it represent.
 */
public static void print_ColorName(int userpick)
{
	if(userpick==1)
	{
		System.out.print("pick Red");
	}
	else if(userpick==2)
	{
		System.out.print("pick Green");
	}
	else if(userpick==3)
	{
		System.out.print("pick Blue");
	}
	else if(userpick==4)
	{
		System.out.print("pick Orange");
	}
	else if(userpick==5)
	{
		System.out.print("pick Yellow");
	}
}

/*
 * This method will pick random number from 1 to 5 and return it.
 * 
 */
public static int Computer_pick()
{
	int randomNumber= (int)(Math.random()*5+1);
	return randomNumber;
}


}


