import javax.swing.*;
/* Programmer: Cameron Kurtz
 * Program: artificial_intelligence
 * Purpose: The purpose of this program is to allow the user to answer a few questions and it'll be able to tell them what type
 * of school subject they are.
 */

public class artificial_intelligence {

	public static void main(String[] args) {
		String result="";
		int question1,question2,question3;
		question1 = JOptionPane.showConfirmDialog(null,"Do you often wonder about things that you don't fully understand?","Question 1",JOptionPane.YES_NO_OPTION);
		question2 = JOptionPane.showConfirmDialog(null,"Do you frequently write in your free time?","Question 2",JOptionPane.YES_NO_OPTION);
		question3 = JOptionPane.showConfirmDialog(null,"Do you sometimes think of your past mistakes?","Question 3",JOptionPane.YES_NO_OPTION);
		if(question1==0)
		{
			result += "You are the Science class!";
		}
		if(question2==0)
		{
			result += "\nYou are the English class!";
		}
		if(question3==0)
		{
			result += "\nYou are the History class!";
		}
		if(result.equals(""))
		{
			JOptionPane.showMessageDialog(null, "You didn't say yes to at least one of the questions!");
		}
		JOptionPane.showMessageDialog(null,result);
	}

}
