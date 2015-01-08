package GameForKids;

import java.text.DecimalFormat;
import java.util.Random;

import javax.swing.JOptionPane;

public class game {

	public static void main(String[] args) {
		// variable initialization
		DecimalFormat decimalForm = new DecimalFormat("0.00"); // sets up the format to use for division
		final String[] choices = {"Addition", "Subtraction", "Multiplication", "Division"}; // what are the choices that they can do?
		final int NUMBER_OF_QUESTIONS = 5;
		String userChoice=null;
		int score=0;
		int total=0;
		int a=0,
			b=0,
			c=0;
		int guess=0;
		int questionsAsked=0;
		final String choiceLabel = "Pick a math type to solve!"; // used in line 15 to display the focus of the box
		Random gen = new Random();
		
			userChoice = (String) JOptionPane.showInputDialog(null, choiceLabel,"Input", JOptionPane.QUESTION_MESSAGE,null,choices,choices[0]);
			System.out.println(userChoice); // testing selection
			
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
			a = gen.nextInt() % 200;
			b = Math.abs(gen.nextInt() % 200);
			c = Math.abs(gen.nextInt() % 200);
			for(questionsAsked=0;questionsAsked<NUMBER_OF_QUESTIONS;questionsAsked++)
			{
				userChoice = JOptionPane.showInputDialog("What is "+a+"+"+b+"+"+c);
				try
				{
					guess = Integer.parseInt(userChoice);
				}
				catch(NumberFormatException e)
				{
					JOptionPane.showMessageDialog(null,"Sorry! You entered the wrong number");
				}
				total = a+b+c;
				if(guess==total)
				{
					JOptionPane.showMessageDialog(null,"Congratulations! You got the answer! It was "+total);
					score+=1;
					questionsAsked+=1;
					a = gen.nextInt() % 200;
					b = Math.abs(gen.nextInt() % 200);
					c = Math.abs(gen.nextInt() % 200);
				}
				else if(guess!=total)
				{
					JOptionPane.showMessageDialog(null,"Sorry! You didn't get the right answer!");
					a = gen.nextInt() % 200;
					b = Math.abs(gen.nextInt() % 200);
					c = Math.abs(gen.nextInt() % 200);
					questionsAsked+=1;
				}
			}
			
		}
		
		else if(userChoice.equals(choices[1])) // if statement for choosing subtraction
		{
			a = gen.nextInt() % 200;
			b = Math.abs(gen.nextInt() % 200);
			c = Math.abs(gen.nextInt() % 200);
			for(questionsAsked=0;questionsAsked<NUMBER_OF_QUESTIONS;questionsAsked++)
			{
				userChoice = JOptionPane.showInputDialog("What is "+a+"-"+b+"-"+c);
				try
				{
					guess = Integer.parseInt(userChoice);
				}
				catch(NumberFormatException e)
				{
					JOptionPane.showMessageDialog(null,"Sorry! You entered the wrong number");
				}
				total = a-b-c;
				if(guess==total)
				{
					JOptionPane.showMessageDialog(null,"Congratulations! You got the answer! It was "+total);
					score+=1;
				}
				else if(guess!=total)
				{
					JOptionPane.showMessageDialog(null,"Sorry! You didn't get the right answer!");
					a = gen.nextInt() % 200;
					b = Math.abs(gen.nextInt() % 200);
					c = Math.abs(gen.nextInt() % 200);
					questionsAsked+=1;
				}
			}
		}
		
		else if(userChoice.equals(choices[2]))
		{
			a = Math.abs(gen.nextInt() % 10);
			b = Math.abs(gen.nextInt() % 10);
			for(questionsAsked=0;questionsAsked<NUMBER_OF_QUESTIONS;questionsAsked++)
			{
				userChoice = JOptionPane.showInputDialog("What is "+a+"*"+b);
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
					questionsAsked+=1;
				}
				else if(guess!=total)
				{
					JOptionPane.showMessageDialog(null,"Sorry! You didn't get the right answer!");
					a = Math.abs(gen.nextInt() % 10);
					b = Math.abs(gen.nextInt() % 10);
					questionsAsked+=1;
				}
			}
		}
		
		else if(userChoice.equals(choices[3]))
		{
			a = Math.abs(gen.nextInt() % 10);
			b = Math.abs(gen.nextInt() % 10);
			for(questionsAsked=0;questionsAsked<NUMBER_OF_QUESTIONS;questionsAsked++)
			{
				userChoice = JOptionPane.showInputDialog("What is "+a+"/"+b);
				try
				{
					guess = Integer.parseInt(userChoice);
				}
				catch(NumberFormatException e)
				{
					JOptionPane.showMessageDialog(null,"Sorry! You entered the wrong number");
				}
				
				total = a/b;
				if(guess==total)
				{
					JOptionPane.showMessageDialog(null,"Congratulations! You got the answer! It was "+total);
					score+=1;
					a = Math.abs(gen.nextInt()+1 % 10);
					b = Math.abs(gen.nextInt()+1 % 10);
					questionsAsked+=1;
				}
				else if(guess!=total)
				{
					JOptionPane.showMessageDialog(null,"Sorry! You didn't get the right answer!");
					a = Math.abs(gen.nextInt()+1 % 10);
					b = Math.abs(gen.nextInt()+1 % 10);
					questionsAsked+=1;
				}
			}
		}
		
		
		
		
	}

}
