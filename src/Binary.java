/*Program:Binary
1.  What important information goes here?  Be specific!


*/
//2.  Where do I go to find out what I have to import?
// Check the API online
import javax.swing.JOptionPane;
import java.util.Random;
//3.  What does the name of my program have to be for this?
// Binary.java ( what it's saved as ) 
public class Binary
{
   public static void main(String[] args)
   { 
      final int DIGITS = 8;
      final int BASE = 10; // This is what you change to change the base-n where n is the value assigned. question #10
      Random generator = new Random();
      int Base10Value=0,InputAnswer = 0;
      int[] Number = new int[DIGITS];
      String BinaryOutput="",Answer,AnswerHint="";
      boolean TryAgain = true; 
      boolean got_it_wrong = false;     
   
   
      while( TryAgain){
      
      
      // 3.  Comment each of the following 7 lines of code does, starting with
      //     the if statement!
      
         if(!got_it_wrong) //If got_it_wrong is FALSE
         { // Then do this below
         //4.  Why am I initializing here and above? Is it necessary?
        	 // Initializing here allows it to be more versatile and compatible if someone decides to change the values
            AnswerHint = " "; //Set AnswerHint to essentially nothing
            Base10Value = 0; //Set Base10Value to 0
            BinaryOutput = ""; //Set BinaryOutput to nothing
            for(int i = 0; i < DIGITS; i++) //Until i is less than DIGITS, do the following
            {
               Number[i] = Math.abs(generator.nextInt(BASE)); //The point in the list Number of i is the absolute number generated from 0 to (BASE - 1)
               BinaryOutput += Integer.toString(Number[i]); //Set BinaryOutput to the string position of i in Number
               Base10Value += Number[i]*Math.pow(BASE,DIGITS-1-i); //Adds to the end of Base10Value: point of i in Number multiplied by BASE to the power of DIGITS-1-i
               AnswerHint += (Number[i]*Math.pow(BASE,DIGITS-1-i) + " "); //Basically the same as above but used at the end for when they get the answer right.
            
               if(i < Number.length-1) AnswerHint += " + ";
            }
         }
      // 5.  What happens if the user gets it wrong?
      // If the number is too small, tell them it's too small, if too big, tell them it's too big, and ask again.
      //6.  What value will BinaryOutput, Base10Value, and AnswerHint have in it at this point?
      //    make sure to specify what it depends on.
      System.out.println(BinaryOutput); // The randomly generated binary number (in my case it was 01001011)
      System.out.println(Base10Value); // Turns BinaryOutput into the Base10Value, which is 75 in my case
      System.out.println(AnswerHint); // Displays a helpful tip when they get it correct (in my case, 0+64+0+0+8+0+2+1)
      // Remember to remove these for when you're done testing!!!
      
      
         Answer = JOptionPane.showInputDialog(null,"Give the base 10 form of " + BinaryOutput);
      
         //7.  What does this try...catch statement do?
         //If you don't enter a number that's a double, it will throw NumberFormatException and send the catch statement
         try{
            InputAnswer = Integer.parseInt(Answer);
         }
         catch(NumberFormatException numberFormatException)
         {
            JOptionPane.showMessageDialog(null, "You must enter a base 10 number for the answer.", "ERROR", JOptionPane.ERROR_MESSAGE);
         }
         
         
         if(InputAnswer < Base10Value)
         {
            got_it_wrong = true;
            JOptionPane.showMessageDialog(null, "Your number is too small, try again");
         }
         else if(InputAnswer > Base10Value)
         {
            got_it_wrong = true;
            JOptionPane.showMessageDialog(null, "Your number is too big, try again");
         }
         else
         {
            got_it_wrong = false;
            Answer = JOptionPane.showInputDialog(null, "Your answer is correct! Because " + " \n " 
               + AnswerHint + " = " + Base10Value + "\nWould you like to try again? (enter yes or no): ");
            Answer = Answer.toLowerCase();
            if(Answer.equals("yes"))
               TryAgain = true;
            else TryAgain = false;
         }
         
         
         
      }//end while
      
      JOptionPane.showMessageDialog(null, "Thank you for playing the binary number quiz.  I hope it was educational!");
   
   }
   
 
   
}
//8.  What does this program do - be very specific.
// Generate 8 random numbers between 0,1
// Assign a point in the list Number by i
// Calculate the total of Number[] by using Base10Value and BinaryOutput
// Try/Catch for entering a number, and an IF statement until they get it right.


//9.  What is the advantage to using final int (constants) for DIGITS and BASE?
//Allow for compatibility


//10.  What would you have to do to change this program so that it gives a
//     base 8 number that the user has to convert to base 10?
// line 19