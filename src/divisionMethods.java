import java.util.Random;

public class divisionMethods {


	/**
	 * @param args
	 */
	static int numerator = 0;
	static int denominator = 0;
	static final int ENDING_NUMBER = 100;
	static final int STARTING_NUMBER = 1;
	
	public static int genNumDen(int numerator, int denominator)
	{
		Random generate = new Random();
		boolean isZero = true;
		while(isZero)
		{
			if(numerator == 0 || denominator == 0)
			{
				numerator = Math.abs(generate.nextInt()%ENDING_NUMBER)+STARTING_NUMBER;
				denominator = Math.abs(generate.nextInt()%ENDING_NUMBER)+STARTING_NUMBER;
			}
			else
			{
				numerator = Math.abs(generate.nextInt()%ENDING_NUMBER)+STARTING_NUMBER;
				denominator = Math.abs(generate.nextInt()%ENDING_NUMBER)+STARTING_NUMBER;
				isZero = false;
			}
		}
		return numerator;
	}
	
	public static int greatestCommonFactor(int a, int b)
	{
		if(b==0)
			return a;
		return greatestCommonFactor(b,a%b);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(numerator);
		
		
	}

}
