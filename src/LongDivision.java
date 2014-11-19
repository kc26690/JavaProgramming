/*	Program: Long Division
 * 	Creator: Cameron K.
 * 	Purpose: To calculate the quotient and remainder of two integers.
 * 	
 */
import javax.swing.JOptionPane;
import java.math.*;
import java.util.Random;

@SuppressWarnings("unused")
public class LongDivision {
	public static void main(String[] a)
	{
		String input1,input2;
		int numOne, numTwo;
		int quotient;
		int remainder;
		
		//Generate Numbers
		Random generator = new Random();
		numOne = Math.abs((generator.nextInt() % 100) + 10);
		numTwo = Math.abs((generator.nextInt() % 10) + 1);
		//Calculate numbers
		quotient = (numOne/numTwo);
		remainder = (numOne % numTwo);
		//Print generated number problem for debug
		System.out.println(numOne);
		System.out.println(numTwo);
		//Give answer in nice and neat format
		JOptionPane.showMessageDialog(null,"Randomly generated number problem:\n"+numOne+"/"+numTwo+"\nHit OK "
				+ "to see the answer");
		JOptionPane.showMessageDialog(null, "Answer to "+numOne+"/"+numTwo+":\nQuotient: "+quotient+"\nRemainder: "
				+remainder);
	}
}
