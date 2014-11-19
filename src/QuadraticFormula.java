/*	Programmer: Cameron K.
 *	Program: QuadraticFormula
 *
 *	Purpose: Because we have been working on Arithmetic in Java, you realize that you no longer have to 
 *plug a, b, and c in to that hugely long quadratic formula anymore!  You can just have your computer do the 
 *grunt work for you!! Write a program that you can use to solve for x when quadratic equations are given in 
 *the form: 0 = ax^2 + bx + c. 
 */

import javax.swing.JOptionPane;
import java.math.*;

@SuppressWarnings("unused")
public class QuadraticFormula {
	public static void main(String[] args)
	{
		//Declaring variables
		String input;
		double Ax=0,Bx=0,C=0,SumSqrt,Eq;
		double xPos,xNeg;
		double resultPos=0,resultNeg=0;
		
		//Prompt user to input variables
		input = JOptionPane.showInputDialog(null,"Enter your value for A");
		try
		{
			Ax = Double.parseDouble(input);
		}
		catch (NumberFormatException error)
		{
			JOptionPane.showMessageDialog(null, "You must enter a number");
		}
		
		input = JOptionPane.showInputDialog(null,"Enter your value for B");
		try
		{
			Bx = Double.parseDouble(input);	
		}
		catch (NumberFormatException error)
		{
			JOptionPane.showMessageDialog(null,"You must enter a number");
		}
		
		input = JOptionPane.showInputDialog(null,"Enter your value for C");
		try
		{
			C = Double.parseDouble(input);
		}
		catch (NumberFormatException error)
		{
			JOptionPane.showMessageDialog(null, "You must enter a number");
		}
		
		//Output the newly converted integer variables of Ax,Bx,C
		System.out.println("Value of A: "+Ax);
		System.out.println("Value of B: "+Bx);
		System.out.println("Value of C: "+C);
		
		//Calculate the sum under the square root & output SumSqrt for debug purposes
		SumSqrt = ((Bx*Bx)-4*Ax*C);
		System.out.println("Sum of the Square root is: "+SumSqrt);
		//Do an IF..THEN for when 0>SumSqrt to output an error, else calculate the positive and negative
		//value of the quadratic (split it to two separate equations)
		if (SumSqrt<0)
		{
			JOptionPane.showMessageDialog(null,"No real solution");
			System.exit(0);
		}
		else
		{
			xPos = (-Bx+(Math.sqrt(SumSqrt)))/(2*Ax);
			xNeg = (-Bx-(Math.sqrt(SumSqrt)))/(2*Ax);
			resultPos = (xPos);
			resultNeg = (xNeg);
		}
		
		//After calculating the answers, output the answers in a user-friendly text box
		JOptionPane.showMessageDialog(null,"You entered: A: "+Ax+" B: "+Bx+" C: "+C
				+"\nThe answer of these 3 numbers is:\n"+"X+: "+resultPos+"\nX-: "+resultNeg);
	}
}