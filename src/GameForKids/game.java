package GameForKids;

import java.util.Random;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class game {

	public static void main(String[] args) {
		// variable initialization
		final String[] choices = {"Addition", "Subtraction", "Multiplication"}; // what are the choices that they can do?
		final int NUMBER_OF_QUESTIONS = 5;
		String userChoice=null;
		int score=0;
		int total=0;
		int a=0,
			b=0,
			guess=0,
			questionsAsked=0;
		ImageIcon picture = new ImageIcon("tum.jpg");
		final String choiceLabel = "Pick a math type to solve!"; // used in line 15 to display the focus of the box
		
		Random gen = new Random();
		
			userChoice = (String) JOptionPane.showInputDialog(null, choiceLabel,"Input", JOptionPane.QUESTION_MESSAGE,null,choices,choices[0]);
			
			while(userChoice==null)
			{
				userChoice = JOptionPane.showInputDialog(null, "Are you sure you want to quit?",choiceLabel, JOptionPane.YES_NO_OPTION);
				userChoice.toLowerCase();
				if(userChoice.equals("yes"))
				{
					System.exit(0);
				}
				else if(userChoice.equals("no"))
				{
					userChoice = (String) JOptionPane.showInputDialog(null, choiceLabel,"Input", JOptionPane.QUESTION_MESSAGE,null,choices,choices[0]);
				}
				else
				{
					System.exit(0);
				}
			}
		// selection statements for whichever subject they want
		if(userChoice.equals(choices[0])) // if statement for choosing addition
		{
			for(questionsAsked=0;questionsAsked<NUMBER_OF_QUESTIONS;questionsAsked++)
			{
				a = gen.nextInt(100)+1;
				b = Math.abs(gen.nextInt(100)+1);
				
				userChoice = JOptionPane.showInputDialog("What is "+a+"+"+b);
				try
				{
					guess = Integer.parseInt(userChoice);
				}
				catch(NumberFormatException e)
				{
					JOptionPane.showMessageDialog(null,"Sorry! You entered the wrong number");
				}
				total = a+b;
				if(guess==total)
				{
					JOptionPane.showMessageDialog(null,"Congratulations! You got the answer! It was "+total);
					score+=1;
				}
				else if(guess!=total)
				{
					JOptionPane.showMessageDialog(null,"Sorry! You didn't get the right answer!");
				}
			}
			
		}
		
		else if(userChoice.equals(choices[1])) // if statement for choosing subtraction
		{
			for(questionsAsked=0;questionsAsked<NUMBER_OF_QUESTIONS;questionsAsked++)
			{
				a = Math.abs(gen.nextInt(100)+1);
				b = Math.abs(gen.nextInt(100)+1);
				
				userChoice = JOptionPane.showInputDialog("What is "+a+"-"+b);
				try
				{
					guess = Integer.parseInt(userChoice);
				}
				catch(NumberFormatException e)
				{
					JOptionPane.showMessageDialog(null,"Sorry! You entered the wrong number");
				}
				total = a-b;
				if(guess==total)
				{
					JOptionPane.showMessageDialog(null,"Congratulations! You got the answer! It was "+total);
					score+=1;
				}
				else if(guess!=total)
				{
					JOptionPane.showMessageDialog(null,"Sorry! You didn't get the right answer!");
				}
			}
			
		}
		
		else if(userChoice.equals(choices[2]))
		{
			for(questionsAsked=0;questionsAsked<NUMBER_OF_QUESTIONS;questionsAsked++)
			{
				a = Math.abs(gen.nextInt(10)+1);
				b = Math.abs(gen.nextInt(10)+1);
				
				userChoice = JOptionPane.showInputDialog("What is "+a+"x"+b);
				try
				{
					guess = Integer.parseInt(userChoice);
				}
				catch(NumberFormatException e)
				{
					JOptionPane.showMessageDialog(null,"Sorry! You entered the wrong number");
				}
				total = a*b;
				if(guess==total)
				{
					JOptionPane.showMessageDialog(null,"Congratulations! You got the answer! It was "+total);
					score+=1;
				}
				else if(guess!=total)
				{
					JOptionPane.showMessageDialog(null,"Sorry! You didn't get the right answer!");
				}
			}
		}
		
		JOptionPane.showMessageDialog(null,"Your score is: "+score+"/"+NUMBER_OF_QUESTIONS,"Your total", JOptionPane.PLAIN_MESSAGE, picture);
	}	
}

