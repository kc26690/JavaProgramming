package ap_programming;

import java.util.ArrayList;

import javax.swing.JOptionPane;
public class Bank_Teller {

	public static String pinAsString;
	public static int pin;
	public static int balance;
	public static int getPin(int pin)
	{
		boolean wrong_pin = true;
		while(wrong_pin)
		pinAsString = JOptionPane.showInputDialog("Please enter your Personal Identification Number (PIN): ");
		try
		{
			pin = Integer.parseInt(pinAsString);
			wrong_pin = false;
		}
		catch(NumberFormatException e)
		{
			JOptionPane.showMessageDialog(null,"I'm sorry, but it appears that you have not entered a number as your pin");
		}
		
		return pin;
	}
	public static int getBalance(int balance)
	{
	}
	
	public static void main(String[] args) {

	}

}
