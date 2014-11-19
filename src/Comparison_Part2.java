// Programmer:  Lori Hunt
// Program:  Comparison.java
// Purpose:  Compare integers using if structures, relational operators 
// and equality operators.  This program will illustrate if
// statements and how/when to use if-else.  Also illustrates
// the purpose of braces.
    
    import javax.swing.JOptionPane;
	     
    public class Comparison_Part2 {
    
      // main method begins execution of Java application
      public static void main( String args[] )
      {
		int firstNumber;          // first number to compare
 	   int secondNumber;          // second number to compare
  	   String NumOne, NumTwo, result = " ";
		String aWord = "Friends";

         // read first number from user as a string
        NumOne = JOptionPane.showInputDialog("Enter first integer: ");
		  firstNumber = Integer.parseInt(NumOne);   
         // read second number from user as a string
 			NumTwo = JOptionPane.showInputDialog("Enter another integer: ");  
	      secondNumber = Integer.parseInt(NumTwo);
          
			 
			 	if ( firstNumber == secondNumber )
    	        result = firstNumber + " == " + secondNumber;
   
         	if ( firstNumber != secondNumber )
         	{
         		result = firstNumber + " != " + secondNumber;
         		if ( firstNumber < secondNumber )
         			result =  firstNumber + " < " + secondNumber;
   
        		if ( firstNumber > secondNumber )
        			result = firstNumber + " > " + secondNumber;
         	
        		if ( firstNumber <= secondNumber )
        			result = firstNumber + " <= " + secondNumber;
   
        		if ( firstNumber >= secondNumber )
        			result = firstNumber + " >= " +secondNumber;
         	}
            
			if(aWord.equals("Friend"))
				result = aWord + " = " + "Friend";
   
         // Display results
         JOptionPane.showMessageDialog(
			null,result,"Comparison Results",JOptionPane.INFORMATION_MESSAGE);
   
           
      }  // end method main
   
   }  // end class Comparison

   /*Questions
	
	1.  What happens if you put in 90 and 23?  Will all of the messages show
		 up that would be appropriate for that?
		 
	2.  Change this program so that ALL of the appropriate messages will
		show up - for example:  If you enter 87 and 15 you will get three
		messages because 87 > 15, 87 >= 15, and 87 != 15.
		
	3.  Print out a message that states whether the numbers 
		entered were even or odd.  Hint:  Make use of %
      
   4.  Can the > or < operators be used with Strings?  What happens when you try?
       What is being compared?
   
   
	*/
	  
            
