import javax.swing.*;
/* Programmer: Cameron Kurtz
 * Program: artificial_intelligence
 * Purpose: The purpose of this program is to allow the user to answer a few questions and it'll be able to tell them what type
 * of school subject they are.
 */

public class artificial_intelligence {

	public static void main(String[] args) {
		String result="You are the ";
		String play="";
		int question1,question2,question3;
		
		//Ask if user wants to play quiz...
		play = JOptionPane.showInputDialog(null,"Do you want to play my game?");
		play = play.toLowerCase();
		
		//If statement if they choose yes
		if(play.equals("yes"))
		{
		question1 = JOptionPane.showConfirmDialog(null,"Do you often wonder about things that you don't fully understand?","Question 1",JOptionPane.YES_NO_OPTION);
		question2 = JOptionPane.showConfirmDialog(null,"Do you frequently write in your free time?","Question 2",JOptionPane.YES_NO_OPTION);
		question3 = JOptionPane.showConfirmDialog(null,"Do you ever wonder how many watermelons you could buy if\n doughnuts were on sale last week?","Question 3",JOptionPane.YES_NO_OPTION);
		
		
		if(question1==1 && question2==1 && question3==1)
		{
			JOptionPane.showMessageDialog(null, "You didn't say yes to at least one of the questions!");
			System.exit(0);
		}
		
		if(question1==0)
		{
			if(question2==0)
			{
				
				if(question3==0)
				{
					result+="Science, English, and Math class!";
				}
				else
				result+="Science and English class!";
				
			}
			else
			{
				
				if(question3==0)
				{
					result+="Science and Math class!";
				}
				else
				result+="Science class!";
				
			}
			
		}
		else
		{
			if(question2==0)
			{
				if(question3==0)
				{
					result+="English and Math class!";
				}
				else
				result+="English class!";
			}
			else
			{
				if(question3==0)
				{
					result+="Math class!";
				}
			}
		}
		JOptionPane.showMessageDialog(null,result);
		}
		else
		{
			JOptionPane.showMessageDialog(null,"Your loss! :(");
		}
	}

}
