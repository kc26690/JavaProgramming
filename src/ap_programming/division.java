package ap_programming;
import java.util.Random;
import javax.swing.JOptionPane;
public class division {

	public static final int STARTING_NUMBER = 1;
	public static final int ENDING_NUMBER = 100;
	public static Random gen = new Random();
	
	/* Method: generateNumerator
	 * Arguments: None
	 * Return: numerator
	 */
	public static int generateNumerator()
	{
		int numerator = (Math.abs(gen.nextInt()%ENDING_NUMBER) + STARTING_NUMBER);
		return numerator;
	}
	
	
	/* Method: generateDenominator
	 * Arguments: None
	 * Return: denominator
	 */
	public static int generateDenominator()
	{
		int denominator = (Math.abs(gen.nextInt()%ENDING_NUMBER)+STARTING_NUMBER);
		return denominator;
	}
	
	
	/* Method: gcf (greatest common factor)
	 * Arguments: a, b
	 * Return: b, a%b
	 */
	public static int gcf(int a,int b)
	{
		if(b==0)
			return a;
		return gcf(b,a%b);
	}
	
	public static void main(String[] args) {
		// Initialization of variables
		int num = generateNumerator();
		int den = generateDenominator();
		int whole;
		int old_num=0;
		int old_den=0;
		old_num = num;
		old_den = den;
		int gcf = gcf(num, den);
		
		
		whole=num/den;
		num%=den;
		num/=gcf;
		den/=gcf;
		
		
		//Output to JOptionPane with if's to not show useless fractions/wholes
		if(whole == 0)
		{	
			JOptionPane.showMessageDialog(null,"The answer to "+old_num+"/"+old_den+" is "+num+"/"+den);
		}
		else if(num == 0 || den == 0)
		{
			JOptionPane.showMessageDialog(null,"The answer to "+old_num+"/"+old_den+" is "+whole);
		}
		else
		{
			JOptionPane.showMessageDialog(null,"The answer to "+old_num+"/"+old_den+" is "+whole+" "+num+"/"+den);
		}
	}
	
}
