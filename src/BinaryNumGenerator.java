import java.util.Random;
import javax.swing.JOptionPane;

public class BinaryNumGenerator {

	public static void main(String[] args) {
		// Set up automatic generation for a list
		String input;
		Random gen = new Random();
		int i;
		int guess=-1;
		String binary_toString="";
		int[] binary = {0,0,0,0,0,0,0,0}; // Initial list of binary with placeholders
		int total = 0;
		
		for(i=0; i < binary.length; i++)
		{
			binary[i] = gen.nextInt(2); // Generates 8 numbers between 0-1			
		}
	
		for(i=0; i < binary.length; i++)
		{
			if(binary[i]==1)
			{
				total+=Math.pow(2,7-i);
			}
		
		}
		
		for(i=0; i < binary.length; i++)
		{
			binary_toString += binary[i];
		}
		//Finish Input and comparison
		System.out.println(total);
		input = JOptionPane.showInputDialog("Guess what number this is: "+binary_toString);
		try
		{
			guess = Integer.parseInt(input);
		}
		catch(NumberFormatException error)
		{
			JOptionPane.showMessageDialog(null,"You must enter an integer");
		}
		
		
		while(guess!=total)
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
		
		if(guess==total)
		{
			JOptionPane.showMessageDialog(null,"You win!");
		}
	}

}
