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
      int total,              // sum of grades input by user
          gradeCounter,       // number of grades entered
          gradeValue = 0,     // grade value
          average;            // average of all grades
      String grade;           // grade typed by user
   	final int NumStudents = 5;
   	  total = 0;              // clear total
      gradeCounter = 0;       // prepare to loop
   
      // for each Student, read in the score and accumulate the total
     for(gradeCounter = 0; gradeCounter < NumStudents; gradeCounter++) 
     {  // loop 5 times

         // prompt for input and read grade from user
         grade = JOptionPane.showInputDialog("Enter integer grade:  " );
         
         // convert grade from a String to an integer
         gradeValue = Integer.parseInt( grade );

         // add gradeValue to total - notice that total had to be initialized
         total = total + gradeValue;  

        
      }  // end for structure
   
      
      average = total / gradeCounter;  // perform integer division to get the average

      // display average of exam grades
      JOptionPane.showMessageDialog( null, "Class average is " + average, "Class Average",
         JOptionPane.INFORMATION_MESSAGE );

       
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