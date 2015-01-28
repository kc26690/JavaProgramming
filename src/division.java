import java.math.*;
import java.util.Random;
import javax.swing.JOptionPane;
import java.lang.Number;
public class division {

	public static void main(String[] args) {
		// Initialization of variables
		Random gen = new Random();
		int num = 0;
		int den = 0;
		int whole;
		int rem_num=0;
		int rem_den=0;
		final int ENDING_NUMBER = 100;
		final int STARTING_NUMBER = 1;
		
		// Generating numbers, includes a set of if statements to generate a new number while numerator and denominator are either 0
		num = (Math.abs(gen.nextInt()%ENDING_NUMBER) + STARTING_NUMBER);
		den = (Math.abs(gen.nextInt()%ENDING_NUMBER) + STARTING_NUMBER);
		
		//Comparing the numerator and denominator
		
		whole = num/den;
		//Output testing
		System.out.println(num);
		System.out.println(den);
		System.out.println("The answer to "+num+"/"+den+" is ");
	}
	
}
