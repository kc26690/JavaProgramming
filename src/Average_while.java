//  Program  Average2.java
//  Programmer:  Lori Hunt
//  Purpose:  Illustrates a sentinal-controlled program. It will allow
//   the user to enter a whole bunch of grades and calculate the average of those grades
//  Class average program with sentinel-controlled repetition.
//  In other words, it uses a while loop = YOU DON'T KNOW AHEAD 
//  OF TIME HOW MANY TIMES YOU HAVE TO DO SOMETHING.
import java.text.DecimalFormat;
import javax.swing.JOptionPane;

public class Average_while {

   // main method begins execution of Java application
   public static void main( String args[] )
   {
      int gradeCounter,  // number of grades entered
          gradeValue,    // grade value
          total;         // sum of grades
      double average;    // average of all grades
      String input;      // grade typed by user
		 DecimalFormat twoDigits = new DecimalFormat( "0.00" );

      // Initialization phase
      total = 0;         // clear total
      gradeCounter = 0;  // prepare to loop
      
      // Processing phase
      // prompt for input and read grade from user
      input = JOptionPane.showInputDialog("Enter Integer Grade, -1 to Quit:" );

      // convert grade from a String to an integer
      gradeValue = Integer.parseInt( input );

      while ( gradeValue != -1 )	// -1 is considered the sentinel. 
											// the assumption is that -1 will
											// never be entered for 'gradeValue' 
		{

         // add gradeValue to total
         total = total + gradeValue;

         // add 1 to gradeCounter
         gradeCounter++;

         // prompt for input and read grade from user
         input = JOptionPane.showInputDialog( "Enter Integer Grade, -1 to Quit:" );

         // convert grade from a String to an integer
         gradeValue = Integer.parseInt( input );
      }

        
      if ( gradeCounter != 0 )
		{
         average = (double) total / gradeCounter;  

         // display average of exam grades
         JOptionPane.showMessageDialog( null,"Class average is " + twoDigits.format( average ));
      }
      else
         JOptionPane.showMessageDialog( null,"No grades were entered", "Class Average",
            JOptionPane.INFORMATION_MESSAGE );

   }  // end method main

}  // end class Average_while

/*  Questions & stuff

1.  What does this program do?

2.  What is the 'sentinel' being used.

3.  Can this teacher enter a negative grade? Is this realistic?

4.  Can this teacher enter decimals? Is this realistic?

5.  Is the average very accurate? How do you know?

6.  What happens in this program if no grades are entered?

7.  Write code in this program that will allow the teacher to keep track of the
    highest score. Then print out the highest score along with the class average.
    
8.  What are the similarities and differences between for and while loops?
*/