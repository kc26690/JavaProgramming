//Program: Selection
//Programmer: Lori Hunt
// Purpose: This program illustrates relational operators, boolean expressions, flags and if/if...else 
// statements.
import javax.swing.*;
@SuppressWarnings("unused")
public class Selection
{
   public static void main(String[] args)
   {
	   	 boolean flag = true; //flags are used to indicate to your program whether some even has happened 
                              // or not.
         String input;
         String Middle_School = "Kromrey";
         String answer = "yes";  //Strings work differently than numbers when making comparisons.
         int first_number, second_number;
         
         
         answer = JOptionPane.showInputDialog(null, "Would you like to play my silly little game (yes or no)? ");
         answer = answer.toLowerCase(); //No matter what case the user enters in, it will be made all
                                       // lower case.
         if (answer.equals("yes"))
         {
            input = JOptionPane.showInputDialog(null,"Good!  Do you live in Middleton (yes or no)?");
            if(input.equals("yes"))
            {
               input = JOptionPane.showInputDialog(null, "Have you lived in Middleton for more than 7 years?");
               if(input.equals("no")) flag = false;
            }
            else
            {
               input = JOptionPane.showInputDialog(null,"Good!  Do you live in Cross Plains (yes or no)?");
               if(input.equals("yes")) Middle_School = "Glacier Creek";
               else if(input.equals("no")) flag=false;
               
            }
            if (flag == false)
            {
               input = JOptionPane.showInputDialog(null, "Were you home schooled?");
               if(input.equals("yes"))
                  Middle_School = "Home";
               else Middle_School = "a place outside of this district";
           }
         }
         else 
         {
            JOptionPane.showMessageDialog(null, "Your loss!!");
            System.exit(0);
         }
      JOptionPane.showMessageDialog(null,"I figured it out!\n" + "You went to school at " + Middle_School 
                                    + " before you were here!!");
   
   }


}

/*
1.  Does this program work under every circumstance?
	No, if you don't enter either yes or no, it will default to the answer being false, so you won't get accurate information.
	
2.  Make a flow chart that describes this program
	
3.  What am I using the variable 'flag' for?
	If you haven't lived in Middleton for 7 years or more, you will turn the flag to false, which then prompts you whether or not you were homeschooled, because
	you probably didn't go to a middle school in this district.
	
4.  Try taking out a set of brackets (or more than one set if you
    feel adventurous).  Describe what was happening before and what
    is happening now.  Are brackets ALWAYS being used with if and else
    statements?  Are there ANY exceptions?
	Brackets are required in order to keep things streamlined. A way that it doesn't use them is if it's directly after the if statement, it will read that and
	but you need a bracket at the end of that statement or it won't work.
*/