import javax.swing.JOptionPane;

public class Bankteller {
	
	/* 
	 * ∂ɞ
	 */
	public static int pin;
	public static String input;
	public static void welcome()
	{
		JOptionPane.showMessageDialog(null,"Welcome to the Bank of Toontown ∂");
	}
	
	public static int getPin(int pin)
	{
		boolean invalid_format = true;
		while(invalid_format)
		{
			input = JOptionPane.showInputDialog("Please enter your pin");
			try
			{
				pin = Integer.parseInt(input);
				invalid_format = false;
			}
			catch(NumberFormatException e)
			{
				JOptionPane.showMessageDialog(null,"Sorry you entered an invalid format for the pin");
			}
			
		}
		return pin;
	}
	
	public static void main(String[] a)
	{
		welcome();
		pin = getPin(pin);
		
	}
}
