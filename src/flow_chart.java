import javax.swing.*;

public class flow_chart {

	public static void main(String[] a)
	{
		String input;
		int n;
		input = JOptionPane.showInputDialog("Enter an integer");
		
		try
		{
			n = Integer.parseInt(input);
			if(n % 2 == 0)
			{
				if(n % 3 == 0)
				{
					JOptionPane.showMessageDialog(null,n+" is a multiple of 6.");
				}
				else
				{
					JOptionPane.showMessageDialog(null,n+" is even.");
				}
			}
			else
			{
				JOptionPane.showMessageDialog(null,n+" is odd.");
			}
		}
		catch(NumberFormatException error)
		{
			JOptionPane.showMessageDialog(null,"You must enter an integer.");
		}
	}
}
