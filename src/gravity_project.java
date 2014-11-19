import javax.swing.*;
public class gravity_project {

	public static void main(String[] args) {
		//Declare variables of gravity on the 9 planets
		String planet, input;
		int choice=1;
		int weight=0;
		double result=0;
		double gravity=1;
		
		//Prompt user to enter a number between 1 and 9 to choose which planet to use later for multiplication
		planet = JOptionPane.showInputDialog(null,"Choose a planet from this list:\n"
				+ "1. Earth\n"
				+ "2. Jupiter\n"
				+ "3. Mars\n"
				+ "4. Mercury\n"
				+ "5. Neptune\n"
				+ "6. Pluto\n"
				+ "7. Saturn\n"
				+ "8. Uranus\n"
				+ "9. Venus");
		try{
			choice = Integer.parseInt(planet);
		}
		catch(NumberFormatException error)
		{
			JOptionPane.showMessageDialog(null,"An illegal input was detected! You must use an integer");
		}
		if(choice>9 || choice<1) //If statement to check to see if they entered a number between 1 and 9, if it's outside of these bounds
		{ 						 //assume they chose Earth
			JOptionPane.showMessageDialog(null, "You didn't enter a number between 1 and 9, the program will now calculate your weight"
					+ "as if you were on Earth.");
			input = JOptionPane.showInputDialog(null,"Enter your weight in pounds (lbs.)");
			try{
				weight = Integer.parseInt(input);
			}
			catch(NumberFormatException error)
			{
				JOptionPane.showMessageDialog(null,"You must enter an integer for your weight");
			}
			result = weight*gravity;
			JOptionPane.showMessageDialog(null,"Your weight is: "+result+" on Earth");
			System.exit(0);
		}
		else
		{
			input = JOptionPane.showInputDialog(null,"Enter your weight in pounds (lbs.)");
			try{
				weight = Integer.parseInt(input);
			}
			catch(NumberFormatException error)
			{
				JOptionPane.showMessageDialog(null,"You must enter an integer for your weight");
			}
			JOptionPane.showMessageDialog(null,"The program will now calculate your weight by the gravity of the planet you chose.");
		}

		switch(choice){ //Switch statement for the choice of planets
			case 1: gravity=1;
				planet="Earth";
				break;
			case 2: gravity=2.65;
				planet="Jupiter";
				break;
			case 3: gravity=0.39;
				planet="Mars";
				break;
			case 4: gravity=0.38;
				planet="Mercury";
				break;
			case 5: gravity=1.23;
				planet="Neptune";
				break;
			case 6: gravity=0.05;
				planet="Pluto";
				break;
			case 7: gravity=1.17;
				planet="Saturn";
				break;
			case 8:	gravity=1.05;
				planet="Uranus";
				break;
			case 9: gravity=0.78;
				planet="Venus";
				break;
			default: gravity=1;
				break;
		}
		
		result=weight*gravity;
		result=(result*100.0)/100.0;
		JOptionPane.showMessageDialog(null,"Your weight is: "+result+"lbs. on "+planet);
	}

}
