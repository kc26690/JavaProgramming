// Program Average1.java
// Programmer:  Lori Hunt
// This program will find the average of grades put in.  There
// will be a specified number of Students.
// Class average program with counter-controlled repetition.  In other 
// words, it uses a 
// for loop = YOU KNOW AHEAD OF TIME HOW MANY TIMES YOU HAVE TO DO SOMETHING.

// Java extension packages
import javax.swing.JOptionPane;

public class average_for {

   // main method begins execution of Java application
   public static void main( String args[] ) 
   {
	  String input;
      int[][] students = new int[5][3];
      int total=0,
      	totalStudent1=0,
      	totalStudent2=0,
      	totalStudent3=0,
      	totalStudent4=0,
      	totalStudent5=0,
      	averageStudent1=0,
      	averageStudent2=0,
      	averageStudent3=0,
      	averageStudent4=0,
      	averageStudent5=0;
      
      int row=0,
      	column = 0;
      
      for(row = 0; row < 5; row++)
      {
    	  
    	  for(column = 0; column < 3; column++)
    	  {
    		  input = JOptionPane.showInputDialog("Enter your test score for test number (You only get 3 tests to enter!): "+(column+1));
    		  students[row][column] = Integer.parseInt(input);
    		  total += students[row][column];
    		  
    	  }//End nested for
      }//End first for
      
      
      totalStudent1 += students[0][0]+students[0][1]+students[0][2];
      totalStudent2 += students[1][0]+students[1][1]+students[1][2];
      totalStudent3 += students[2][0]+students[2][1]+students[2][2];
      totalStudent4 += students[3][0]+students[3][1]+students[3][2];
      totalStudent5 += students[4][0]+students[4][1]+students[4][2];
      averageStudent1 = totalStudent1 / 3;
      
      
   }  // end method main

}  // end class Average_for

/* Questions and stuff to do...

1.  What is the most amount of grades the teacher can enter?
	5 grades.

2.  What information would be helpful to the user?
	What is the purpose of this program? The purpose is in the beginning but if this was compiled, they wouldn't see it.
	
3.  Is the average being calculated correctly?  If not,
		fix it.     
      
4.  Write a program (or change this one) that will allow 5 students to each
    enter 3 grades.

5.  
*/