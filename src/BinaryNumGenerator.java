import java.util.Random;

import javax.swing.JOptionPane;

public class BinaryNumGenerator {

	public static void main(String[] args) {
		// Set up automatic generation for a list
		String input = null;
		final int LIST_LENGTH = 8;	//This is a number that the programmer would be able to edit if they wanted to change the program to fit a clients request
		int[] binary = new int[LIST_LENGTH]; // Initial list of binary with length of LIST_LENGTH
		Random gen = new Random();
		int i;
		int guess = -1; //Set to -1 to prevent the possibility of it starting with guess == total
		String binary_toString=""; //Used for displaying the list of numbers that are generated as a string for showInputDialog
		
		int total = 0; //Start total at 0 so that it will add the numbers generated randomly properly
		int exit;
		
		String[] helpChoices = {"Solving","Power to whaa..?","Go back!"};
		String help;
		
		
		for(i=0; i < binary.length; i++)
		{
			binary[i] = gen.nextInt(2); // Generates i amount of numbers numbers between 0-1			
		}
	
		for(i=0; i < binary.length; i++)	//This for loop will total up all of the elements of the list that
		{									//are ones and adds them to
			if(binary[i]==1)				//the variable 'total'
			{								
				total+=Math.pow(2,7-i);
			}
		
		}
		
		for(i=0; i < binary.length; i++) //This for loop will convert all of the numbers
		{								 //of binary[i] to a string for use with showInputDialog...
			binary_toString += binary[i];
		}
		//Finish Input and comparison
		input = JOptionPane.showInputDialog("Guess what number this is (Enter ''exit'' to quit or ''help for some help!''): "+binary_toString);
		
		
		//----------------------------------------------------------------------------
		//This is the section of where the code will start to ask for user input
		
		if(input==null) 					//This section of code will evaluate their first entry, to see if they enter a number or hit cancel, if cancel, ask if they want to quit
		{
			exit = JOptionPane.showConfirmDialog(null, "Are you sure you want to quit?","Exit?",JOptionPane.YES_NO_OPTION); // Similar section of code to the one below, but this one looks 
			if(exit==0)																										//specifically no number entered (i.e they hit cancel)
				System.exit(0);
			else
				input = JOptionPane.showInputDialog("Guess what number this is (Enter ''exit'' to quit or ''help'' for some help!): "+binary_toString);
				if(input==null)
				{
					JOptionPane.showMessageDialog(null,"You seem to be confused, I'll just end the program and you can relaunch it if there was a mistake");
					System.exit(0);
				}
		}
		else
			input = input.toLowerCase(); //Convert the input to lowercase (mostly to check if they entered EXIT in any form (upper-case,lower-case,etc.)
		
		
		if(input.equals("exit"))
		{
			exit = JOptionPane.showConfirmDialog(null, "Are you sure you want to quit?","Exit?",JOptionPane.YES_NO_OPTION);
			if(exit==0)
				System.exit(0);
			else
				input = JOptionPane.showInputDialog("Guess what number this is (Enter ''exit'' to quit or ''help for some help!''): "+binary_toString);
		}
		else if(input.equals("help"))
		{
			help = (String) JOptionPane.showInputDialog(null, "Pick which help topic you'd like to get more\ninformation about","Input", JOptionPane.QUESTION_MESSAGE,null,helpChoices,helpChoices[0]);
			if(help.equals("Solving"))
			{
				JOptionPane.showMessageDialog(null,"Remember that while you're trying to calculate the answer"+"\nthat you need to read the binary from right to left");
			}
			else if(help.equals("Power to whaa..?"))
			{
				JOptionPane.showMessageDialog(null,"Keep in mind that we are using base-2, so you need to do 2^(i) where i is the index."+"\nFor example: If we have a number of 01100001, we can"+"\ndo 2^0 (because at the end of the byte is a 1 so we"+"\nhave to add 2^1 to the total, etc.");
			}
			else if(help.equals("Go back!"))
			{
				input = JOptionPane.showInputDialog("Guess what number this is (Enter ''exit'' to quit): "+binary_toString);
			}
		}
		else
		try
		{
			guess = Integer.parseInt(input);
		}
		catch(NumberFormatException error)
		{
			exit = JOptionPane.showConfirmDialog(null, "Would you like to exit the program?","Exit?",JOptionPane.YES_NO_OPTION);
			if(exit==0)
				System.exit(0);
			else
				input = JOptionPane.showInputDialog("Guess what number this is (Enter ''exit'' to quit): "+binary_toString);
		}
		
		
		while(guess!=total) //If the guess was not total, continues on with the if statements to see if one of the below are true
		{
			if(guess<total)
			{
				input = JOptionPane.showInputDialog("Sorry! Your guess was too low, try again! Number is: "+binary_toString);
				try
				{
					guess = Integer.parseInt(input);
				}
				catch(NumberFormatException error)
				{
					JOptionPane.showMessageDialog(null,"You must enter an integer");
				}
			}
			else if(guess>total)
			{
				input = JOptionPane.showInputDialog("Sorry! Your guess was too high, try again! Number is: "+binary_toString);
				try
				{
					guess = Integer.parseInt(input);
				}
				catch(NumberFormatException error)
				{
					JOptionPane.showMessageDialog(null,"You must enter an integer");
				}
			}
			
		}
		
		if(guess==total) //Jumps to here from the while loop above if the guess WAS equal to total
		{
			JOptionPane.showMessageDialog(null,"You win!");
		}
	}

}
