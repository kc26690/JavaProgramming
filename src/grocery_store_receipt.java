/*	Programmer: Cameron Kurtz
 * 	Program: grocery_store_receipt
 * 	Purpose: Because we have been working on Java API's and Arithmetic in Java, the owner of the WIDGIT 
 * appliance store has asked us to write a program that will allow tellers to enter a customer order and 
 * receive a receipt for the purchase made. This company only sells two products: widgets ($12.75 each) and 
 * gidgets ($23.25 each). Sales Tax in the state in which the widget/gidget store resides, is 5.5%. The 
 * receipt should contain the date of the transaction.
 */

import javax.swing.JOptionPane;
import java.text.*;
import java.util.Date;
import java.util.Locale;

public class grocery_store_receipt {

	public static void main(String[] args) {
		//Assign variables for products sold and tax amount
		String input;
		double widgetsCost=0,gidgetsCost=0,taxTotal,amountPaid=0,changeOwed=0;
		double total;
		final double widgetPrice=12.75,gidgetPrice=23.25;
		int widgets=0,gidgets=0;
		final double tax=0.055;
		Date dNow = new Date();
		SimpleDateFormat dateFormat = new SimpleDateFormat("EEEEEEEE, MM/dd/yyy");
		//Ask the user how many widgets/gidgets they want to order
		input = JOptionPane.showInputDialog(null,"Enter the amount of widgets you would like to order:");
		try{
			widgets = Integer.parseInt(input);
		}
		catch (NumberFormatException error){
			JOptionPane.showMessageDialog(null,"You must enter a number");
		}
		
		input = JOptionPane.showInputDialog(null,"Enter the amount of gidgets you would like to order:");
		try{
			gidgets = Integer.parseInt(input);
		}
		catch (NumberFormatException error){
			JOptionPane.showMessageDialog(null,"You must enter a number");
		}
		
		//Multiply the amount entered by the cost of each item
		widgetsCost = widgets*widgetPrice;
		gidgetsCost = gidgets*gidgetPrice;
		System.out.println(widgetsCost+" "+gidgetsCost);
		//Assign a decimal and number format for currency
		NumberFormat money = NumberFormat.getCurrencyInstance(Locale.US);
		
		//Calculate the tax of each item, and add it to the total
		taxTotal = (widgetsCost+gidgetsCost)*tax;
		total = (taxTotal+widgetsCost+gidgetsCost);
		total = Math.round(total*100.0)/100.0;
		
		//Output the total cost of everything
		JOptionPane.showMessageDialog(null, "Today's date: "+dateFormat.format(dNow)+"\nThe total of your order:\n"
		+widgets+"x Widgets      @ $12.75 ea."+"      "+money.format(widgetsCost)+"\n"
		+gidgets+"x Gidgets 	     @ $23.25 ea."+"      "+money.format(gidgetsCost)+"\n"
		+"-----------------------------"+"\n"
		+"Tax: "+money.format(taxTotal)
		+"\nTotal: "+money.format(total));
		
		//Prompt user to enter amount to pay
		input = JOptionPane.showInputDialog(null,"Your total is: "+money.format(total)+"\nPlease enter the amount you wish to pay.");
		try{
			amountPaid = Double.parseDouble(input);
		} 
		catch (NumberFormatException error){
			JOptionPane.showMessageDialog(null,"You must enter a number");
		}
		
		
		//Conditionals for if you pay over, under, or exactly the total cost & say have a nice day once total = amountPaid
		if(amountPaid == total){
			System.out.println(total+" "+amountPaid);
			JOptionPane.showMessageDialog(null,"Thank you! Have a nice day!");
			System.exit(0);
		}
		
		while((amountPaid!=total) && (amountPaid < total))
			{
			System.out.println("Total: "+total);
			System.out.print("Amount Paid: "+amountPaid);
			total = (total-amountPaid);
			total = Math.round(total*100.0)/100.0;
			JOptionPane.showMessageDialog(null,"Amount still owed: "+money.format(total));
			input = JOptionPane.showInputDialog(null,"Your total is: "+money.format(total)+"\nPlease enter the amount you wish to pay.");
			try
			{
				amountPaid = Double.parseDouble(input);
			}
			catch (NumberFormatException error)
			{
				JOptionPane.showMessageDialog(null,"You must enter a number.");
			}
		}
		
		while((amountPaid > total) && (amountPaid != total))
		{
			
			changeOwed = (amountPaid-total);
			total=(total-amountPaid);
			total = Math.round(total*100.0)/100.0;
			JOptionPane.showMessageDialog(null, "Your change is: "+money.format(changeOwed));
			JOptionPane.showMessageDialog(null,"Thank you! Have a nice day!");
			System.exit(0);
			
		}
	}
}